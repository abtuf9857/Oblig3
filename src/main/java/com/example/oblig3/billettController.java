package com.example.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class billettController {

    @Autowired
    private billettRepository rep;


    @PostMapping("/lagre")
    public void lagreBillett(billett nybillett) {
        rep.lagreBillett(nybillett);
    }

    @GetMapping("/hentAlle")
    public List<billett> hentAlle() {
        return rep.hentAlle();

    }

    @PostMapping("/endre")
    public void endre(billett nybillett) {
        rep.endre(nybillett);
    }



    @GetMapping("/slett")
    public void slettbillett() {
        rep.slettAllebilletter();
    }
}


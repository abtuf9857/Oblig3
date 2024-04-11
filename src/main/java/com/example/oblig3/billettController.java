package com.example.oblig3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class billettController {


    private final List<billett> allebilletter = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreBillett(billett nybillett){
        allebilletter.add(nybillett);
    }
    @GetMapping("/slett")
    public void slettbillett(){
        allebilletter.clear();
    }

    @GetMapping("/hentAlle")
    public List <billett>hentAlle(billett nybillett) {
        return allebilletter;

    }
}

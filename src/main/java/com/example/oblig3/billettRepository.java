package com.example.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class billettRepository {

    @Autowired
    private JdbcTemplate db;

    public void endre(billett nybillett){
        String sql="UPDATE BILLETTER SET film=?," +
                "antall=?,fornavn=?,etternavn=?,telefonnr=?,epost=? WHERE id=?";
        var res = db.update(sql,nybillett.getFilm(),nybillett.getAntall(),nybillett.getFornavn(),nybillett.getEtternavn(),nybillett.getTelefonnr(),nybillett.getEpost(),nybillett.getId());
        System.out.println(res);
    }
    public void lagreBillett(billett nybillett) {
        String sql = "INSERT INTO BILLETTER (film,antall,fornavn,etternavn,telefonnr,epost) VALUES(?,?,?,?,?,?)";
        db.update(sql, nybillett.getFilm(),nybillett.getAntall(), nybillett.getFornavn(), nybillett.getEtternavn(), nybillett.getTelefonnr(), nybillett.getEpost());
    }

    public List<billett> hentAlle() {
        String sql = "SELECT * FROM BILLETTER";
        List<billett> allebilletter = db.query(sql, new BeanPropertyRowMapper<>(billett.class));
        return allebilletter;
    }

    public void slettAllebilletter() {
        String sql = "DELETE FROM BILLETTER";
        db.update(sql);
    }
}

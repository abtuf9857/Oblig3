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

    public void lagreBillett(billett nybillett) {
        String sql = "INSERT INTO BILLETTER (antall,fornavn,etternavn,epost)VALUES(?,?,?,?)";
        db.update(sql, nybillett.getAntall(), nybillett.getEpost(), nybillett.getEtternavn(), nybillett.getFornavn(), nybillett.getTelefonnr());
    }

    public List<billett> hentAlle() {
        String sql = "SELECT * FROM BILLETTER";
        List<billett> allebilletter = db.query(sql, new BeanPropertyRowMapper<>(billett.class));
        return allebilletter;
    }

    public void slettAllebilletter() {
        String sql = "DELETE FROM KUNDE";
        db.update(sql);
    }
}

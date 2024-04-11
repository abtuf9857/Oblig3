package com.example.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class billettRepository {

    @Autowired
    private JdbcTemplate db;

    public void lagreBillett(billett nybillett){
        String sql="Insert into"
    }
    public List<billett> hentAlle(billett nybillett){

    }
    public void slettbillett()
}

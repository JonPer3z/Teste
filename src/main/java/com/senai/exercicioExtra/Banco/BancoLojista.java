package com.senai.exercicioExtra.Banco;

import com.senai.exercicioExtra.Model.Lojista;

import java.util.ArrayList;
import java.util.List;

public class BancoLojista {
    private List<Lojista> lojistas;

    public BancoLojista(){
        this.lojistas = new ArrayList<>();
    }

    public void insert(Lojista lj){
        lojistas.add(lj);
    }
    public Lojista findOne(Long idLojista){
        for (Lojista lj : lojistas){
            if (lj.getIdLojista() == idLojista){
                return lj;
            }
        }
        return null;
    }
    public List<Lojista> findAll() {
        return new ArrayList<>(lojistas);
    }
}

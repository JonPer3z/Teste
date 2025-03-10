package com.senai.exercicioExtra.Controller;

import com.senai.exercicioExtra.Banco.BancoLojista;
import com.senai.exercicioExtra.Model.Lojista;

import java.util.List;

public class LojistaController {
    BancoLojista bl = new BancoLojista();



    public List<Lojista> pegarTodosOsLojistas() {
        return bl.findAll();
    }

    public void inserirNoBanco(Lojista lj) {
        bl.insert(lj);
    }
}

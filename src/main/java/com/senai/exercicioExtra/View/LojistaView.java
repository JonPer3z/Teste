package com.senai.exercicioExtra.View;

import com.senai.exercicioExtra.Controller.LojistaController;
import com.senai.exercicioExtra.Model.Lojista;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class LojistaView {
    LojistaController lc = new LojistaController();

    @GetMapping("/Lojista")
    public List<Lojista> getAllLojista(){
        return lc.pegarTodosOsLojistas();
    }

    @PostMapping("/Lojista")
    public String postNovoLojista(@RequestBody Lojista lj){
        lc.inserirNoBanco(lj);
        return "Sucesso";
    }
}

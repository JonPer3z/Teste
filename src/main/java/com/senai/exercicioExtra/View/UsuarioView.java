package com.senai.exercicioExtra.View;

import com.senai.exercicioExtra.Controller.UsuarioController;
import com.senai.exercicioExtra.Model.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioView {
    UsuarioController uc = new UsuarioController();

    @GetMapping("/Usuario")
    public List<Usuario> getAllUsuarios(){
        return uc.pegarTodosOsUsuarios();
    }
    @PostMapping("/Usuario")
    public String postNovoUsuario(@RequestBody Usuario usu){
        uc.inserirNoBanco(usu);
        return "Sucesso";
    }
}

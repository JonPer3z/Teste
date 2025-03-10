package com.senai.exercicioExtra.Controller;

import com.senai.exercicioExtra.Banco.BancoUsuario;
import com.senai.exercicioExtra.Model.Usuario;

import java.util.List;

public class UsuarioController {

    BancoUsuario bu = new BancoUsuario();

    public void inserirNoBanco(Usuario usu){
        bu.insert(usu);
    }

    public List<Usuario> pegarTodosOsUsuarios(){
        return bu.findAll();
    }
}

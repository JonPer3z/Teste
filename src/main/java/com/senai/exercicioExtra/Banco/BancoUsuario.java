package com.senai.exercicioExtra.Banco;

import com.senai.exercicioExtra.Model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class BancoUsuario {
    private List<Usuario> usuarios;

    public BancoUsuario(){
        this.usuarios = new ArrayList<>();
    }

    public void insert(Usuario usu) {
        usuarios.add(usu);
    }

    public Usuario findOne(Long idUsuario){
        for (Usuario usu : usuarios){
            if (usu.getIdUsuario() == idUsuario){
                return usu;
            }
        }
        return null;
    }

    public List<Usuario> findAll(){
        return new ArrayList<>(usuarios);
    }

}

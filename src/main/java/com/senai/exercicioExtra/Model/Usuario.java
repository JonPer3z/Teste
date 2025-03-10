package com.senai.exercicioExtra.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {
    private String nomeCompleto;
    private String CPF;
    private String email;
    private String senha;
}

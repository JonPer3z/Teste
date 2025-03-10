package com.senai.exercicioExtra.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Lojista {
    private Long IdLojista;
    private String nomeCompleto;
    private String CNPJ;
    private String email;
    private String senha;

}

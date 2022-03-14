package br.com.solondiego.aprendendospring.entities;

import lombok.Data;

@Data
public class PessoaDto {
    private Long id;
    private String nome;
    private int idade;
}

package br.com.solondiego.aprendendospring.service;

import br.com.solondiego.aprendendospring.entities.Pessoa;
import br.com.solondiego.aprendendospring.entities.PessoaCreateDto;
import br.com.solondiego.aprendendospring.entities.PessoaDto;

import java.util.Optional;

public interface PessoaService {

    PessoaDto salvarPessoa(PessoaCreateDto pessoaCreateDto);

    Optional<Pessoa> retornarUmaPessoa(Long id);
}

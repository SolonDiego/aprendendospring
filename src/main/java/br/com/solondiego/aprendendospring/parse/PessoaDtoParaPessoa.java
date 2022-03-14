package br.com.solondiego.aprendendospring.parse;

import br.com.solondiego.aprendendospring.entities.Pessoa;
import br.com.solondiego.aprendendospring.entities.PessoaCreateDto;
import org.springframework.stereotype.Component;

@Component
public class PessoaDtoParaPessoa {

    public Pessoa parse(PessoaCreateDto pessoaCreateDto){

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(pessoaCreateDto.getNome());
        pessoa.setIdade(pessoaCreateDto.getIdade());
        return pessoa;

    }
}

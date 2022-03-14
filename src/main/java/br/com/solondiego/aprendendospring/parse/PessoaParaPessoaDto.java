package br.com.solondiego.aprendendospring.parse;

import br.com.solondiego.aprendendospring.entities.Pessoa;
import br.com.solondiego.aprendendospring.entities.PessoaDto;
import org.springframework.stereotype.Component;

@Component
public class PessoaParaPessoaDto {

    public PessoaDto parse(Pessoa pessoa){

        PessoaDto pessoaDto = new PessoaDto();
        pessoaDto.setId(pessoa.getId());
        pessoaDto.setNome(pessoa.getNome());
        pessoaDto.setIdade(pessoa.getIdade());

        return pessoaDto;
    }
}

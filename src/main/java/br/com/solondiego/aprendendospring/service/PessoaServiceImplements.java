package br.com.solondiego.aprendendospring.service;

import br.com.solondiego.aprendendospring.entities.Pessoa;
import br.com.solondiego.aprendendospring.entities.PessoaCreateDto;
import br.com.solondiego.aprendendospring.entities.PessoaDto;
import br.com.solondiego.aprendendospring.parse.PessoaDtoParaPessoa;
import br.com.solondiego.aprendendospring.parse.PessoaParaPessoaDto;
import br.com.solondiego.aprendendospring.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PessoaServiceImplements implements PessoaService{

    private final PessoaDtoParaPessoa pessoaDtoParaPessoa;
    private final PessoaParaPessoaDto pessoaParaPessoaDto;
    private final PessoaRepository pessoaRepository;


    @Override
    public PessoaDto salvarPessoa(PessoaCreateDto pessoaCreateDto) {
        Pessoa pessoa = pessoaDtoParaPessoa.parse(pessoaCreateDto);
        Pessoa pessoaSaved = pessoaRepository.save(pessoa);
        PessoaDto pessoaDtoTransformado = pessoaParaPessoaDto.parse(pessoaSaved);
        return pessoaDtoTransformado;
    }

    @Override
    public Optional<Pessoa> retornarUmaPessoa(Long id) {
        return pessoaRepository.findById(id);
    }
}

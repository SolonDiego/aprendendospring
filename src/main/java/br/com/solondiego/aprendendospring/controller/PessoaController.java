package br.com.solondiego.aprendendospring.controller;

import br.com.solondiego.aprendendospring.entities.Pessoa;
import br.com.solondiego.aprendendospring.entities.PessoaCreateDto;
import br.com.solondiego.aprendendospring.entities.PessoaDto;
import br.com.solondiego.aprendendospring.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PessoaController {

    private final PessoaService pessoaService;

    @PostMapping("/create")
    public ResponseEntity<PessoaDto> salvarPessoa(@RequestParam PessoaCreateDto pessoaCreateDto){
        PessoaDto pessoaDto = pessoaService.salvarPessoa(pessoaCreateDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(pessoaDto.getId()).toUri();
        return ResponseEntity.created(uri).body(pessoaDto);
    }

    @GetMapping("/{id}")
    public Optional<Pessoa> retornaUmaPessoaPeloId(@PathVariable("id") Long id){
        return pessoaService.retornarUmaPessoa(id);
    }
}

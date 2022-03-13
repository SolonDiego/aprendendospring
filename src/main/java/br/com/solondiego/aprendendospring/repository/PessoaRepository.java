package br.com.solondiego.aprendendospring.repository;

import br.com.solondiego.aprendendospring.entities.Pessoa;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PessoaRepository extends PagingAndSortingRepository<Pessoa, Long> {

}

package edu.br.catolica.ppi.repositories;

import edu.br.catolica.ppi.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    Pessoa findByCpf(@Param("cpf") String cpf);

}


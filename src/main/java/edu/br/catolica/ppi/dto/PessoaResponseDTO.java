package edu.br.catolica.ppi.dto;

import edu.br.catolica.ppi.domain.Endereco;
import lombok.Data;

@Data
public class PessoaResponseDTO {


    private String nome;

    private String email;

    private String cpf;

    private Endereco endereco;



}

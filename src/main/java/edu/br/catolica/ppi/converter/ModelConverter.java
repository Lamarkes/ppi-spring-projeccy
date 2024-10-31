package edu.br.catolica.ppi.converter;

import edu.br.catolica.ppi.domain.Endereco;
import edu.br.catolica.ppi.domain.Pessoa;
import edu.br.catolica.ppi.dto.PessoaRequestDTO;
import edu.br.catolica.ppi.dto.PessoaResponseDTO;


public class ModelConverter {

    private ModelConverter(){}

    public static PessoaResponseDTO entityToResponseDTO(Pessoa entity){

        var response = new PessoaResponseDTO();

        response.setNome(entity.getNome());
        response.setCpf(entity.getCpf());
        response.setEmail(entity.getEmail());
        response.setEndereco(entity.getEndereco());

        return response;
    }

    public static Pessoa dtoToEntity(PessoaRequestDTO requestDTO){

        var pessoa = new Pessoa();

        pessoa.setNome(requestDTO.getNome());
        pessoa.setCpf(requestDTO.getCpf());
        pessoa.setEmail(requestDTO.getEmail());
        pessoa.setEndereco(new Endereco(requestDTO.getEndereco()));

        return pessoa;

    }
}
package edu.br.catolica.ppi.services;

import edu.br.catolica.ppi.converter.ModelConverter;
import edu.br.catolica.ppi.dto.PessoaRequestDTO;
import edu.br.catolica.ppi.dto.PessoaResponseDTO;
import edu.br.catolica.ppi.repositories.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PessoaService {



    private final PessoaRepository pessoaRepository;


    public PessoaResponseDTO savePessoa(PessoaRequestDTO request){

        var pessoa = ModelConverter.dtoToEntity(request);

        return ModelConverter.entityToResponseDTO(pessoaRepository.save(pessoa));
    }


    public PessoaResponseDTO getByCpf(String cpf){

        return ModelConverter.entityToResponseDTO(pessoaRepository.findByCpf(cpf));
    }


}

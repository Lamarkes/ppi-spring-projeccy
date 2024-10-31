package edu.br.catolica.ppi.controllers;


import edu.br.catolica.ppi.domain.Pessoa;
import edu.br.catolica.ppi.dto.PessoaRequestDTO;
import edu.br.catolica.ppi.dto.PessoaResponseDTO;
import edu.br.catolica.ppi.services.PessoaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/pessoa")
@Tag(name = "Pessoa", description = "API for Pessoa")
@RequiredArgsConstructor
public class PessoaController {


    private final PessoaService pessoaService;


    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Salva os usuarios no banco de dados", responses = {@ApiResponse(
            content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Pessoa.class))),
            @ApiResponse(responseCode = "201", description = "Pessoa Salva")})
    public ResponseEntity<PessoaResponseDTO> savePessoa(@Valid @RequestBody PessoaRequestDTO pessoa){

        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.savePessoa(pessoa));
    }


    @GetMapping("/cpf/{cpf}")
    @Operation(summary = "Busca os usuarios pelo CPF no banco de dados", responses = {
            @ApiResponse(content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = Pessoa.class))),
            @ApiResponse(responseCode = "200", description = "Pessoa encontrada")})
    public ResponseEntity<PessoaResponseDTO> getPessoaByCpf(@PathVariable(value = "cpf") String cpf){

        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.getByCpf(cpf));
    }

}

package edu.br.catolica.ppi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDTO {

    private String cidade;

    private String uf;

    private String bairro;

    private String rua;
}

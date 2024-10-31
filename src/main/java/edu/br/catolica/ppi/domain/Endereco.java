package edu.br.catolica.ppi.domain;


import edu.br.catolica.ppi.dto.EnderecoDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cidade;

    private String uf;

    private String bairro;

    private String rua;


    public Endereco(EnderecoDTO dto){
        BeanUtils.copyProperties(dto, this);
    }
}

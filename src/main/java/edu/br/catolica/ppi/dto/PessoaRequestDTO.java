package edu.br.catolica.ppi.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaRequestDTO {

    @NotBlank(message = "O campo não pode ser vazio")
    private String nome;

    @Email(message = "Email invalido")
    private String email;

    @CPF
    private String cpf;

    private EnderecoDTO endereco;
}

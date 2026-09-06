package br.com.petshop.petshop.domin.DTO.cliente;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class ClienteRequestSaveDTO {

    @NotBlank(message = "Tamanho de nome invalido")
    @Size(min=3, max=50)
    private String nome;

    @NotBlank(message = "Cpf Invalido")
    @Size(min=11, max=11)
    private String cpf;

    @NotBlank(message = "Telefone invalido")
    @Size(min=9, max=9)
    private String telefone;

    @NotBlank
    @Email(message = "Email Invalido")
    private String email;
}

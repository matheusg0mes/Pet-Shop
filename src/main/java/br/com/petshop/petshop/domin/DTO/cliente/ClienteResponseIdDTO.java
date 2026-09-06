package br.com.petshop.petshop.domin.DTO.cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ClienteResponseIdDTO {

    private Long id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

}

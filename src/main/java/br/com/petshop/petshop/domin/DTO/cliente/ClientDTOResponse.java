package br.com.petshop.petshop.domin.DTO.cliente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class ClientDTOResponse {

    private String nome;
    private String email;
    private String telefone;
}

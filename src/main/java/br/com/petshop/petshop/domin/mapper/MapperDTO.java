package br.com.petshop.petshop.domin.mapper;

import br.com.petshop.petshop.domin.DTO.cliente.ClientDTOResponse;
import br.com.petshop.petshop.domin.DTO.cliente.ClienteRequestSaveDTO;
import br.com.petshop.petshop.domin.DTO.cliente.ClienteResponseIdDTO;
import br.com.petshop.petshop.domin.model.Cliente;

import java.util.Optional;

public class MapperDTO {

    public static ClientDTOResponse clienteToClienteDTO(Cliente cliente){
        return ClientDTOResponse.builder()
                .nome(cliente.getNome())
                .email(cliente.getEmail())
                .telefone(cliente.getTelefone())
                .build();
    }

    public static Cliente clienteResponseDTOToCliente(ClienteRequestSaveDTO clienteDTO){
        return Cliente.builder()
                .cpf(clienteDTO.getCpf())
                .email(clienteDTO.getEmail())
                .telefone(clienteDTO.getTelefone())
                .nome(clienteDTO.getNome())
                .build();
    }

    public static ClienteResponseIdDTO clienteToClienteResponseIdDTO(Cliente cliente){
        return ClienteResponseIdDTO.builder()
                .id(cliente.getId())
                .cpf(cliente.getCpf())
                .nome(cliente.getNome())
                .email(cliente.getEmail())
                .telefone(cliente.getTelefone())
                .build();
    }
}

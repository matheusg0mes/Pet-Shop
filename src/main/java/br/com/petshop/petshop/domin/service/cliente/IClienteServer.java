package br.com.petshop.petshop.domin.service.cliente;

import br.com.petshop.petshop.domin.DTO.cliente.ClientDTOResponse;
import br.com.petshop.petshop.domin.DTO.cliente.ClienteRequestSaveDTO;
import br.com.petshop.petshop.domin.model.Cliente;

public interface IClienteServer {

    public ClientDTOResponse saveCliente(ClienteRequestSaveDTO clienteRequestSaveDTO);
}


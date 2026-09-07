package br.com.petshop.petshop.domin.service.cliente;

import br.com.petshop.petshop.domin.DTO.cliente.ClientDTOResponse;
import br.com.petshop.petshop.domin.DTO.cliente.ClienteRequestSaveDTO;
import br.com.petshop.petshop.domin.DTO.cliente.ClienteResponseIdDTO;


public interface IClienteServer {

    public ClientDTOResponse saveCliente(ClienteRequestSaveDTO clienteRequestSaveDTO);

    public ClienteResponseIdDTO getIdCliente(Long id);

    public ClienteResponseIdDTO deleteCliente(Long id);

}


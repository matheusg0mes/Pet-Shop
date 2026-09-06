package br.com.petshop.petshop.domin.service.cliente;

import br.com.petshop.petshop.domin.DTO.cliente.ClientDTOResponse;
import br.com.petshop.petshop.domin.DTO.cliente.ClienteRequestSaveDTO;
import br.com.petshop.petshop.domin.DTO.cliente.ClienteResponseIdDTO;
import br.com.petshop.petshop.domin.exceptions.exception.BadRequestException;
import br.com.petshop.petshop.domin.exceptions.exception.InternarServerErroException;
import br.com.petshop.petshop.domin.mapper.MapperDTO;
import br.com.petshop.petshop.domin.model.Cliente;
import br.com.petshop.petshop.domin.repository.IClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class ClienteServer implements IClienteServer {

    private IClienteRepository iClienteRepository;

    @Override
    public ClientDTOResponse saveCliente(ClienteRequestSaveDTO clienteRequestSaveDTO) {

        var result1 = iClienteRepository.findByCpf(clienteRequestSaveDTO.getCpf());
        if(result1.isPresent()){
             throw new InternarServerErroException("Esse cpf já está em uso");
        }
        Cliente mapperCliente = MapperDTO.clienteResponseDTOToCliente(clienteRequestSaveDTO);

        Cliente cliente1 = iClienteRepository.save(mapperCliente);
        ClientDTOResponse clientedto = MapperDTO.clienteToClienteDTO(cliente1);
        return clientedto;
    }

    @Override
    public ClienteResponseIdDTO getIdCliente(Long id) {

        Cliente cliente1 = iClienteRepository.findById(id).orElseThrow(() ->
                new BadRequestException("Cliente com id: " + id + " Não existe"));

            ClienteResponseIdDTO clienteResponseIdDTO = MapperDTO.clienteToClienteResponseIdDTO(cliente1);
            return clienteResponseIdDTO;

    }


}

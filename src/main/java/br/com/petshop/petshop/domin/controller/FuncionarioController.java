package br.com.petshop.petshop.domin.controller;

import br.com.petshop.petshop.domin.DTO.cliente.ClientDTOResponse;
import br.com.petshop.petshop.domin.DTO.cliente.ClienteRequestSaveDTO;
import br.com.petshop.petshop.domin.model.Cliente;
import br.com.petshop.petshop.domin.service.cliente.IClienteServer;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
@AllArgsConstructor
public class FuncionarioController {

    private IClienteServer iClienteServer;

    @PostMapping("/save")
    public ResponseEntity<ClientDTOResponse> saveCliente(@Valid @RequestBody ClienteRequestSaveDTO clienteDTO){
        return ResponseEntity.ok(iClienteServer.saveCliente(clienteDTO));
    }
}

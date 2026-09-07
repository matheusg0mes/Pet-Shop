package br.com.petshop.petshop.domin.controller;

import br.com.petshop.petshop.domin.DTO.cliente.ClientDTOResponse;
import br.com.petshop.petshop.domin.DTO.cliente.ClienteRequestSaveDTO;
import br.com.petshop.petshop.domin.DTO.cliente.ClienteResponseIdDTO;
import br.com.petshop.petshop.domin.service.cliente.IClienteServer;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/cliente")
@AllArgsConstructor
public class ClienteController {

    private IClienteServer iClienteServer;

    @PostMapping("/save")
    public ResponseEntity<ClientDTOResponse> saveCliente(@Valid @RequestBody ClienteRequestSaveDTO clienteDTO){
        return ResponseEntity.ok(iClienteServer.saveCliente(clienteDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponseIdDTO> findIdCliente(@PathVariable Long id){
        return ResponseEntity.ok(iClienteServer.getIdCliente(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCliente(@PathVariable Long id){
        ClienteResponseIdDTO clienteResponseIdDTO = iClienteServer.deleteCliente(id);
        return ResponseEntity.ok("Cliente com id: " + clienteResponseIdDTO.getId() + " foi removido");
    }
}

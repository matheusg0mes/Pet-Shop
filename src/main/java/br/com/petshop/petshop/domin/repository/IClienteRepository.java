package br.com.petshop.petshop.domin.repository;

import br.com.petshop.petshop.domin.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IClienteRepository extends JpaRepository<Cliente,Long> {

    Optional<Cliente> findByCpf(String cpf);
}

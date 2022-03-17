package io.github.rodrigopaluma.clientes.model.repository;

import io.github.rodrigopaluma.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}

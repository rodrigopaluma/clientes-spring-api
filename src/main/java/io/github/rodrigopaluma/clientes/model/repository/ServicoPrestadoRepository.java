package io.github.rodrigopaluma.clientes.model.repository;

import io.github.rodrigopaluma.clientes.model.entity.ServicoPrestado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoPrestadoRepository extends JpaRepository<ServicoPrestado, Integer> {
}

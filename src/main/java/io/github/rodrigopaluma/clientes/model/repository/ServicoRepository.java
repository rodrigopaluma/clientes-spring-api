package io.github.rodrigopaluma.clientes.model.repository;

import io.github.rodrigopaluma.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}

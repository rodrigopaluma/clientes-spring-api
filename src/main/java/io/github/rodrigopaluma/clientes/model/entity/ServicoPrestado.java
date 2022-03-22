package io.github.rodrigopaluma.clientes.model.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class ServicoPrestado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Column
    private BigDecimal valor;

    @Column
    private LocalDate data;

    public void setDescricao(String descricao) {
    }

    public void setData(LocalDate data) {
    }

    public void setCliente(Cliente cliente) {
    }

    public void setValor(BigDecimal converter) {
    }
}

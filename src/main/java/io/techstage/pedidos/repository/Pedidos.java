package io.techstage.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.techstage.pedidos.model.Pedido;

public interface Pedidos extends JpaRepository<Pedido, Long> {

}

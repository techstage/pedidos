package io.techstage.pedidos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class Pedido {
  
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	Long transacao;
	Long pagamento;
	Long cliente;
	String nome;
	String email;

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public Long getTransacao() {
      return transacao;
    }

    public void setTransacao(Long transacao) {
      this.transacao = transacao;
    }

    public Long getPagamento() {
      return pagamento;
    }

    public void setPagamento(Long pagamento) {
      this.pagamento = pagamento;
    }

    public Long getCliente() {
      return cliente;
    }

    public void setCliente(Long cliente) {
      this.cliente = cliente;
    }

    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {
      this.email = email;
    }
}
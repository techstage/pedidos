package io.techstage.pedidos.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.techstage.pedidos.model.Pedido;
import io.techstage.pedidos.repository.Pedidos;

@CrossOrigin
@RestController	
@RequestMapping("/pedidos")
public class PedidosResource {
	
	@Autowired
	private Pedidos pedidos;
	
	@CrossOrigin
	@PostMapping
	public Pedido adicionar(@Valid @RequestBody Pedido pedido) {
		return pedidos.save(pedido);
	}
	
	@CrossOrigin
	@GetMapping
	public List<Pedido> listar() {
		return pedidos.findAll();
	}
  
	@CrossOrigin
	@GetMapping("/{id}")
	public ResponseEntity<Pedido> buscar(@PathVariable Long id) {
    Pedido pedido = pedidos.findById(id).get();
    
		if (pedido == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(pedido);
	}
	
	@CrossOrigin
	@PutMapping("/{id}")
	public ResponseEntity<Pedido> atualizar(@PathVariable Long id, 
			@Valid @RequestBody Pedido pedido) {
				Pedido existente = pedidos.findById(id).get();
		
		if (existente == null) {
			return ResponseEntity.notFound().build();
		}
		
		BeanUtils.copyProperties(pedido, existente, "id");
		
		existente = pedidos.save(existente);
		
		return ResponseEntity.ok(existente);
	}

	@CrossOrigin
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Long id) {
		Pedido pedido = pedidos.findById(id).get();
		
		if (pedido == null) {
			return ResponseEntity.notFound().build();
		}
		
		pedidos.delete(pedido);
		
		return ResponseEntity.noContent().build();
	}
}
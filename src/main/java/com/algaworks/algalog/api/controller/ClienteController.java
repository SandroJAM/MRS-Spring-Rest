package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Sandro");
		cliente1.setTelefone("81 98791-8561");
		cliente1.setEmail("sandro.mnz@gmail.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Barbara");
		cliente2.setTelefone("81 98899-7180");
		cliente2.setEmail("barbaravasconcelos4647@gmail.com");
		
		return Arrays.asList(cliente1, cliente2);
	}
}

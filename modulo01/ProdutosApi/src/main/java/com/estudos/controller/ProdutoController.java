package com.estudos.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.model.Produto;

@RestController // classe vai lidar com requisições de uma API
@RequestMapping("/produtos") // url do controller
public class ProdutoController {
	
	@PostMapping //serve para enviar dados, salvar dados
	public void salvar(@RequestBody Produto produto) // se nao houver a anotacao requestbody, a aplicacao nao vai reconher os dados para os objetos
	{
		System.out.println("Produto salvo: " + produto);
	}
}

package com.desafio.desafio1;

import com.desafio.desafio1.etities.Product;
import com.desafio.desafio1.services.ValorFinal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	private ValorFinal valorFinal;

	public static void main(String[] args) {

		SpringApplication.run(Desafio1Application.class, args);
	}

	public void run(String... args) throws Exception {
		Product product = new Product(2282, 800.0, 10.0);
		System.out.println("Pedido código " + product.getCodigo() +
				"\nValor total: R$" + valorFinal.calculadora(product));
	}

}

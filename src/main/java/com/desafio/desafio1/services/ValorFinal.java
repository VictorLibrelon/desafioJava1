package com.desafio.desafio1.services;

import com.desafio.desafio1.etities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValorFinal {

    @Autowired
    private Frete freteDesconto;
    @Autowired
    private Desconto descontoPorcentagem;

    public double calculadora(Product product){
        return product.getValorPedido() - descontoPorcentagem.desconto(product.getValorPedido(), product.getDesconto())
                + freteDesconto.frete(product.getValorPedido());

    }
}

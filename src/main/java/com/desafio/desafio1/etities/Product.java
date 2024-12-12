package com.desafio.desafio1.etities;

import com.desafio.desafio1.services.Desconto;
import com.desafio.desafio1.services.Frete;

public class Product {

    private int codigo;
    private double valorPedido;
    private double desconto;

    public Product(int codigo, double valorPedido, double desconto) {
        this.codigo = codigo;
        this.valorPedido = valorPedido;
        this.desconto = desconto;
    }


    public double getValorPedido() {
        return valorPedido;
    }


    public int getCodigo() {
        return codigo;
    }

    public double getDesconto() {
        return desconto;
    }

}

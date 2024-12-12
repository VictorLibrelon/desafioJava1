package com.desafio.desafio1.services;

import org.springframework.stereotype.Service;

@Service
public class Desconto {

    public double desconto(double valorPedido, double porcentagem){
        return valorPedido * (porcentagem/100);
    }

}

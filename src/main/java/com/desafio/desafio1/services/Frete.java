package com.desafio.desafio1.services;

import org.springframework.stereotype.Service;

@Service
public class Frete {

    public double frete(double valorPedido){

        if(valorPedido < 100.00){
            return 20.00;
        }else if(valorPedido > 99.99 && valorPedido < 200.00){
            return 12.00;
        }else {
            return 0;
        }

    }
}

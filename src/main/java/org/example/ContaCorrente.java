package org.example;

public class ContaCorrente extends Cliente{

    public float transferir(float saldo){

        return saldo;
    }

    public int fazerSaque(float saldo, int dinheiro){
        saldo = saldo - dinheiro;
        return dinheiro;
    }

    public int fazerDeposito(float saldo, int dinheiro) {
        saldo = saldo + dinheiro;
        return saldo;
    }
}

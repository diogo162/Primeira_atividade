package org.example;

public class ContaCorrente extends Cliente{

    public void fazerTransferencia(float dinheiro, float saldo, Cliente conta, Cliente conta2, float saldo2){
        if (saldo > dinheiro) {
            saldo -= dinheiro;
        }
        saldo2 += dinheiro;
    }

    public float fazerSaque(float saldo, int dinheiro){
        if (saldo > dinheiro) {
            saldo -= dinheiro;
        }
        return dinheiro;
    }

    public float fazerDeposito(float saldo, int dinheiro) {
        saldo += dinheiro;
        return saldo;
    }
}

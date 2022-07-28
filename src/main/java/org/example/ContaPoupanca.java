package org.example;

public class ContaPoupanca extends Investidor{

    public void fazerAplicacaoP(float saldo, float investimento){
        saldo -= investimento;

    }

    public float fazerSaqueP(int input, float saldo) {
        saldo -= input;
        return input;
    }
}

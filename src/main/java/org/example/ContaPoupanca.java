package org.example;

public class ContaPoupanca extends Investidor{

    public void fazerAplicações(){

    }

    public void fazerSaqueP(int input, float saldo) {
        saldo = this.saldo - input;
    }


}

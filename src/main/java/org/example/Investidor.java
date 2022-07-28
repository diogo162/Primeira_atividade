package org.example;

public class Investidor extends Cliente{

    protected float rendimento;


    public void fazerResgate(float saldo, float investimento){
        saldo += investimento;
    }


    public float getRendimento()
    {
        return rendimento;
    }

    public void setRendimento(float rendimento)
    {
        this.rendimento = rendimento;
    }
}

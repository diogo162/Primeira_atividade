package org.example;

public class Investidor extends Cliente{

    protected float rendimento;


    public int resgatar(){

    }


    @Override
    public float getRendimento() {
        return rendimento;
    }

    public void setRendimento(float rendimento) {
        this.rendimento = rendimento;
    }
}

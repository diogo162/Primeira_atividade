package org.example;

public class Cliente {
    protected String CPF;
    protected Integer senha;
    protected String agencia;
    protected String conta;
    protected Float rendimento;
    protected Float saldo;
    protected Float extrato;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public float getRendimento() {
        return rendimento;
    }

    public void setRendimento(Float rendimento) {
        this.rendimento = rendimento;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Float getExtrato() {
        return extrato;
    }

    public void setExtrato(Float extrato) {
        this.extrato = extrato;
    }
}

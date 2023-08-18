package com.contabancaria.dio.entidade;

public class ContaTerminal {
    private int numeroConta;
    private String nomeCliente;
    private String agencia;
    private double saldo;

    public ContaTerminal(){

    }
    public ContaTerminal(int numeroConta, String nomeCliente, String agencia, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return  "Olá "
                + getNomeCliente()
                + " obrigado por criar uma conta no nosso banco, "
                + "sua agência é "
                + getAgencia()
                + ", "
                + "conta "
                + getNumeroConta()
                + " e seu saldo "
                + getSaldo()
                + " já está disponível para saque!";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesubps2;

/**
 *
 * @author Raffael
 */
public class Conta {
    
    private int cliente;
    private String conta_numero;
    private int agencia;
    private double saldo;
    private int tipo_conta; //1 = Conta Corrente e 2 = Conta Poupança
    private double limite_conta;

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getConta_numero() {
        return conta_numero;
    }

    public void setConta_numero(String conta_numero) {
        this.conta_numero = conta_numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getTipo_conta() {
        return tipo_conta;
    }

    public void setTipo_conta(int tipo_conta) {
        this.tipo_conta = tipo_conta;
    }

    public double getLimite_conta() {
        return limite_conta;
    }

    public void setLimite_conta(double limite_conta) {
        this.limite_conta = limite_conta;
    }

    double setSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

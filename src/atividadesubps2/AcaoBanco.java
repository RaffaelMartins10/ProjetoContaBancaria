/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesubps2;

/**
 *
 * @author Raffael
 */
public class AcaoBanco {
  
    private Conta conta;
    private double saudo;
    private double juros;
    private double valor;
    private String tpConta;

    public String getTpConta() {
        return tpConta;
    }

    public void setTpConta(String tpConta) {
        this.tpConta = tpConta;
    }

    
    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
        
    public double getSaudo() {
        return saudo;
    }

    public void setSaudo(double saudo) {
        this.saudo = saudo;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void saque ()
    {
        verificaSaque();
        
    }
    
    public void deposito(){
        verificaDeposito();
    }
    
    public void calcularSaque(){
        double valorSaque;
        if(conta.getTipo_conta() == 1){
            valorSaque = ((conta.getLimite_conta() + conta.getSaldo()) - this.getValor());
            conta.setSaldo(valorSaque);
        }else{
            valorSaque = (conta.getSaldo() - this.getValor());
            conta.setSaldo(valorSaque);
        }
        this.saudo = valorSaque;
        
    }
    
    public void calcularDeposito(){
        double valorDeposito = (conta.getSaldo() + this.getValor());
        conta.setSaldo(valorDeposito);
        this.saudo = valorDeposito;
    }
    
    public void verificaSaque(){
        int tipo_conta  = conta.getTipo_conta();
        if(tipo_conta == 1){
            this.setTpConta("Conta Corrente");
            double valorAtualLimite = conta.getLimite_conta();
            double valorAtualSaldo = conta.getSaldo();
            double valorSaldo = (valorAtualLimite + valorAtualSaldo);
            double valorSaque = getValor();
            if(valorSaque<= valorSaldo){
                calcularSaque();
                System.out.println("Saque realizado com Sucesso");
                System.out.println("Cliente: "+conta.getConta_numero());
                System.out.println("Saldo Atual: "+getSaudo());
                System.out.println("Tipo Conta : "+getTpConta());
            }else{
                System.out.println("Valor não disponivel");
            }
        }else{
            this.setTpConta("Conta Poupança");
            double valorAtualSaldo = conta.getSaldo();
            double valorSaque = getValor();
            if(valorSaque<= valorAtualSaldo){
                calcularSaque();
                System.out.println("Saque realizado com Sucesso");
                System.out.println("Cliente: "+conta.getConta_numero());
                System.out.println("Saldo Atual: "+getSaudo());
                System.out.println("Tipo Conta : "+getTpConta());
            }else{
                System.out.println("Valor não disponivel");
            }
        };
    }
    
    public void verificaDeposito(){
        calcularDeposito();
        System.out.println("Deposito realizado com Sucesso");
        System.out.println("Cliente: "+conta.getConta_numero());
        System.out.println("Saldo Atual: "+getSaudo());
            
    }
    
    public void calculaJurosPupanca(int valor){
        
        double valorSaudoAtualCliente = conta.getSaldo();
        int juros = valor;
        
        double valorSaudo = ((valorSaudoAtualCliente*juros)/100)+valorSaudoAtualCliente; 
        conta.setSaldo(valorSaudo);
        System.out.println("Saldo Atual: "+valorSaudo);
    }

    public void calculaJurosCorrente(int valor){
        double valorSaudoAtualCliente = conta.getSaldo();
        int juros = valor;
        
        double valorSaudo = valorSaudoAtualCliente-((valorSaudoAtualCliente*juros)/100); 
        conta.setSaldo(valorSaudo);
        System.out.println("Saldo Atual: "+valorSaudo);
    }
       
}

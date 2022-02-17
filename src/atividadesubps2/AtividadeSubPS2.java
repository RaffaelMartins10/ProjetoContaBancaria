/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadesubps2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Raffael
 */
public class AtividadeSubPS2 {

    public static String CABECALHO = "------------- Banco Seu -------------\n";
    public static String BANCO_VERSAO = "v0.4";
    public static String Views_VERSAO = "v0.1";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Conta> listaConta = new ArrayList<Conta>();
        List<Cliente> listaCliente = new ArrayList<Cliente>();
        List<AcaoBanco> listaAcaoBanco = new ArrayList<AcaoBanco>();
        
        boolean loop = true;
        int tipo_conta = 0;
        double valorSaque;
        int codigoCliente;
                        
        Scanner SC = new Scanner(System.in);
        
        Cliente cliente = new Cliente();
        cliente.setCod_cliente(1);
        cliente.setCpf("791.167.318-75");
        cliente.setNome("Caio Pedro Moraes");
        cliente.setRua("Rua Canadá");
        cliente.setNumero(162);
        cliente.setBairro("Santo Antonio");
        cliente.setCidade("Teresinha");
        cliente.setEstado("PI");
        cliente.setCep("64029-158");
        cliente.setProfissao("Pedreiro");
        listaCliente.add(cliente);
        
        Conta conta = new Conta();
        conta.setAgencia(0001);
        conta.setCliente(1);
        conta.setConta_numero("100401");
        conta.setLimite_conta(10);
        conta.setSaldo(10);
        conta.setTipo_conta(1);
       
        conta.setAgencia(0001);;;
        conta.setCliente(1);
        conta.setConta_numero("100445");
        conta.setSaldo(10);
        conta.setTipo_conta(2);
        listaConta.add(conta);

        AcaoBanco acao = new AcaoBanco();

        while(loop)
        {
            String MENU = "";
            MENU += "Bem-Vindo(a) ao SEU Banco!\n\n";
            MENU += "[1] - Acessar conta\n";
            MENU += "[2] - Saque\n";
            MENU += "[3] - Deposito\n";
            MENU += "[4] - Extrato Juros Conta Poupança\n";
            MENU += "[5] - Extrato Juros Conta Corrente\n";
            MENU += "[0] - Sair do sistema\n:";
            System.out.print(MENU);
            
            String opt = SC.next();
            switch(opt)
            {
              case "1":
                      
                        int codigoTemp ;
                        System.out.println("===========================================");
                        System.out.println("Lista de Clientes \n\n");

                        for (int i = 0; i < listaCliente.size(); i++) {
                            int id = i;
                            System.out.println("Codigo : "+id);
                            System.out.println("Conta : "+listaConta.get(i).getConta_numero());
                        }
                          
              break;

              case "2":
                  
                        System.out.println("===========================================");
                        System.out.println("Lista de Contas \n\n");

                        for (int i = 1; i < listaConta.size(); i++) {
                            int id = i+1;
                            System.out.println("Codigo : "+i);
                            System.out.println("Agência : "+listaConta.get(i).getAgencia());
                            System.out.println("Conta : "+listaConta.get(i).getConta_numero()+"\n\n");
                        }

                        codigoCliente = Integer.parseInt(coletarTexto("Informe o Codigo do Cliente: "));
                        acao.setConta(listaConta.get(codigoCliente-1));
                        valorSaque = Double.parseDouble(coletarTexto("Informe o valor para Saque: "));
                        acao.setValor(valorSaque);
                        System.out.println("===========================================");
                        acao.saque();
              break;
              
              case "3":
                  
                        System.out.println("===========================================");
                        System.out.println("Lista de Contas \n\n");

                        for (int i = 1; i < listaConta.size(); i++) {
                            int id = i+1;
                            System.out.println("Codigo : "+i);
                            System.out.println("Agência : "+listaConta.get(i).getAgencia());
                            System.out.println("Conta : "+listaConta.get(i).getConta_numero()+"\n\n");
                        }

                        codigoCliente = Integer.parseInt(coletarTexto("Informe o Codigo do Cliente: "));
                        acao.setConta(listaConta.get(codigoCliente-1));
                        valorSaque = Double.parseDouble(coletarTexto("Informe o valor para Deposito: "));
                        acao.setValor(valorSaque);
                        System.out.println("===========================================");
                        acao.deposito();
              break;
              
              case "4":
                  
                        System.out.println("===========================================\n\n");

                        for (int i = 1; i < listaConta.size(); i++) {
                            int id = i+1;
                            System.out.println("Codigo : "+i);
                            System.out.println("Agência : "+listaConta.get(i).getAgencia());
                            System.out.println("Conta : "+listaConta.get(i).getConta_numero()+"\n\n");
                        }

                        codigoCliente = Integer.parseInt(coletarTexto("Informe o Codigo do Cliente: "));
                        acao.setConta(listaConta.get(codigoCliente-1));
                        System.out.println("===========================================");
                        acao.calculaJurosPupanca(5);
              break;
              case "5":
                  
                        System.out.println("===========================================\n\n");

                        for (int i = 1; i < listaConta.size(); i++) {
                            int id = i+1;
                            System.out.println("Codigo : "+i);
                            System.out.println("Agência : "+listaConta.get(i).getAgencia());
                            System.out.println("Conta : "+listaConta.get(i).getConta_numero()+"\n\n");
                        }

                        codigoCliente = Integer.parseInt(coletarTexto("Informe o Codigo do Cliente: "));
                        acao.setConta(listaConta.get(codigoCliente-1));
                        System.out.println("===========================================");
                        acao.calculaJurosCorrente(5);
              break;
              case "0":
                   loop = false;
              }
        }
    }
    private static String coletarTexto(String descricao){
        Scanner scanner = new Scanner(System.in,"ISO-8859-1");
        System.out.println(descricao);
        String dados = scanner.nextLine();
        return dados;
    }
}

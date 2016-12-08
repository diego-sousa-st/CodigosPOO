/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class InterfaceUsuario {
    private Zoologico zoologico;
    /**
     * Construtor da classe InterfaceUsuario
     */
    public InterfaceUsuario(){
        zoologico = new Zoologico();
    }
    /**
     * Método que retorna a opcao digitada pelo usuario
     * @return valor digitado pelo usuário
     */
    private int menu(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("-------Zoologico-------");
        System.out.println("1- Cadastrar animal");
        System.out.println("2- Listar todos os animais com nome e espécie");
        System.out.println("3- Emitir o som de um animal");
        System.out.println("4- Exibir todos os dados de um animal");
        System.out.println("5- Sair...");
        int opcao = entrada.nextInt();
        return opcao;
    }
    /**
     * Método que retorna o nome de um animal digitado pelo usuario
     * @return 
     */
    private String lerNome(){
        System.out.print("Digite o nome do animal: ");
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        return nome;
    }
    /**
     * Método que lê os dados de um animal  a ser cadastrado e pede ao zoologico para que este seja
     * cadastrado
     */
    private void cadastrarAnimal(){
        String nome = lerNome();
        System.out.println("Digite a especie(1- lobo 2- cachorro 3- gato 4- galinha 5- águia):");
        Scanner entrada = new Scanner(System.in);
        int especie = entrada.nextInt();       
        System.out.println("Digite 1 se o animal for mamífero ou 2 se for ave:");
        int tipo = entrada.nextInt();
        if(tipo == 1){
            System.out.print("Digite a cor do pelo:");           
            String corPelo = entrada.next();
            zoologico.cadastrarAnimal(nome, corPelo, especie);
        }
        else{
            zoologico.cadastrarAnimal(nome, especie);
        }
        
    }
    /**
     * Método que lista todos os animais com sua respectiva especie e nome
    */
    private void listarAnimais(){
        System.out.println(zoologico.listarNomesEspecies());
    }
    /**
     * Método que emite o som de um animal a partir de um nome
     */
    private void emitirSom(){
        String nome = lerNome();
        System.out.println(zoologico.emiteSom(nome));
    }
    /**
     * Método que exibe os dados de um animal a partir de um nome
     */
    private void exibirDadosAnimal(){
        String nome = lerNome();
        System.out.println(zoologico.exibirDadosAnimal(nome));
    }
    /**
     * Método que executa o loop de interação com o usuário
     */
    public void executar(){
        int opcao;
        do {
            opcao = menu();
            switch(opcao){
                case 1:
                    cadastrarAnimal();
                    break;
                case 2:
                    listarAnimais();
                    break;
                case 3:
                    emitirSom();
                    break;
                case 4:
                    exibirDadosAnimal();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while(opcao != 5);
    }
}

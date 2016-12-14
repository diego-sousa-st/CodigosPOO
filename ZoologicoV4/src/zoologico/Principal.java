/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

import zoologico.View.InterfaceUsuario;

/**
 * Classe que cria um objeto da interface com o usuario e a executa
 * @author diego
 */
public class Principal {
    /**
     * Método estático main que cria o objeto InterfaceUsuario e a executa através do método executar
     * @param args Strings na linha de comando passadas como argumento(Não é usada aqui)
     */
    public static void main(String[] args){
        InterfaceUsuario interfaceU = new InterfaceUsuario();
        interfaceU.executar();
    }
}

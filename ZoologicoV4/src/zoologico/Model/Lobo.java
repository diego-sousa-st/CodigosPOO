/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico.Model;

/**
 * Classe que representa um Lobo no sistema
 * @author diego
 */
public class Lobo extends Mamifero{
    /**
     * Construtor da classe Lobo que cria um novo Lobo
     * @param corPelo cor do pelo do lobo
     * @param nome nome do lobo
     */
    public Lobo(String corPelo,String nome){
        super(corPelo,nome,"Lobo",4,"Auuuiiiiii!");
    }
    /**
     * Método sobrescrito que retorna uma descrição da especie
     * @return String com a descrição da espécie
     */
    @Override
    public String getDescricao(){
        return "um "+super.getEspecie();
    }
    /**
     * Método sobrescrito que clona um lobo e retorna um novo lobo com os mesmos
     * atributos do lobo original
     * @return cópia de um lobo
     */
    @Override
    public Lobo clone() /*throws CloneNotSupportedException*/{
        Lobo clone = new Lobo(super.getCorPelo(),super.getNome());
        return clone;
    }
}

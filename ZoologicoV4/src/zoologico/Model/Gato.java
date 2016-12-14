/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico.Model;

/**
 * Classe que representa um Gato no sistema
 * @author diego
 */
public class Gato extends Mamifero{
    /**
     * Construtor da classe Gato que cria um novo Gato
     * @param corPelo cor do pleo do gato
     * @param nome nome do gato
     */
    public Gato(String corPelo, String nome){
        super(corPelo,nome,"Gato",4,"Miau Miau!");
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
     * Método sobrescrito que clona um gato e retorna um novo gato com os mesmos
     * atributos do gato original
     * @return cópia de um gato
     */
    @Override
    public Gato clone() /*throws CloneNotSupportedException*/{
        Gato clone = new Gato(super.getCorPelo(),super.getNome());
        return clone;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico.Model;

/**
 * Classe que representa uma Galinha no sistema
 * @author diego
 */
public class Galinha extends Ave{
    
    /**
     * Construtor da classe Galinha que cria uma nova Galinha
     * @param nome nome da nova Galinha
     */
    public Galinha(String nome){
        super(false, nome, "Galinha", 2, "Cocoricó!");
    }
    /**
     * Método sobrescrito que retorna uma descrição da especie
     * @return String com a descrição da espécie
     */
    @Override
    public String getDescricao(){
        return "uma "+super.getEspecie();
    }
    /**
     * Método sobrescrito que clona uma galinha e retorna uma nova galinha com os mesmos
     * atributos da galinha original
     * @return cópia de uma galinha
     */
    @Override
    public Galinha clone() /*throws CloneNotSupportedException*/{
        Galinha clone = new Galinha(super.getNome());
        return clone;
    }
}

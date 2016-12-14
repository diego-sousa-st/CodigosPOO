/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico.Model;

/**
 * Classe que representa uma Aguia no sistema
 * @author diego
 */
public class Aguia extends Ave{
    /**
     * Construtor da classe Aguia que cria uma nova aguia 
     * @param nome nome da nova aguia
     */
    public Aguia(String nome){
        super(true, nome, "Aguia", 2, "fiuuuuuuu!");
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
     * Método sobrescrito que clona uma aguia e retorna uma nova aguia com os mesmos
     * atributos da aguia original
     * @return cópia de uma águia
     */
    @Override
    public Aguia clone(){
        Aguia clone = new Aguia(super.getNome());
        return clone;
    }
}

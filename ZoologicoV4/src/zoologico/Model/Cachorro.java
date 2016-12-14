/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico.Model;

/**
 * Classe que representa um Cachorro no sistema
 * @author diego
 */
public class Cachorro extends Mamifero{
    /**
     * Construtor da classe Cachorro que cria um novo Cachorro
     * @param corPelo cor do pelo do cachorro
     * @param nome nome do cachorro
     */
    public Cachorro(String corPelo, String nome){
        super(corPelo,nome,"Cachorro",4,"Au Au Au!");
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
     * Método sobrescrito que clona um cachorro e retorna um novo cachorro com os mesmos
     * atributos do cachorro original
     * @return cópia de um cachorro
     */
    @Override
    public Cachorro clone(){
        Cachorro clone = new Cachorro(super.getCorPelo(),super.getNome());
        return clone;
    }
}

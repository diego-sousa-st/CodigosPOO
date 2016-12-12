/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico.Model;

/**
 *
 * @author diego
 */
public class Cachorro extends Mamifero{
    
    public Cachorro(String corPelo, String nome){
        super(corPelo,nome,"Cachorro",4,"Au Au Au!");
    }
    
    @Override
    public String getDescricao(){
        return "um "+super.getEspecie();
    }
    
    @Override
    public Cachorro clone(){
        Cachorro clone = new Cachorro(super.getCorPelo(),super.getNome());
        return clone;
    }
}

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
public class Aguia extends Ave{
    
    public Aguia(String nome){
        super(true, nome, "Aguia", 2, "fiuuuuuuu!");
    }
    
    @Override
    public String getDescricao(){
        return "uma "+super.getEspecie();
    }
    
    @Override
    public Aguia clone(){
        Aguia clone = new Aguia(super.getNome());
        return clone;
    }
}

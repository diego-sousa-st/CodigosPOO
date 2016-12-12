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
public class Galinha extends Ave{
    
    
    public Galinha(String nome){
        super(false, nome, "Galinha", 2, "Cocoricó!");
    }
    
    @Override
    public String getDescricao(){
        return "uma "+super.getEspecie();
    }
    
    @Override
    public Galinha clone() /*throws CloneNotSupportedException*/{
        Galinha clone = new Galinha(super.getNome());
        return clone;
    }
}

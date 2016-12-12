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
public class Gato extends Mamifero{
    
    public Gato(String corPelo, String nome){
        super(corPelo,nome,"Gato",4,"Miau Miau!");
    }
    
    @Override
    public String getDescricao(){
        return "um "+super.getEspecie();
    }
    
    @Override
    public Gato clone() /*throws CloneNotSupportedException*/{
        Gato clone = new Gato(super.getCorPelo(),super.getNome());
        return clone;
    }
}
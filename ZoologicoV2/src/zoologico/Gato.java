/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

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
}

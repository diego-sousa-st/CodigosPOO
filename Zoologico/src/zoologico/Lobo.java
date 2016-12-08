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
public class Lobo extends Mamifero{

    public Lobo(String corPelo,String nome){
        super(corPelo,nome,"Lobo",4,"Auuuiiiiii!");
    }
    
    @Override
    public String getDescricao(){
        return "um "+super.getEspecie();
    }
}

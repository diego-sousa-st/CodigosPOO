/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeinterface;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class TesteInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<AreaCalculavel> formas = new ArrayList<AreaCalculavel>();
        formas.add(new Circulo(10));
        formas.add(new Retangulo(10,15));
        formas.add(new Quadrado(25));
        for(AreaCalculavel forma : formas){
            System.out.println("Area: "+forma.calcularArea());
        }
    }
    
}

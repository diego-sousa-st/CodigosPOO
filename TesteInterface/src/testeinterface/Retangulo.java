/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeinterface;

/**
 *
 * @author diego
 */
public class Retangulo implements AreaCalculavel{
    private double altura;
    private double largura;
    
    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }
    
    @Override
    public double calcularArea() {
        return altura*largura;
    }
    
}

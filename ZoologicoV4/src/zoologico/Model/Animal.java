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
public abstract class Animal {
    private String nome;
    private String especie;
    private int qtdPatas;
    private String som;
    
    public Animal(String nome, String especie, int qtdPatas, String som){
        this.especie = especie;
        this.nome = nome;
        this.qtdPatas = qtdPatas;
        this.som = som;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEspecie(){
        return especie;
    }
    
    public int getQtdPatas(){
        return qtdPatas;
    }
    
    public String getSom(){
        return som;
    }
    
    public String dadosAnimal(){
        String dadosAnimal = nome + " eh " + getDescricao() + " que faz " + som + " e ";
        return dadosAnimal;
    }
    
    public abstract String getDescricao();
    
    @Override
    public abstract Animal clone() throws CloneNotSupportedException;
}

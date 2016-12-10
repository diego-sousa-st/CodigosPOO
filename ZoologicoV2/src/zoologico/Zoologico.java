/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Zoologico {
    private ArrayList<Animal> animais;
    
    public Zoologico(){
        animais = new ArrayList<Animal>();
    }
    /**
     * Sobrecarga de método ao realizar o cadastro
     * @param nome nome do animal
     * @param tipo tipo dele(int advindo da interface)
    */
    public void cadastrarAnimal(String nome, int tipo){
        Animal animal;
        if(tipo == 4){
            animal = new Galinha(nome);
        }
        else{
            animal = new Aguia(nome);
        }
        animais.add(animal);
    }
    
    public void cadastrarAnimal(String nome, String corPelo, int tipo){
        Animal animal;
        if(tipo == 1){
            animal = new Lobo(corPelo,nome);
        }
        else if( tipo == 2){
            animal = new Cachorro(corPelo,nome);
        }
        else {
            animal = new Gato(corPelo,nome);
        }
        animais.add(animal);
    }
    
    public String listarNomesEspecies(){
        String aux = "";
        for(Animal animal : animais){
            aux += animal.getNome()+" eh "+animal.getDescricao()+"\n";
        }
        return aux;
    }
    
    private Animal buscarAnimal(String nome){
        for(Animal animal : animais){
            if(animal.getNome().equals(nome))
                return animal;
        }
        return null;
    }
    
    public String emiteSom(String nome){
        Animal animal = buscarAnimal(nome);
        if(animal == null)
            return "Animal não encontrado!";
        return animal.getSom();
    }
    
    public String exibirDadosAnimal(String nome){
        Animal animal = buscarAnimal(nome);
        if(animal == null)
            return "Animal não encontrado!";
        return animal.dadosAnimal();
    }
}

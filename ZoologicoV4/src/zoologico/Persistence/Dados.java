/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico.Persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import zoologico.Model.Aguia;
import zoologico.Model.Animal;
import zoologico.Model.Cachorro;
import zoologico.Model.Galinha;
import zoologico.Model.Gato;
import zoologico.Model.Lobo;
import zoologico.Model.Mamifero;

/**
 *
 * @author diego
 */
public class Dados {
    private String nomeArquivo;
    
    public Dados(){
        nomeArquivo = "animais.txt";
    }
    
    private String animalToString(Animal animal){
        String aux = "";
        if(animal instanceof Lobo){
            aux += "1;";
        }
        else if(animal instanceof Cachorro){
            aux += "2;";
        }
        else if(animal instanceof Gato){
            aux += "3;";
        }
        else if(animal instanceof Galinha){
            aux += "4;";
        }
        else if(animal instanceof Aguia){
            aux += "5;";
        }
        if(animal instanceof Mamifero){
            aux += ((Mamifero) animal).getCorPelo()+";";
        }
        aux += animal.getNome()+"\n";
        return aux;
    }
    
    public void salvarDados(ArrayList<Animal> animais){
        try{
            FileWriter arquivo = new FileWriter(nomeArquivo);
            for(Animal animal : animais){
                String aux = animalToString(animal);
                arquivo.write(aux);
            }
            arquivo.close();
        }
        catch(Exception e){
            
        }
    }
    
    private Animal instanciarAnimais(String[] termos){
        Animal animal = null;
        if(termos[0].equals("1")){
            animal = new Lobo(termos[1],termos[2]);
        }
        else if(termos[0].equals("2")){
            animal = new Cachorro(termos[1],termos[2]);
        }
        else if(termos[0].equals("3")){
            animal = new Gato(termos[1],termos[2]);
        }
        else if(termos[0].equals("4")){
            animal = new Galinha(termos[1]);
        }
        else if(termos[0].equals("5")){
            animal = new Aguia(termos[1]);
        }
        return animal;
    }
    
    public ArrayList<Animal> carregarDados(){
        ArrayList<Animal> animais = new ArrayList<Animal>();
        try{
            BufferedReader arquivo = new BufferedReader(new FileReader(nomeArquivo));
            String linha = arquivo.readLine();
            while(linha != null){
                String[] termos = linha.split(";");
                animais.add(instanciarAnimais(termos));
                linha = arquivo.readLine();
            }
            arquivo.close();
        }
        catch(Exception e){
            
        }
        return animais;
    }
}

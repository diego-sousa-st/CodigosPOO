/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico.Controller;

import java.util.ArrayList;
import zoologico.Model.Aguia;
import zoologico.Model.Animal;
import zoologico.Model.Cachorro;
import zoologico.Model.Galinha;
import zoologico.Model.Gato;
import zoologico.Model.Lobo;
import zoologico.Persistence.Dados;

/**
 * Classe de controle responsável por gerenciar as ações do zoologico. Incluindo cadastro de animais,
 * listagem dos animais, busca por animal, e recuperação de dados de um animal
 * @author diego
 */
public class Zoologico {
    private ArrayList<Animal> animais;
    private Dados dados;
    /**
     * Construtor da classe zoologico que inicializa a camada de dados e carrega os animais
     * a partir de arquivos
     */
    public Zoologico(){
        dados = new Dados();
        animais = dados.carregarDados();
    }
    /**
     * Método sobrecarregado que cadastra aves no sistema
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
    /**
     * Método sobrecarregado que cadastra Mamiferos no sistema
     * @param nome nome do animal
     * @param corPelo cor do pelo do animal
     * @param tipo tipo dele(advindo da interface)
     */
    public void cadastrarAnimal(String nome, String corPelo, int tipo){
        Animal animal;
        if(tipo == 1){
            animal = new Lobo(corPelo,nome);
        }
        else if(tipo == 2){
            animal = new Cachorro(corPelo,nome);
        }
        else {
            animal = new Gato(corPelo,nome);
        }
        animais.add(animal);        
    }
    /**
     * Método que retorna o nome e a especie de todos os animais do zoologico
     * @return String que contém o nome e a especie de todos os animais separadas por \n
     */
    public String listarNomesEspecies(){
        String aux = "";
        for(Animal animal : animais){
            aux += animal.getNome()+" eh "+animal.getDescricao()+"\n";
        }
        return aux;
    }
    /**
     * Método que busca um animal no sistema
     * @param nome nome do animal a ser buscado
     * @return Um objeto animal se ele for encontrado ou null caso contrário
     */
    private Animal buscarAnimal(String nome){
        for(Animal animal : animais){
            if(animal.getNome().equals(nome))
                return animal;
        }
        return null;
    }
    /**
     * Método que procura um animal e retorna o som emitido por ele ou uma mensagem de aviso caso
     * este animal não seja encontrado
     * @param nome nome do animal que deseja-se emitir o som
     * @return String contendo o som que o animal procurado faz
     */
    public String emiteSom(String nome){
        Animal animal = buscarAnimal(nome);
        if(animal == null)
            return "Animal não encontrado!";
        return animal.getSom();
    }
    /**
     * Método que procura um animal e retorna todos os dados dele ou uma mensagem de aviso caso
     * este animal não seja encontrado
     * @param nome nome do animal que deseja-se emitir o som
     * @return String contendo todos os dados de um animal
     */
    public String exibirDadosAnimal(String nome){
        Animal animal = buscarAnimal(nome);
        if(animal == null)
            return "Animal não encontrado!";
        return animal.dadosAnimal();
    }
    /**
     * Método que lista todas as espécies disponíveis no zoologico
     * @return String com as espécies disponíveis no zoologico
     */
    public String listarEspeciesDisponiveis(){
        return "1- lobo\n2- cachorro\n3- gato\n4- galinha\n5- águia";
    }
    /**
     * Método que clona o ArrayList do Zoologico contendo os animais, copiando o 
     * ArrayList para um novo ArrayList
     * @return ArrayList de animais clonado
     */
    private ArrayList<Animal> copiarArrayList(){
        ArrayList<Animal> clone = new ArrayList<Animal>();
        try{
            for(Animal animal : animais){
                clone.add(animal.clone());
            }
        }
        catch(Exception e){
            
        }
        return clone;
    }
    /**
     * Método que salva os dados em arquivos
     */
    public void salvarDados(){
        dados.salvarDados(copiarArrayList());
    }
}

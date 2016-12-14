/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico.Model;

/**
 * Classe que representa um animal no sistema, sendo superclasse de todos os animais em si
 * @author diego
 */
public abstract class Animal {
    private String nome;
    private String especie;
    private int qtdPatas;
    private String som;
    /**
     * Construtor da classe Animal que inicializa os atributos que todos os animais tem em comum
     * @param nome
     * @param especie
     * @param qtdPatas
     * @param som 
     */
    public Animal(String nome, String especie, int qtdPatas, String som){
        this.especie = especie;
        this.nome = nome;
        this.qtdPatas = qtdPatas;
        this.som = som;
    }
    /**
     * Método que retorna o nome do animal
     * @return nome do animal
     */
    public String getNome(){
        return nome;
    }
    /**
     * Método que retorna a especie do animal
     * @return especie do animal
     */
    public String getEspecie(){
        return especie;
    }
    /**
     * Método que retorna a quantidade de patas do animal
     * @return quantidade de patas do animal
     */
    public int getQtdPatas(){
        return qtdPatas;
    }
    /**
     * Método que retorna o som que um animal emite
     * @return som que o animal emite
     */
    public String getSom(){
        return som;
    }
    /**
     * Método que exibe todos os dados de um animal. Deve ser sobrescrito para estar completo.
     * @return String com todos os dados do animal
     */
    public String dadosAnimal(){
        String dadosAnimal = nome + " eh " + getDescricao() + " que faz " + som + " e ";
        return dadosAnimal;
    }
    /**
     * Método abstrato que deve ser sobrescrito retornando uma descrição da especie. Este método deve ser
     * sobrescrito devido à concordância nominal. Ex: "uma gato" deve ser "um gato" e "um aguia" deve ser
     * "uma aguia". Portanto cada animal que saberá como sobrescrever este método
     * @return String com a descrição da espécie
     */
    public abstract String getDescricao();
    /**
     * Método sobrescrito abstratamente que clona um animal e retorna um novo animal com os mesmos
     * atributos do animal original
     * @return cópia de um animal
     */
    @Override
    public abstract Animal clone() throws CloneNotSupportedException;
}

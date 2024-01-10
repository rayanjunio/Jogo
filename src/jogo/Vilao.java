package jogo;
public class Vilao extends Personagem{
    
    //atributos
    private int tempoDePrisao;
    
    //construtor
    public Vilao(String nome, String nomeVidaReal, int tempoDePrisao) {
        super(nome, nomeVidaReal);
        this.tempoDePrisao = tempoDePrisao;
    }   
}
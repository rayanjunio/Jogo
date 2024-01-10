package jogo;
public class SuperHeroi extends Personagem{
    
    //construtor
    public SuperHeroi(String nome, String nomeVidaReal) {
        super(nome, nomeVidaReal); // recebe os parâmetros e repassa para a classe mãe
    }
    
    public double getPoderTotal() {
        double tot = super.getPoderTotal(); //tot recebendo o Poder Total da classe mãe
        
        tot = (tot + (tot * 0.10)); // acrescentando 10%
        
        return tot; 
    }
}

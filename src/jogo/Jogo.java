package jogo;
public class Jogo {
    public static void main(String[] args) {
        SuperHeroi sp = new SuperHeroi("Homem aranha", "Peter Park"); // criando super heroi
        Vilao vilao = new Vilao("Octopus", "Otto Octavius", 7); // criando vilão
        
        //super poderes
        // criando super poder do heroi
        SuperPoder teia = new SuperPoder("soltar teia", 3); 
        
        SuperPoder escalada = new SuperPoder("andar em paredes", 2);
        
        SuperPoder apuracao = new SuperPoder("sentido apurado", 1);
        
        // criando super poder do vilão
        SuperPoder tentaculos = new SuperPoder("tentáculos indestrutíveis", 5);
        
        SuperPoder velocidade = new SuperPoder("velocidade", 1);
        
        //adicionando super poder ao heroi
        sp.adicionaSuperPoder(escalada);
        sp.adicionaSuperPoder(teia);
        sp.adicionaSuperPoder(apuracao);
        
        // adicionado super poder ao vilão
        vilao.adicionaSuperPoder(velocidade);
        vilao.adicionaSuperPoder(tentaculos); 
        
        //confronto
        Confronto combate = new Confronto(); // criando confronto
        
        combate.executar(sp, vilao); // executando confronto
        
        
    }
    
}

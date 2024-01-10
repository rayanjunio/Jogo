package jogo;
public class Confronto {
    
    //metodos
    public int executar(SuperHeroi superheroi, Vilao vilao) {
        if(superheroi.getPoderTotal() > vilao.getPoderTotal()) {
            System.out.println("Vitória do " + superheroi.getNome() + "!!!");// vitória do super heroi
            return 1;
            } else if (vilao.getPoderTotal() > superheroi.getPoderTotal()) {
                System.out.println("Vitória do " + vilao.getNome() + "!!!!");; // vitória do vilão
                return 2;
              }     else {
                        System.out.println("Empatou!!!"); // empate
                        return 0;
                    }  
    }   
}

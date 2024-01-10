package jogo;
public class Personagem {
    //atributos
    private String nome;
    private String nomeVidaReal;
    private SuperPoder poderes[] = new SuperPoder[4];
    
    //metodos
    
    public void adicionaSuperPoder(SuperPoder sp) {
        
        for (int i = 0; i < poderes.length; i++) {
            if (poderes[i] == null) {
                poderes[i] = sp;
                return; // Sai do método depois de adicionar o superpoder
            }
    }
}
    
    public double getPoderTotal() {
        double tot = 0;

        for (int i = 0; i < poderes.length; i++) {
            if (poderes[i] != null) { 
                tot = tot + poderes[i].getCategoria();
            }
        }
        return tot;
    }
    
    //construtor
    public Personagem(String nome, String nomeVidaReal) {
        this.nome = nome;
        this.nomeVidaReal = nomeVidaReal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeVidaReal() {
        return nomeVidaReal;
    }

    public void setNomeVidaReal(String nomeVidaReal) {
        this.nomeVidaReal = nomeVidaReal;
    }  
}

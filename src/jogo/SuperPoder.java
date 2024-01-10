package jogo;
public class SuperPoder {
    //atributos
    private String nome;
    private int categoria;

    //get e set
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getCategoria() {
        return this.categoria;
    }
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
    //construtor
    public SuperPoder(String nome, int categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }
}

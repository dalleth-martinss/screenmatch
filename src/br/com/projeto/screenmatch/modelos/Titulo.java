package br.com.projeto.screenmatch.modelos;

public class Titulo {
    String nome;
    private  int anoDeLancamento;
    private int duracaoEmMinutos;
    private  boolean incluidoNoplano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;


    public void exibeFichaTecnica (){   // void quer dizer que não tem retorno
        System.out.println("Nome do filme " + nome);
        System.out.println("Ano do lançamento " + anoDeLancamento);
        System.out.println("Duração de capitulos " + duracaoEmMinutos) ;
        System.out.println("Incluido no Plano " + incluidoNoplano);
    }
    public void avalia (double nota){

        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;

    }
    public double pegaMedia (){
        return  somaDasAvaliacoes / totalDeAvaliacoes;
    }
    public  String getNome(){
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean getIncluidoNoplano() {
        return this.incluidoNoplano;
    }

    public void setIncluidoNoplano(boolean incluidoNoplano) {
        this.incluidoNoplano = incluidoNoplano;
    }
    public int getDuracaoEmMinutos (){
        return this.duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() { // serve para encapsular os atributos privados
        return this.totalDeAvaliacoes;
    }
}

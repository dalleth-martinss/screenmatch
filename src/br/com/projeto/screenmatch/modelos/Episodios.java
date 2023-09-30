package br.com.projeto.screenmatch.modelos;

import br.com.projeto.screenmatch.calculos.Classificavel;

public class Episodios implements Classificavel {

    private int numero;
    private String nome;
    private Serie serie;
    private int totalDeVisualizacoes;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie() {

    }

    public int getTotalDeVisualizacoes() {
        return totalDeVisualizacoes;
    }

    public void setTotalDeVisualizacoes(int i) {
        this.totalDeVisualizacoes = totalDeVisualizacoes;
    }

    @Override
    public int getClassificacao() {

        if (totalDeVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
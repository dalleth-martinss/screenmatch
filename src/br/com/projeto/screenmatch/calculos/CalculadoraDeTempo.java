package br.com.projeto.screenmatch.calculos;

import br.com.projeto.screenmatch.modelos.Filme;
import br.com.projeto.screenmatch.modelos.Serie;
import br.com.projeto.screenmatch.modelos.Titulo;


public class CalculadoraDeTempo {

    private  int tempoTotal;


    public int getTempoTotal() {
        return this.tempoTotal;
    }
//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui (Titulo titulo){
        this.tempoTotal +=titulo.getDuracaoEmMinutos();

    }

}
// alt+ enter = import alguma classe
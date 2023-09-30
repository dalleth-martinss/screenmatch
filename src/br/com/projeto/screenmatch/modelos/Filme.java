package br.com.projeto.screenmatch.modelos;


import br.com.projeto.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public String getDiretor(){
        return diretor;
    }
    public void setDiretor (String diretor) {
        this.diretor = diretor;
    }


    @Override
    public int getClassificacao() {  // esse (int) dentro de () é chamado de casting- reforça que o result is whole.
        return (int) pegaMedia() / 2;
    }
}




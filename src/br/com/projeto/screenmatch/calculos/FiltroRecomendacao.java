package br.com.projeto.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os melhores");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        }  else {
            System.out.println("Adicione na sua lista, e assista depois");
        }

    }
}

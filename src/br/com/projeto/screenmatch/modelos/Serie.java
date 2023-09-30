package br.com.projeto.screenmatch.modelos;

public class Serie extends Titulo{

   private int temporadas;
   private int episodioPorTemporadas;
   private boolean ativa;
   private int minutosPorEpisodio;


   public int getTemporadas(){
       return temporadas;
   }
   public void setTemporadas(int temporadas){
       this.temporadas = temporadas;
   }
   public int getEpisodioPorTemporadas(){
      return episodioPorTemporadas;
   }
   public void setEpisodioPorTemporadas(int episodioPorTemporadas){
      this.episodioPorTemporadas = episodioPorTemporadas;
   }
   public boolean getAtiva(){
      return ativa;
   }
   public void setAtiva(){
      this.ativa = ativa;
   }
    public int getMinutosPorEpisodio(){
          return minutosPorEpisodio;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio){
          this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override  // é uma sobre escrita, uma alteraçao do metodo mãe ele faz exatamente a sobreescrição de um metodo. //vantagem de sobre escrever é
    // que ele avisa que na super classe foi alterado tmbm o metodo.

    public  int getDuracaoEmMinutos(){
          return temporadas * episodioPorTemporadas * minutosPorEpisodio;
    }
}




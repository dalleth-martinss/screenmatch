import br.com.projeto.screenmatch.calculos.CalculadoraDeTempo;
import br.com.projeto.screenmatch.calculos.FiltroRecomendacao;
import br.com.projeto.screenmatch.modelos.Episodios;
import br.com.projeto.screenmatch.modelos.Filme;
import br.com.projeto.screenmatch.modelos.Serie;


public class Principal {
    public static void main(String[] args) {

        Filme meufilme = new Filme();

        meufilme.setNome(" One Pierce ");
        meufilme.setAnoDeLancamento(1997);
        meufilme.setDuracaoEmMinutos(350);
        meufilme.setIncluidoNoplano(true);


        meufilme.exibeFichaTecnica();
        meufilme.avalia(10);
        meufilme.avalia(9.8);
        meufilme.avalia(9.9);
        meufilme.avalia(10);

        System.out.println("Média de avaliações do filme: " + meufilme.pegaMedia());

        Serie onePunch = new Serie();

        onePunch.setNome("One Punch");
        onePunch.setAnoDeLancamento(2015);
        onePunch.exibeFichaTecnica();

        onePunch.setTemporadas(3);
        onePunch.setEpisodioPorTemporadas(18);
        onePunch.setMinutosPorEpisodio(25);
        System.out.println("Duração para maratonar One Punch " + onePunch.getDuracaoEmMinutos());

        System.out.println("*************************************************************************");

        Filme outroFilme = new Filme();


        outroFilme.setNome(" Jhon Wick III ");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(240);
        outroFilme.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meufilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(onePunch);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meufilme);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setSerie();
        episodios.setTotalDeVisualizacoes(200);
        filtro.filtra(episodios);

    }
}
//ctrl+alt+i  auto identa

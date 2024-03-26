import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
   public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(1);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + meuFilme.pegaMedia());

        Serie twd = new Serie();
        System.out.println(" ");
        twd.setNome("The Walking Dead");
        twd.setAnoDeLancamento(2010);
        twd.exibeFichaTecnica();
        twd.setTemporadas(15);
        twd.setEpisidiosPorTemporada(16);
        twd.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar a série: " + twd.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("V - Ultimato");
        outroFilme.setAnoDeLancamento(2020);
        outroFilme.setDuracaoEmMinutos(120);
        outroFilme.setIncluidoNoPlano(true);
        System.out.println("Duração do filme: " + outroFilme.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(twd);
        System.out.println("A duração total é de: " +calculadora.getTempoTotal());

	   FiltroRecomendacao filtro = new FiltroRecomendacao();
	   filtro.filtra(meuFilme);

	   Episodio episodio = new Episodio();
	   episodio.setNumero(1);
	   episodio.setSerie(twd);
	   episodio.setTotalVizualizacoes(300);

	   filtro.filtra(episodio);

    }
}
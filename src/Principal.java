import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("O Poderoso Chefão");
        filme1.setAnoDeLancamento(1972);
        filme1.setDuracaoEmMinutos(175);
        filme1.setIncluidoNoPlano(true);

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);

        System.out.println("A média das avaliações é " + filme1.pegaMedia());
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvalicaoes());

        Serie serie1 = new Serie();
        serie1.setNome("Lost");
        serie1.setAnoDeLancamento(2004);
        serie1.exibeFichaTecnica();
        serie1.setTemporadas(6);
        serie1.setEpisodiosPorTemporada(15);
        serie1.setMinutosPorEpisodio(45);
        System.out.println("Duração para maratonar " + serie1.getNome() + ": " + serie1.getDuracaoEmMinutos());
    }
}

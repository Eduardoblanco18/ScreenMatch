public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvalicaoes;
    int duraçaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }
    
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvalicaoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvalicaoes;
    }
}

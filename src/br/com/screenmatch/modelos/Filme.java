package br.com.screenmatch.modelos;

public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvalicaoes;
    int duraçaoEmMinutos;

    public int getTotalDeAvalicaoes(){
        return totalDeAvalicaoes;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }
    
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvalicaoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvalicaoes;
    }
}

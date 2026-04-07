public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.nome = "O Poderoso Chefão";
        filme1.anoDeLancamento = 1972;
        filme1.duraçaoEmMinutos = 175;

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);

        System.out.println("A média das avaliações é " + filme1.pegaMedia());
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvalicaoes());
    }
}

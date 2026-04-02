public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.nome = "O Poderoso Chefão";
        filme1.anoDeLancamento = 1972;
        filme1.duraçaoEmMinutos = 175;

        System.out.println(filme1.nome);
        System.out.println(filme1.anoDeLancamento);
    }
}

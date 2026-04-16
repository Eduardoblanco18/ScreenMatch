package br.com.screenmatch.principal;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        Filme filmeNovo = new Filme("Dogville", 2003);
        filmeNovo.avalia(10);
        Serie minhaSerie = new Serie("Lost", 2004);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeNovo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(minhaSerie);
        for(Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());;
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Jackie Chan");
        buscaPorArtista.add("Tom Holland");
        buscaPorArtista.add("Chris Evans");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("Depois da ordenação:");
        System.out.println(buscaPorArtista);

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println("Depois da ordenação");
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}

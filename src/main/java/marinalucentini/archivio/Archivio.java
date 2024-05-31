package marinalucentini.archivio;

import com.github.javafaker.Faker;
import marinalucentini.Catalogo.Genere;
import marinalucentini.Catalogo.Libri;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Archivio {
    public static Genere randomGenere() {
        Random rdmn = new Random();
        int num = rdmn.nextInt(1, 6);
        Genere defaultgenere = Genere.FANTASY;
        switch (num) {
            case 1: {
                defaultgenere = Genere.HORROR;
                break;
            }
            case 2: {
                defaultgenere = Genere.ROMANZO;
                break;
            }
            case 3: {
                defaultgenere = Genere.SCIFI;
                break;
            }
            case 4: {
                defaultgenere = Genere.STORICO;
                break;
            }
            case 5: {
                defaultgenere = Genere.FANTASY;
                break;
            }
        }
        return defaultgenere;
    }

    public static List<Libri> generateLibri() {
        List<Libri> librirandom = new ArrayList<>();
        Faker faker = new Faker();
        Random rdmn = new Random();
        int randomPage = rdmn.nextInt(150, 2000);
        Supplier<Libri> randomLibri = () -> new Libri(faker.idNumber().hashCode(), faker.book().title(), faker.book().publisher(), randomPage, faker.book().author(), randomGenere());

        for (int i = 0; i < 30; i++) {
            Libri generateLibri = randomLibri.get();
            librirandom.add(generateLibri);
        }
        return librirandom;

    }
}

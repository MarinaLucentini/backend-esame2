package marinalucentini.archivio;

import com.github.javafaker.Faker;
import marinalucentini.Catalogo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Archivio {


    public static List<Catalogo> generateCatalogo() {
        List<Catalogo> catalogoList = new ArrayList<>();
        Faker faker = new Faker();
        Random rdmn = new Random();
        int randomPage = rdmn.nextInt(150, 2000);
        Supplier<Libri> randomLibri = () -> new Libri(faker.idNumber().hashCode(), faker.book().title(), faker.number().numberBetween(1920, 2024), randomPage, faker.book().author(), randomGenere());
        Supplier<Riviste> randomRiviste = () -> new Riviste(faker.idNumber().hashCode(), faker.book().title(), faker.number().numberBetween(1920, 2024), randomPage, randomPeriodicità());

        for (int i = 0; i < 30; i++) {
            Libri generateLibri = randomLibri.get();
            catalogoList.add(generateLibri);
            Riviste generateRiviste = randomRiviste.get();
            catalogoList.add(generateRiviste);
        }

        return catalogoList;
    }

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

    public static Periodicità randomPeriodicità() {
        Random rdmn = new Random();
        int num = rdmn.nextInt(1, 4);
        Periodicità defaultperiodicità = Periodicità.SEMESTRALE;
        switch (num) {
            case 1: {
                defaultperiodicità = Periodicità.MENSILE;
                break;
            }
            case 2: {
                defaultperiodicità = Periodicità.SETTIMANALE;
                break;
            }
            case 3: {
                defaultperiodicità = Periodicità.SEMESTRALE;
                break;
            }
        }
        return defaultperiodicità;


    }


    public static Riviste addRiviste(String titolo, int annopubblicazione, Periodicità periodicità) {
        Faker faker = new Faker();
        Random rdmn = new Random();
        int randomPage = rdmn.nextInt(150, 2000);
        Riviste addRivista = new Riviste(faker.idNumber().hashCode(), titolo, annopubblicazione, randomPage, periodicità);
        return addRivista;
    }

    public static Libri addLibri(String titolo, String autore, int annopubblicazione, Genere genere) {
        Faker faker = new Faker();
        Random rdmn = new Random();
        int randomPage = rdmn.nextInt(150, 2000);
        Libri libroToAdd = new Libri(faker.idNumber().hashCode(), titolo, annopubblicazione, randomPage, autore, genere);
        return libroToAdd;
    }

    public static void remove(List<Catalogo> catalogoList, int codiceId) {
        Catalogo elementoDaRimuovere = catalogoList.stream().filter(elemento -> elemento.getCodiceIsbn() == codiceId).toList().getFirst();
        catalogoList.remove(elementoDaRimuovere);
        System.out.println("Hai rimosso l'emento" + elementoDaRimuovere + "con successo");
    }

}

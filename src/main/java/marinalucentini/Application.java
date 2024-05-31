package marinalucentini;

import marinalucentini.Catalogo.*;
import marinalucentini.archivio.Archivio;

import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        List<Catalogo> catalogoList = Archivio.generateCatalogo();
        System.out.println(catalogoList);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Premi 1 se vuoi aggiungere un libro 2 se vuoi aggiungere una rivista o 0 per uscire");
            int sceltaUser = Integer.parseInt(scanner.nextLine());
            try {
                switch (sceltaUser) {
                    case 1: {
                        System.out.println("Dimmi il titolo del libro che vuoi aggiunge");
                        String titolo = scanner.nextLine();
                        System.out.println("Il nome dell'autore");
                        String autore = scanner.nextLine();
                        System.out.println("Anno di pubblicazione");
                        int anno = Integer.parseInt(scanner.nextLine());
                        System.out.println("Di che genere è il libro? Scegli 1 per Fantasy, 2 per Horror, 3 per Romanzo, 4 per Storico, 5 per Scifi");
                        int genere = Integer.parseInt(scanner.nextLine());
                        Genere defaultgenere = Genere.FANTASY;
                        switch (genere) {
                            case 1: {
                                defaultgenere = Genere.FANTASY;
                                break;
                            }
                            case 2: {
                                defaultgenere = Genere.HORROR;
                                break;
                            }
                            case 3: {
                                defaultgenere = Genere.ROMANZO;
                                break;
                            }
                            case 4: {
                                defaultgenere = Genere.STORICO;
                                break;
                            }
                            case 5: {
                                defaultgenere = Genere.SCIFI;
                                break;
                            }
                            default: {
                                defaultgenere = Genere.FANTASY;
                                break;
                            }
                        }

                        Libri libro =
                                Archivio.addLibri(titolo, autore, anno, defaultgenere);
                        catalogoList.add(libro);
                        System.out.println("Ecco la lista aggiornata");
                        catalogoList.forEach(catalogo -> System.out.println("Sigolo elemento" + catalogo));
                        break;
                    }
                    case 2: {
                        System.out.println("Dimmi il titolo della rivista ");
                        String titolo = scanner.nextLine();
                        System.out.println("Dimmi l'anno di pubblicazione");
                        int anno = Integer.parseInt(scanner.nextLine());
                        System.out.println("Premi 1 se la rivista è mensile, 2 se la rivista è settimanale, 3 se la rivista è semestrale");
                        int periodicità = Integer.parseInt(scanner.nextLine());
                        Periodicità defaultperiodicità = Periodicità.SEMESTRALE;
                        switch (periodicità) {
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
                            default: {
                                defaultperiodicità = Periodicità.SETTIMANALE;
                                break;
                            }
                        }
                        Riviste rivista = Archivio.addRiviste(titolo, anno, defaultperiodicità);
                        catalogoList.add(rivista);
                        System.out.println("Ecco la lista aggiornata");
                        catalogoList.forEach(catalogo -> System.out.println("Sigolo elemento" + catalogo));
                        break;
                    }

                    default: {
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                break;
            }
// non so perché non funziona poi lo rivedo
            if (sceltaUser == 0) {
                break;
            }
        }
        Archivio.remove(catalogoList, 1608446010);


    }
}

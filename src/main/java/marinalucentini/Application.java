package marinalucentini;

import marinalucentini.Catalogo.Libri;
import marinalucentini.Catalogo.Riviste;
import marinalucentini.archivio.Archivio;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Libri> archivioLibri = Archivio.generateLibri();
        System.out.println(archivioLibri);
        List<Riviste> archivioRiviste = Archivio.generateRiviste();
        System.out.println(archivioRiviste);

    }
}

package marinalucentini.Catalogo;

import java.time.LocalDate;

public class Libri extends Catalogo {
    String autore;
    Genere genere;


    public Libri(Long codiceIsbn, String titolo, LocalDate annoPubblicazione, int nPagine, String autore, Genere genere) {
        super(codiceIsbn, titolo, annoPubblicazione, nPagine);
        this.autore = autore;
        this.genere = genere;

    }
}

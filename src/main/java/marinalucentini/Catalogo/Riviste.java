package marinalucentini.Catalogo;

import java.time.LocalDate;

public class Riviste extends Catalogo {
    private Periodicità periodicità;


    public Riviste(Long codiceIsbn, String titolo, LocalDate annoPubblicazione, int nPagine, Periodicità periodicità) {
        super(codiceIsbn, titolo, annoPubblicazione, nPagine);
        this.periodicità = periodicità;
    }
}

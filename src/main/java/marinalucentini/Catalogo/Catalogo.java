package marinalucentini.Catalogo;

import java.time.LocalDate;

public abstract class Catalogo {
    private Long codiceIsbn;
    private String titolo;
    private LocalDate annoPubblicazione;
    private int nPagine;

    public Catalogo(Long codiceIsbn, String titolo, LocalDate annoPubblicazione, int nPagine) {
        this.codiceIsbn = codiceIsbn;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.nPagine = nPagine;
    }
}

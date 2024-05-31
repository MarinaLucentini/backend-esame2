package marinalucentini.Catalogo;

public abstract class Catalogo {
    private int codiceIsbn;
    private String titolo;
    private int annoPubblicazione;
    private int nPagine;

    public Catalogo(int codiceIsbn, String titolo, int annoPubblicazione, int nPagine) {
        this.codiceIsbn = codiceIsbn;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.nPagine = nPagine;
    }


    public int getCodiceIsbn() {
        return codiceIsbn;
    }


    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getnPagine() {
        return nPagine;
    }

    public void setnPagine(int nPagine) {
        this.nPagine = nPagine;
    }
}

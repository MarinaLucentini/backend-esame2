package marinalucentini.Catalogo;

public class Libri extends Catalogo {
    String autore;
    Genere genere;


    public Libri(int codiceIsbn, String titolo, int annoPubblicazione, int nPagine, String autore, Genere genere) {
        super(codiceIsbn, titolo, annoPubblicazione, nPagine);
        this.autore = autore;
        this.genere = genere;

    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libri{" + "Titolo= " + getTitolo() + '\'' +
                "autore='" + autore + '\'' +
                ", genere=" + genere + '\'' +
                "anno pubblicazione= " + getAnnoPubblicazione() + '\''
                + "Numero pagine= " + getnPagine() +
                "Codice" + getCodiceIsbn() +
                "}"
                ;
    }
}

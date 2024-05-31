package marinalucentini.Catalogo;

public class Riviste extends Catalogo {
    private Periodicità periodicità;


    public Riviste(int codiceIsbn, String titolo, int annoPubblicazione, int nPagine, Periodicità periodicità) {
        super(codiceIsbn, titolo, annoPubblicazione, nPagine);
        this.periodicità = periodicità;
    }

    public Periodicità getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(Periodicità periodicità) {
        this.periodicità = periodicità;
    }

    @Override
    public String toString() {
        return "Riviste{" +
                "Titolo= " + getTitolo() + "anno di pubblicazione= " + getAnnoPubblicazione() + "Numero di pagine= " + getnPagine() +
                "periodicità=" + periodicità +
                '}';
    }
}

package Model;

public class Carrello {
    public String acquirente,prodotto;
    int  quantita;
    double totale;

    public Carrello(String acquirente,String prodotto, int quantita, double totale)
    {
        this.acquirente =acquirente;
        this.prodotto = prodotto;
        this.quantita = quantita;
        this.totale = totale;
        
    }


    public String getAcquirente() {
        return acquirente;
    }

    public void setAcquirente(String acquirente) {
        this.acquirente = acquirente;
    }

    public String getProdotto() {
        return prodotto;
    }

    public void setProdotto(String prodotto) {
        this.prodotto = prodotto;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public double getTotale() {
        return totale;
    }

    public void setTotale(double totale) {
        this.totale = totale;
    }


	@Override
	public String toString() {
		return "Carrello [acquirente=" + acquirente + ", prodotto=" + prodotto + ", quantita=" + quantita + ", totale="
				+ totale + "]";
	}



    
    
}
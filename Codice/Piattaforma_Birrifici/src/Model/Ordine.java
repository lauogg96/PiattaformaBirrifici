package Model;
public class Ordine {
    public String cod_ordine, acquirenteOr , prodottoOr,stato;
    

    int quantita,gg,mm,aaaa;
    double prezzo;
    public Ordine(){ }
    
    public Ordine(int gg, int mm, int aaaa) 
    {
        this.gg = gg;
        this.mm = mm;
        this.aaaa = aaaa;
        
    }
    public Ordine(String acquirenteOr,int gg, int mm, int aaaa) 
    {
        this.gg = gg;
        this.mm = mm;
        this.aaaa = aaaa;
        this.acquirenteOr = acquirenteOr;
        
    }
    public Ordine(String cod_ordine, String acquirenteOr, String prodottoOr, int quantita, double prezzo, int gg, int mm, int aaaa,String stato)
    {
        this.cod_ordine = cod_ordine;
        this.acquirenteOr = acquirenteOr;
        this.prodottoOr = prodottoOr;
        this.quantita = quantita;
        this.prezzo = prezzo;
        this.gg = gg;
        this.mm = mm;
        this.aaaa = aaaa;
        this.stato=stato;
    }


    public String getCod_ordine() {
        return cod_ordine;
    }

    public void setCod_ordine(String cod_ordine) {
        this.cod_ordine = cod_ordine;
    }

    public String getAcquirenteOr() {
        return acquirenteOr;
    }

    public void setAcquirenteOr(String acquirenteOr) {
        this.acquirenteOr = acquirenteOr;
    }

    public String getProdottoOr() {
        return prodottoOr;
    }

    public void setProdottoOr(String prodottoOr) {
        this.prodottoOr = prodottoOr;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public int getGg() {
        return gg;
    }

    public void setGg(int gg) {
        this.gg = gg;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getAaaa() {
        return aaaa;
    }

    public void setAaaa(int aaaa) {
        this.aaaa = aaaa;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	@Override
	public String toString() {
		return "Ordine [cod_ordine=" + cod_ordine + ", acquirenteOr=" + acquirenteOr + ", prodottoOr=" + prodottoOr
				+ ", stato=" + stato + ", quantita=" + quantita + ", gg=" + gg + ", mm=" + mm + ", aaaa=" + aaaa
				+ ", prezzo=" + prezzo + "]";
	}


    
    

}
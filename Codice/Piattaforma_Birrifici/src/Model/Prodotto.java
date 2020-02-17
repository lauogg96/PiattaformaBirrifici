package Model;

public class Prodotto {
	String nome;
	String venditore;
	String colore;
	double gradazione;
	String descrizione;
	int quantita;
	double prezzo;
	String foto;
	
	public Prodotto(String nome, String venditore, String colore, double gradazione, String descrizione, int quantita,
			double prezzo,String foto) {
		super();
		this.nome = nome;
		this.venditore = venditore;
		this.colore = colore;
		this.gradazione = gradazione;
		this.descrizione = descrizione;
		this.quantita = quantita;
		this.prezzo = prezzo;
		this.foto=foto;
	}
	
	public Prodotto() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVenditore() {
		return venditore;
	}

	public void setVenditore(String venditore) {
		this.venditore = venditore;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public double getGradazione() {
		return gradazione;
	}

	public void setGradazione(double gradazione) {
		this.gradazione = gradazione;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
}

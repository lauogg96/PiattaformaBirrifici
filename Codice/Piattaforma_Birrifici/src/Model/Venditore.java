package Model;

public class Venditore {
	String pi;
	String password;
	String email;
	String ragioneSociale;
	String indirizzo;
	
	public Venditore(String pi, String password, String email, String ragioneSociale, String indirizzo) {
		super();
		this.pi = pi;
		this.password = password;
		this.email = email;
		this.ragioneSociale = ragioneSociale;
		this.indirizzo = indirizzo;
	}

	public Venditore() {
		super();
	}

	public String getPi() {
		return pi;
	}

	public void setPi(String pi) {
		this.pi = pi;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
}

package jana60Utente;

public class Utente {
//Attributi
	private String nome;
	private String cognome;
	private String email;
	private int eta;
	private String password;

	// Costruttore
	public Utente(String nome, String cognome, String email, String password, int eta) throws Exception {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.eta = eta;
		this.isValidEmail();
		this.passwordIsValid();
		this.ageIsValid();
	}

	// Getter&Setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	// Metodo validazione email

	private void isValidEmail() throws Exception {
		if (!email.contains("@") && !email.contains("."))
			throw new Exception("Email non valida ");
	}
	// Metodo eta maggiore di 18 anni

	private void ageIsValid() throws Exception {
		if (eta < 18)
			throw new Exception("Inserisci un eta maggiore di 18 ");
	}

	// Metodo password

	private void passwordIsValid() throws Exception {
		if (password.length() < 8)
			throw new Exception("Inserisci almeno 8 caratteri");

		if (password.length() > 12)
			throw new Exception("La password è troppo lunga. Sono consentiti max 12 caratteri ");
	}

}

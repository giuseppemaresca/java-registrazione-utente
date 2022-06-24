package jana60Utente;

import java.util.Scanner;

public class RegistrazioneMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean retry = true;
		do {
			System.out.println("Inserisci nome ");
			String nome = scan.nextLine();
			System.out.println("Inserisci cognome ");
			String cognome = scan.nextLine();
			try {
				System.out.println("Inserisci email che contenga almeno @ e .");
				String email = scan.nextLine();
				System.out.println("Inserisci Password fra 8 e 12 caratteri ");
				String password = scan.nextLine();
				System.out.println("Inserisci la tua eta maggiore di 18 anni  ");
				int eta = Integer.parseInt(scan.nextLine());
				Utente nuovoUtente = new Utente(nome, cognome, email, password, eta);
				System.out.println("nome :" + nuovoUtente.getNome() + "cognome " + nuovoUtente.getCognome() + " email "
						+ nuovoUtente.getEmail() + " eta " + nuovoUtente.getEta());
                  retry=false;
                  
                  nuovoUtente.getEmail();
                  nuovoUtente.setEmail("pippo");
			} catch (NumberFormatException eta) {
				System.out.println(eta.getMessage());
			} catch (Exception password) {
				System.out.println(password.getMessage());
			}
		} while (retry);

	}
}

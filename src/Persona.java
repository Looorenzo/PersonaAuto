/**
 * @version 3.0
 */
import java.util.*;

public class Persona {

	private String nome;

	private String cognome;

	private String indirizzo;

	private String dataN;

	private Auto[] autoPossedute;

	private int autoMax;

	private int contAuto;

	public Persona(String nome, String cognome, String indirizzo, String dataN, int autoMax) {
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.dataN = dataN;
		this.autoMax = autoMax;
		contAuto = 0;
		autoPossedute = new Auto[autoMax];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean aggiungiAuto(Auto a) {
		if (contAuto < autoMax) {
			autoPossedute[contAuto] = a;
			contAuto++;
			return true;
		}
		return false;
	}

	public boolean aggiungiAuto(String m, String t) {

		Auto a = new Auto(m, t);
		return aggiungiAuto(a);
	}

	public boolean cancAuto(String t) {
		for (int i = 0; i < contAuto; i++) {
			if (autoPossedute[i].getTarga().compareToIgnoreCase(t) == 0) {
				for (int k = i; k < contAuto - 1; k++) {
					autoPossedute[k] = autoPossedute[k + 1];

				}
				contAuto--;
				return true;
			}
		}
		return false;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getDataN() {
		return dataN;
	}

	public void setDataN(String dataN) {
		this.dataN = dataN;
	}

	public Auto[] cercaTarga(String t) {
		Auto[] vett = new Auto[contAuto];
		int c = 0;
		for (int i = 0; i < contAuto; i++)
			if (autoPossedute[i].getTarga().toLowerCase().contains(t.toLowerCase())) {
				vett[c] = autoPossedute[i];
				c++;
			}
		return vett;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < contAuto; i++) {
			s += autoPossedute[i] + "\n";
		}
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo + ", dataN=" + dataN + "]"
				+ "\n" + s;
	}

}

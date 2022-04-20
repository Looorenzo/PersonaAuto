
import java.util.*;

public class Auto {

	private String targa;

	private String modello;

	public Auto(String modello, String targa) {
		this.targa = targa;
		this.modello = modello;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String toString() {
		return "Auto [targa=" + targa + ", modello=" + modello + "]";
	}

}
package seminar2;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumireProiect;

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}


	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("");
		sb.append("Nume='").append(nume).append('\'');
		sb.append(", Prenume='").append(prenume).append('\'');
		sb.append(", Varsta=").append(varsta);
		sb.append(", Punctaj=").append(punctaj);
		sb.append(", Nr_proiecte=").append(nrProiecte);
		sb.append(", DenumireProiect=").append(Arrays.toString(denumireProiect));
		return sb.toString();
	}

	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setProiecte(String[] vect, int nr) {
		this.nrProiecte = nr;
		this.denumireProiect = new String[nr];
		for(int i=0;i<nrProiecte;i++){
			this.denumireProiect[i]=vect[i];
		}
	}
}

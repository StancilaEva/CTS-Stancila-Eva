package classes;

public interface IPersoana {
	public String getSex();
	
	public int getVarsta() throws CNPGresitException;
	
	public boolean checkCNP();
}

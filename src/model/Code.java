package model;

public class Code {
	
	private String codePostal;
	private String codeInsee;
	
	public Code(String codeInsee,String codePostal) {
		this.codeInsee = codeInsee;
		this.codePostal = codePostal;
		
	}

	public String getCodePostal() {
		return codePostal;
	}

	public String getCodeInsee() {
		return codeInsee;
	}
	

}

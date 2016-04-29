package model;

public class Projet {
	
	private String ville;
	private String commune;
	private String etablissement;
	private String serieL;
	private String serieES;
	private String serieS;
	private String serieSTMG;
	private String serieSTI2D;
	private String serieSTD2A;
	private String serieSTL;
	private String serieST2S;
	private String serieMusiqDanse;
	private String serieHotellerie;
	private String TotalSeries;
	
	

	public Projet(String ville, String commune, String etablissement, String serieL, String serieES, String serieS,
			String serieSTMG, String serieSTI2D, String serieSTD2A, String serieSTL, String serieST2S,
			String serieMusiqDanse, String serieHotellerie, String totalSeries) {
		
		this.ville = ville;
		this.commune = commune;
		this.etablissement = etablissement;
		this.serieL = serieL;
		this.serieES = serieES;
		this.serieS = serieS;
		this.serieSTMG = serieSTMG;
		this.serieSTI2D = serieSTI2D;
		this.serieSTD2A = serieSTD2A;
		this.serieSTL = serieSTL;
		this.serieST2S = serieST2S;
		this.serieMusiqDanse = serieMusiqDanse;
		this.serieHotellerie = serieHotellerie;
		this.TotalSeries = totalSeries;
	}
	
	public String getVille() {
		return ville;
	}

	public String getCommune() {
		return commune;
	}

	public String getEtablissement() {
		return etablissement;
	}

	public String getSerieL() {
		return serieL;
	}

	public String getSerieES() {
		return serieES;
	}

	public String getSerieS() {
		return serieS;
	}

	public String getSerieSTMG() {
		return serieSTMG;
	}

	public String getSerieSTI2D() {
		return serieSTI2D;
	}

	public String getSerieSTD2A() {
		return serieSTD2A;
	}

	public String getSerieSTL() {
		return serieSTL;
	}

	public String getSerieST2S() {
		return serieST2S;
	}

	public String getSerieMusiqDanse() {
		return serieMusiqDanse;
	}

	public String getSerieHotellerie() {
		return serieHotellerie;
	}

	public String getTotalSeries() {
		return TotalSeries;
	}
	
	
	

}

package dailyChallenge;

public class Home {
	
	private int nbrePiece;
	private int nbreFenetre;
	private String homeColor;
	private int nbreVeranda;
	
	public Home() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Home(int nbrePiece, int nbreFenetre, String homeColor, int nbreVeranda) {
		super();
		this.nbrePiece = nbrePiece;
		this.nbreFenetre = nbreFenetre;
		this.homeColor = homeColor;
		this.nbreVeranda = nbreVeranda;
	}

	public int getNbrePiece() {
		return nbrePiece;
	}

	public void setNbrePiece(int nbrePiece) {
		this.nbrePiece = nbrePiece;
	}

	public int getNbreFenetre() {
		return nbreFenetre;
	}

	public void setNbreFenetre(int nbreFenetre) {
		this.nbreFenetre = nbreFenetre;
	}

	public String getHomeColor() {
		return homeColor;
	}

	public void setHomeColor(String homeColor) {
		this.homeColor = homeColor;
	}

	public int getNbreVeranda() {
		return nbreVeranda;
	}

	public void setNbreVeranda(int nbreVeranda) {
		this.nbreVeranda = nbreVeranda;
	}
	
	public void buildHome() {
		
		System.out.println("Home [nbrePiece=" + nbrePiece + ", nbreFenetre=" + nbreFenetre + ", homeColor=" + homeColor
				+ ", nbreVeranda=" + nbreVeranda + "]");
		
	}

	@Override
	public String toString() {
		return "Home [nbrePiece=" + nbrePiece + ", nbreFenetre=" + nbreFenetre + ", homeColor=" + homeColor
				+ ", nbreVeranda=" + nbreVeranda + "]";
	}
	
	
	
	

}

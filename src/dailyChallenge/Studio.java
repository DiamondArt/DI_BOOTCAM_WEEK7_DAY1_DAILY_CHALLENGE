package dailyChallenge;

public class Studio extends Home {
	
	private int price;

	public Studio(int price) {
		super();
		this.price = price;
	}

	public Studio() {
		super();
	}

	public Studio(int nbrePiece, int nbreFenetre, String homeColor, int nbreVeranda) {
		super(nbrePiece, nbreFenetre, homeColor, nbreVeranda);
	}
	
	
	public void showHomeWithPrice() {
		
		System.out.println(this.toString() + "and studio price is" + price);
	
	}
	
	

}

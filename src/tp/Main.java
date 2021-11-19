package tp;

public class Main {

	public static void main(String[] args) {
		Cuisiniere C = new Cuisiniere();
		Appareil AP = new Appareil();
		C.setNbrfoyer(4);
		C.cuisiner();
		
		AP.setNom("Moule");
		AP.setprix(1234);
		AP.Aide();
	}

}

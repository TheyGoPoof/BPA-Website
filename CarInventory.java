
public class CarInventory {
	private boolean previouslyOwned;
	private int price;
	private String color;
	private String make;
	private String model;
	private int range;
	private String[] driveOptions = {"FWD", "RWD", "AWD", "4WD"};
	private String drive;
	private String engine;
	private boolean automatic;
	
	public CarInventory(boolean owned, int p, String c, String ma, String mo, int r, int d, String e, boolean a) {
		previouslyOwned = owned;
		price = p;
		color = c;
		make = ma;
		model = mo;
		range = r;
		drive = driveOptions[d];
		engine = e;
		automatic = a;
	}
	
	public void setPreviouslyOwned(boolean owned) {
		previouslyOwned = owned;
	}
	public void setPrice(int p) {
		price = p;
	}
	public void setColor(String c) {
		color = c;
	}
	public void setPreviouslyOwned(String ma) {
		make = ma;
	}
	public void setModel(String mo) {
		model = mo;
	}
	public void setRange(int r) {
		range = r;
	}
	public void setDrive(int d) {
		drive = driveOptions[d];
	}
	public void setEngine(String e) {
		engine = e;
	}
	public void setAutomatic(boolean a) {
		automatic = a;
	}
}

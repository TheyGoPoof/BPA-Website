import java.util.ArrayList;

public class CarInventory {
	private ArrayList<String[]> cars = new ArrayList<>();
	
	public CarInventory() {
		
	}

	public void createCar(String p, String mi, String ma, String mo, String m, String d, String e, String a) {
		String price = p;
		String miles = mi;
		String make = ma;
		String model = mo;
		String mpg = m;
		String drive = d;
		String engine = e;
		String automatic = a;
		String[] newCar = {price, miles, make, model, mpg, drive, engine, automatic};
		cars.add(newCar);
	}
	
	public String toString() {
		String Car = "";
		for (int i = 0; i < cars.size(); i++) {
			Car += "\n" + "----------CAR----------";
			Car += "\n" + cars.get(i)[0];
			Car += "\n" + cars.get(i)[1];
			Car += "\n" + cars.get(i)[2];
			Car += "\n" + cars.get(i)[3];
			Car += "\n" + cars.get(i)[4];
			Car += "\n" + cars.get(i)[5];
			Car += "\n" + cars.get(i)[6];
			Car += "\n" + cars.get(i)[7];
			Car += "\n" + i;
		}
		return Car;
	}
	public void setPrice(String p, int n) {
		cars.get(n)[0] = p;
	}
	public void setMiles(String mi, int n) {
		cars.get(n)[1] = mi;
	}
	public void setMake(String ma, int n) {
		cars.get(n)[2] = ma;
	}
	public void setModel(String mo, int n) {
		cars.get(n)[3] = mo;
	}
	public void setMpg(String m, int n) {
		cars.get(n)[4] = m;
	}
	public void setDrive(String d, int n) {
		cars.get(n)[5] = d;
	}
	public void setEngine(String e, int n) {
		cars.get(n)[6] = e;
	}
	public void setAutomatic(String a, int n) {
		cars.get(n)[7] = a;
	}
	public String getPrice(int n) {
		return cars.get(n)[0];
	}
	public String getMiles(int n) {
		return cars.get(n)[1];
	}
	public String getMake(int n) {
		return cars.get(n)[2];
	}
	public String getModel(int n) {
		return cars.get(n)[3];
	}
	public String getMpg(int n) {
		return cars.get(n)[4];
	}
	public String getDrive(int n) {
		return cars.get(n)[5];
	}
	public String getEngine(int n) {
		return cars.get(n)[6];
	}
	public String getAutomatic(int n) {
		return cars.get(n)[7];
	}
	public String[] getCar(int n) {
		return cars.get(n);
	}
}

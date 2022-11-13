import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws IOException {
		File database = new File("src/Car Database.txt");
		Scanner scan = new Scanner(database);
		FileWriter fw = new FileWriter(database, true);
		CarInventory inv = new CarInventory();
//		fw.write(inv.toString());
		while (scan.hasNext()) {
//			createCar(String price, String mileage, String make, String model, String mpg, String drive, String engine, String automatic)
			if (scan.nextLine().equals("----------CAR----------")) {
				String price = scan.nextLine();
				String miles = scan.nextLine();
				String make = scan.nextLine();
				String model = scan.nextLine();
				String mpg = scan.nextLine();
				String drive = scan.nextLine();
				String engine = scan.nextLine();
				String automatic = scan.nextLine();
				int carNum = Integer.parseInt(scan.nextLine());
				inv.createCar(price, miles, make, model, mpg, drive, engine, automatic);
			} else {
				break;
			}
		}
		
		System.out.println(inv.toString());
		scan.close();
		fw.close();
	}

}

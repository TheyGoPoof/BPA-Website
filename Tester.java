import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws IOException {
		File database = new File("src/Car Database.txt");
		Scanner scan = new Scanner(database);
//		FIND A WAY TO EFFECTIVELY WRITE TO FILES
		scan.close();
	}

}

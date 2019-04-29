package invetoryDetails;

import java.io.File;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class Inventory {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String path = "/home/admin1/invetory.json";
		File file = new File(path);
		ObjectMapper mapper = new ObjectMapper();
		int num = 0;
		try {
			JsonNode rootNode = mapper.readTree(file);
			do {
				System.out.println("Enter choice : ");
				System.out.println("1 for Roice" + "\n2 for Wheat" + "\n3for Pulses");
				num = sc.nextInt();

			} while (num < 0 || num > 4);
			{
				String InventoryProduct = "";
				switch (num) {
				case 1:
					InventoryProduct = "Rice";
					break;
				case 2:
					InventoryProduct = "Wheate";
					break;
				case 3:
					InventoryProduct = "Pulses";
					break;
				default:
					System.out.println("invalid choice ");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package regularExp;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RegularExpression {

	public static void main(String[] args) {

		Scanner scannerforString = new Scanner(System.in);

		// path of file stored in path variable
		final String path = "/home/admin1/re.json";
		File file = new File(path);

		// Object of ObjectMapper class
		ObjectMapper mapper = new ObjectMapper();
		try {
			System.out.println("mapper = " + mapper);
			// it reads string from j son file using read tree method of ObjectMapper class
			JsonNode rootNode = mapper.readTree(file);

			// it prints as it is json file
			System.out.println(" inside RootNode  :\n" + rootNode);

			// Object of json file UsernAme is assigned to value vARIABLE
			String values = "Username";

			// it prints objects of json file user name object key value pair
			// System.out.println("" + values);

			JsonNode username = rootNode.path(values);

			String str = username.asText();
			System.out.println("" + str);

			// take input from user to replace at first name
			System.out.println("Enter your First Name");
			String name = scannerforString.nextLine();
			if (Pattern.matches("[a-zA-Z]+", name)) {
				str = str.replace("<<name>>", name);
			}
			// input from user to replace Full name
			System.out.println("Enter your FullName..");
			String fullName = scannerforString.nextLine();
			if (Pattern.matches("[a-zA-Z.]+", fullName)) {
				str = str.replaceAll("<<full name>>", fullName);
			}

			System.out.println("Enter your Mobile Number  ");
			String phoneNumber = scannerforString.nextLine();
			// number should be 0-9 and 10 digits only
			if (Pattern.matches("[0-9]+", phoneNumber)) {
				if (phoneNumber.length() >= 10 && phoneNumber.length() <= 10) {

					str = str.replaceAll("x{10}", phoneNumber);
				} else {
					System.out.println("plese enter 10 digit number only");
				}
			}

			Date currentDate = new Date(); // reading current date
			SimpleDateFormat dateFormate = new SimpleDateFormat("dd/MM/yyyy");// date for mate
			String date = dateFormate.format(currentDate);
			str = str.replaceAll("dd/mm/yyyy", date);
			System.out.println("" + str);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		scannerforString.close();
	}

}

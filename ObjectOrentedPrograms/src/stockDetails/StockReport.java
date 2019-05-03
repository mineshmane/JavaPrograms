package stockDetails;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class StockReport {
	private List<Stock> stacks;

	public List<Stock> getStocks() {
		return stacks;
	}

	public void setStocks(List<Stock> stacks) {
		this.stacks = stacks;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);

		System.out.println("Enter N Number of Stocks.. ");
		int n_NumberOf_stock = scanner.nextInt();

		ObjectMapper mapper = new ObjectMapper();
		List<Stock> liststocks = new ArrayList();

		try {
			for (int i = 0; i < n_NumberOf_stock; i++) {
				//take input  user name from user
				System.out.println("Enter  User-Name ");
				String name = scanner1.nextLine();
				//take input company name
				System.out.println("Enter Company Name ");
				String company = scanner1.nextLine();

				System.out.println("Enter Company Symbol ");
				String symbol = scanner1.nextLine();

				System.out.println("Enter Number of Shares");
				int shares = scanner2.nextInt();

				System.out.println("Enter Price ");
				int price = scanner2.nextInt();

				int totalPrice = price * shares;
				System.out.println("The total price is:" + totalPrice);

				System.out.println("Done");
				System.out.println();

				Stock stock = new Stock();
				stock.setName(name);
				stock.setCompany(company);
				stock.setSymbol(symbol);
				stock.setShares(shares);
				stock.setPrice(price);
				stock.setTotalprice(totalPrice);
				liststocks.add(stock);
			}

			mapper.writeValue(new File("/home/admin1/stockReport.json"), liststocks);
			StockReport sockreport = new StockReport();
			sockreport.setStocks(liststocks);

			for (Stock s : sockreport.getStocks()) {
				System.out.println("User Name:" + s.getName() + "\nCompany Name:" + s.getCompany() +"\nCompany Symbol:"
						+ s.getSymbol() + "\nShares:" + s.getShares() + "\nPrice:" + s.getPrice() + "\nTotal Price:"
						+ s.getTotalprice() + "\n");

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scanner.close();
		scanner1.close();
		scanner2.close();
	}

}

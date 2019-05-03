package commercialDataPro;

import java.io.File;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import bridgeIT.Utility;

public class StockUtility {

	static ObjectMapper objectmapper = new ObjectMapper();

	/********************************************************************
	 * Purpose: This Method To add account if dosen't exits return:void *
	 ********************************************************************/

	public static void addAccount(String fileName) {
		fileName = "/home/admin1/eclipse-workspace/" + fileName;
		try {
			List<Customer> customerList = objectmapper.readValue(new File(fileName),
					new TypeReference<List<Customer>>() {
					});
			StockAccount stockAccount = new StockAccount();
			
			System.out.println("Enter Customer Name ");
			String customerName = Utility.getString().toUpperCase();
			
			if (searchCustomerIndex(customerName, customerList) == -1) {
				Customer newCustomer = new Customer(customerName);
				customerList.add(newCustomer);
				System.out.println("\nNew Customer added : " + customerName + "\n");
				stockAccount.save(fileName, customerList);
				System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Cust. Name", "IBM(Shares)", "Infosys(Shares)",
						"Wipro(Shares)");
				System.out.println("-----------------------------------------------------------------------------");
				System.out.println(customerList.get(searchCustomerIndex(customerName, customerList)).toString());
			} else {
				System.out.println("\nCustomer already exist!");
			}

		} catch (IOException e) {
			System.out.println("add method exception");
			e.printStackTrace();
		}
	}

	/******************************************************
	 * Purpose: To search by name of CustomerName return:int
	 ******************************************************/

	public static int searchCustomerIndex(String searchName, List<Customer> customerList) {
		int count = 0;
		int index = -1;
		//System.out.println(" list ="+customerList+" size = "+customerList.size());
		for (int i = 0; i < customerList.size(); i++) {
			count = 0;
			String custName = customerList.get(i).getName();
			if (searchName.compareTo(custName) == 0) {
				index = i;
	
				
				break;
			} else {
				count++;
		
			}
		}
		if (count != 0) {
			System.err.println("Customer not found!");
		}

		return index;
	}

	/*****************************************************
	 * Purpose: To search by symbol of company share return:int
	 ******************************************************/
	public static int searchSharesBySymbol(String symbol, List<CompanyShares> companySharesList) {
		int count = 0;
		int index = -1;
		for (int i = 0; i < companySharesList.size(); i++) {
			count = 0;
			String companySymbol = companySharesList.get(i).getStockSymbol();
			if (symbol.compareTo(companySymbol) == 0) {
				index = i;
				break;
			} else {
				count++;
			}
		}
		if (count != 0) {
			System.out.println("Customer not found!");
		}

		return index;
	}

}

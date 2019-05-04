package com.Address.Book;

import java.io.File;

public interface IAddress {
	

		/**
		* 	@purpose     :  To hold address path to save file read from //destination 
		*  @author       Nk.channaveera
		*  @version      : 1.0
		*  @since        : 29-03-2019
		*  
		***/
		{
			ObjectMapper objectmapper =new ObjectMapper();
			public static File getPathOfFile(String fileName, String fileExtension)
			{
				fileName = "/home/admin1/Documents/workourt/Java-Programs/src/com/BridgeIt/Oops/AddressBook/"
						+ fileName + fileExtension;
				
				File file = new File(fileName);
				
				return file;
			}
			public static void saveFile(File file)
			{
				List<Person> updatedList =FileSystem.getList();
				try {
					objectmapper.writerWithDefaultPrettyPrinter().writeValue(file, updatedList);
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			public static void readFile(File file)
			{
				try 
				{
					com.adress.book.AddressBook.FileSystem.setList(objectmapper.readValue(file, new TypeReference<List<Person>>() {}));
				} 
				catch (IOException e) 
				{
					System.out.println("\nFile Not Found!\n");
				}
		}
	
	

}

package com.Address.Book;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public interface IAddress {

	ObjectMapper objectmapper = new ObjectMapper();

	public static File getPathOfFile(String fileName, String fileExtension) {
		fileName = "/home/admin1/AddressBook/" + fileName
				+ fileExtension;

		File file = new File(fileName);

		return file;
	}

	public static void saveFile(File file) {
		List<Person> updatedList = FileSystem.getList();
		try {
			objectmapper.writerWithDefaultPrettyPrinter().writeValue(file, updatedList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readFile(File file) {
		try {
			 com.Address.Book.FileSystem.setList(objectmapper.readValue(file, new TypeReference<List<Person>>() {
					}));
		} catch (IOException e) {
			System.out.println("\nFile Not Found!\n");
		}
	}

}

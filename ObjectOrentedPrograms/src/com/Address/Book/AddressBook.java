package com.Address.Book;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	public static final String FileSystem = null;
	Scanner scannerString = new Scanner(System.in);
	Scanner scanner = new Scanner(System.in);
	
	private List<Person> newList = new ArrayList<Person>();
	FileSystem fileSystem = new FileSystem();
	
	static File file;
	private static String fileName;

	public AddressBook() {

	}

	public void createAddressBook() {
		System.out.println("Enter File name ");
		String fileName = scannerString.next();
		System.out.println("Enter FileExtion");
		String fileExtion = scanner.next();
		if (fileExtion.equals(".json") || fileExtion.equals(".txt")) { // fileExtion == ".json" || fileExtion == ".txt")
																		// {
			@SuppressWarnings("static-access")
			File newFile = fileSystem.createNewFile(fileName.trim(), fileExtion);
			setFile(newFile);
			setFileName(fileName + fileExtion);
			FileSystem.setList(newList);
			System.out.println("\nNew AddressBook Created!\n");
		} else {
			System.out.println("\nOnly .json and .txt files can be created!\n");
		}
	}

	public void openAddressBook() {
		System.out.println("Enter File name");
		String fileName = scannerString.nextLine();
		System.out.println("Enter FileExtion");
		String fileExtion = scanner.next();
		if (fileExtion.equals(".json") || fileExtion.equals(".txt")) {
			File openFile = IAddress.getPathOfFile(fileName, fileExtion);
			IAddress.readFile(openFile);
			setFile(openFile);
			setFileName(fileName + fileExtion);
		} else {
			System.out.println("\\n Only .json and .txt files can be created!\\n");
		}
	}

	public void addPerson(String firstName, String lastName, String address, String city, String state, String zip,
			String phone) {
		Person personnewEntry = new Person(firstName, lastName, address, city, state, zip, phone);
		newList = FileSystem.getList();
		newList.add(personnewEntry);
		FileSystem.setList(newList);
	}

	public void getFullOfPerson(String searchName) {
		int index = searchPersonbyFirstName(searchName);
		if (index >= 0) {
			System.out.println(FileSystem.getList().get(index).getFirstName() + " "+ FileSystem.getList().get(index).getLastName());
		} else {
			System.out.println("Person Not Found");
		}
	}

	public void updatePerson(int index, String address, String city, String state, String zip, String phone) {
		fileSystem.getList().get(index).getAddress();
		fileSystem.getList().get(index).getCity();
		fileSystem.getList().get(index).getState();
		fileSystem.getList().get(index).getZip();
		fileSystem.getList().get(index).getPhone();
		System.out.println("Person info updated successfully ");
	}

	public void removePerson(int index) {
		fileSystem.getList().remove(index);

	}

	public void sortByPersonName() {
		newList = fileSystem.getList();
		ZIPComparator compareByperson = new ZIPComparator();
		Collections.sort(newList, compareByperson);

	}

	public void sortByzip() {
		newList = fileSystem.getList();
		ZIPComparator compareByZip = new ZIPComparator();
		Collections.sort(newList, compareByZip);
	}

	public void printAll() {
		newList = fileSystem.getList();
		for (Person p : newList) {
			System.out.println(p.toString());
		}
	}

	// getters and Sterrs

	public List<Person> getPersonList() {
		return newList;
	}

	public void setPersonList(List<Person> personList) {
		this.newList = personList;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		AddressBook.file = file;
	}

	public int searchPersonbyFirstName(String keyFName) {
		int index = -1;
		for (int i = 0; i < com.Address.Book.FileSystem.getList().size(); i++) {
			String personFirstName = com.Address.Book.FileSystem.getList().get(i).getFirstName();
			if (keyFName.equals(personFirstName)) {
				index = i;
				break;
			}
		}

		return index;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		AddressBook.fileName = fileName;
	}
}

// comparator classes implementing comparator interface
class NameComparator implements Comparator<Person> {

	public int compare(Person personOne, Person personTwo) {
		return (personOne.getFirstName().compareTo(personTwo.getFirstName()));
	}

}

class ZIPComparator implements Comparator<Person> {

	@Override
	public int compare(Person personOne, Person personTwo) {

		int personOneZip = Integer.parseInt(personOne.getZip());
		int personTwoZip = Integer.parseInt(personTwo.getZip());
		if (personOneZip < personTwoZip) {
			return -1;
		} else if (personOneZip > personTwoZip) {
			return 1;
		}
		return 0;

	}

}

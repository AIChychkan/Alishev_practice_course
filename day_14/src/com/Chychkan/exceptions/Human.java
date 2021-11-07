package com.Chychkan.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by A.I.Chychkan on 05/11/2021
 */
public class Human {
	private String name;
	private int age;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public static List<Human> parseFileToObjList(File file){
		List<Human> peopleList = new ArrayList<>();

		try {
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] nameAgeString = line.split(" ");
				if (Integer.parseInt(nameAgeString[1]) < 0) throw new IllegalArgumentException();

				Human human = new Human(nameAgeString[0], Integer.parseInt(nameAgeString[1]));
				peopleList.add(human);
			}
			scanner.close();
			return peopleList;
		} catch (FileNotFoundException e){
			System.out.println("File not found.");
		} catch (IllegalArgumentException e){
			System.out.println("Incorrect file data.");
		}
		return null;
	}
}

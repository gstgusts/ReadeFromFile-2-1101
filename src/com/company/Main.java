package com.company;

public class Main {

    public static void main(String[] args) {
	   var fileReader = new FileReader();

	   var result = fileReader.getAllLines("test.txt");

        for (var line :
                result) {
            System.out.println(line);
        }
    }
}

package com.Malhi;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.File;
import java.io.PrintWriter;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	File file = new File("Account.txt");
        PrintWriter p = new PrintWriter(file);
        p.println("Hello");
        p.close();
    }
}

package com.Vlad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Computer comp = new Computer("Mac", 111);
        System.out.println(comp.toString());
        save(comp);
        comp.setId(222);
        comp.setIsOn("on");
        comp.setType("PC");
        System.out.println(comp.toString());
        save(comp);
        open(comp);
        System.out.println(comp.toString());
        Printer printer = new Printer(100, "Xerox", 1001);
        System.out.println(printer.toString());
        save(printer);
        printer.setId(1002);
        printer.setIsOnline("online");
        printer.setType("Brother");
        System.out.println(printer.toString());
        save(printer);
        open(printer);
        System.out.println(printer.toString());



    }

    public static List<String> openFile() {
        List<String> file = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        int i = 0;
        System.out.println("1 - to enter a String\n0 - to quit");
        while (work) {
            System.out.println("Choose 1 or 0");
            int opt = scanner.nextInt();
            switch (opt) {
                case 0: {
                    work = false;
                    break;
                }
                case 1: {
                    System.out.println("Enter value");
                    String value = scanner.next();
                    file.add(i, value);
                    i++;
                    break;
                }
            }

        }
        return file;
    }


    public static void save(ISaveable file) {
        for (int i = 0; i < file.write().size(); i++) {
            System.out.println("Saving " + file.write().get(i) + " to disk");
        }
    }

    public static void open(ISaveable file) {
        List<String> fileToOpen = openFile();
        file.read(fileToOpen);



    }

}

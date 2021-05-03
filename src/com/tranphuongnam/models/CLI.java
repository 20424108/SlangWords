package com.tranphuongnam.models;

import java.util.*;

public class CLI {
    protected SlangMap slangMap = new HashMap<String, String>();

    public CLI() {
        this.slangMap = slangMap;
        Scanner scanner = new Scanner(System.in);
        int input = 10;
        do {
            System.out.println(this.showMenu());
            System.out.print("Input: ");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    this.addStudent();
                    break;
                case 2:
                    this.updateStudent();
                    break;
                case 3:
                    this.deleteStudent();
                case 4:
                    System.out.println(this.studentList.csvAscendingId());
                    break;
                case 5:
                    System.out.println(this.studentList.csvDescendingId());
                    break;
                case 6:
                    System.out.println(this.studentList.csvAscendingGrade());
                    break;
                case 7:
                    System.out.println(this.studentList.csvDescendingGrade());
                    break;
                case 9:
                    this.exportToCsv();
                    break;
                default:
                    break;
            }
        } while (input != 0);
    }

    public String showMenu() {
        String menu = "-------------------------------------------------------".concat(System.lineSeparator())
                .concat("1. Add a student").concat(System.lineSeparator())
                .concat("2. Update a student").concat(System.lineSeparator())
                .concat("3. Delete a student").concat(System.lineSeparator())
                .concat("4. List ascending by ID").concat(System.lineSeparator())
                .concat("5. List descending by ID").concat(System.lineSeparator())
                .concat("6. List ascending by grade").concat(System.lineSeparator())
                .concat("7. List descending by grade").concat(System.lineSeparator())
                .concat("8. Import CSV").concat(System.lineSeparator())
                .concat("9. Export CSV").concat(System.lineSeparator())
                .concat("0. Exit").concat(System.lineSeparator())
                .concat("-------------------------------------------------------").concat(System.lineSeparator());
        return menu;
    }
}

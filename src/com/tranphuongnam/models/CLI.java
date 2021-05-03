package com.tranphuongnam.models;

import java.util.*;

public class CLI {
    protected SlangMap slangMap;

    public CLI() {
        this.slangMap = slangMap;
        Scanner scanner = new Scanner(System.in);
        int input = 10;
        do {
            System.out.println(this.showMenu());
            System.out.print("Input: ");
            input = scanner.nextInt();

        } while (input != 0);
    }

    public String showMenu() {
        String menu = "-------------------------------------------------------".concat(System.lineSeparator())
                .concat("1. List all slangs").concat(System.lineSeparator())
                .concat("2. Search by slang").concat(System.lineSeparator())
                .concat("3. Search by slang's definition").concat(System.lineSeparator())
                .concat("4. Show search history").concat(System.lineSeparator())
                .concat("-------------------------------------------------------").concat(System.lineSeparator());
        return menu;
    }
}

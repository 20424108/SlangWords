package com.tranphuongnam.models;

import java.io.*;
import java.util.*;

public class SlangMap {
    protected Map<String, String> slangMap = new HashMap<String, String>();
    public SlangMap(){}
    public void readFromFile() {
        try {
            File slangList = new File("data/SlangList.txt");
            Scanner scanner = new Scanner(slangList);
            while (scanner.hasNextLine()) {
                String slangStr = scanner.nextLine();
                Slang slang = new Slang(slangStr);
                this.slangMap.put(slang.slang, slang.definition);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

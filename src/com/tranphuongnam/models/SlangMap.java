package com.tranphuongnam.models;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class SlangMap {
    protected Map<String, String> slangMap = new HashMap<String, String>();

    public SlangMap(){}

    public Map<String, String> getSlangMap() {
        return this.slangMap;
    }

    public void setSlangMap(Map<String, String> slangMap) {
        this.slangMap = slangMap;
    }

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

    public Slang searchBySlang(String slang) {
        String definition = this.slangMap.get(slang);
        return new Slang(slang, definition);
    }

    public List<Slang> searchByDefinition(String keyword) {
        List<Slang> result = new ArrayList<Slang>();
        for (Map.Entry<String, String> entry : slangMap.entrySet()) {
            boolean match = Pattern.matches(".*" + keyword + ".*", entry.getValue());
            if (match) {
                result.add(new Slang(entry.getKey(), entry.getValue()));
            }
        }
        return result;
    }

    public int insertASlang(String slang, String definition) {
        if (this.slangMap.containsKey(slang)) {
            return 1;
        } else {
            this.slangMap.put(slang, definition);
            return 0;
        }
    }

    public int editASlang(String slangToEdit, String newDefinition) {
        if (this.slangMap.containsKey(slangToEdit)) {
            this.slangMap.put(slangToEdit, newDefinition);
            return 0;
        }
        else {
            return 1;
        }
    }

    public int deleteASlang(String slangToDelete) {
        if (this.slangMap.containsKey(slangToDelete)) {
            this.slangMap.remove(slangToDelete);
            return 0;
        }
        else {
            return 1;
        }
    }

    public void restore() {
        try {
            File slangList = new File("data/OriginalSlangs.txt");
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




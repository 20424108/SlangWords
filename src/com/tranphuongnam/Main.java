package com.tranphuongnam;

import com.tranphuongnam.models.Slang;
import com.tranphuongnam.models.SlangMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var slangMap = new SlangMap();
        slangMap.readFromFile();
        List<Slang> slangs = slangMap.searchByDefinition("do");
        for (Slang slang: slangs) {
            System.out.println(slang);
        }
    }
}

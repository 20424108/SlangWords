package com.tranphuongnam.models;

import java.util.*;

public class Slang {
    protected String slang;
    protected String definition;
    public Slang(){}

    public Slang(String slang, String definition) {
        this.slang = slang;
        this.definition = definition;
    }

    public Slang(String slang) {
        String[] slangSlice = slang.split("`");
        this.slang = slangSlice[0];
        this.definition = slangSlice[1];
    }

    @Override
    public String toString() {
        String slang = "----------------------------------------".concat(System.lineSeparator())
                .concat(String.format("Slang: %s", this.slang)).concat(System.lineSeparator())
                .concat(String.format("Definition: %s", this.definition)).concat(System.lineSeparator())
                .concat("----------------------------------------").concat(System.lineSeparator());
        return slang;
    }

    public String getSlang() {
        return this.slang;
    }

    public void setSlang(String slang) {
        this.slang = slang;
    }

    public String getDefinition() {
        return this.definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}

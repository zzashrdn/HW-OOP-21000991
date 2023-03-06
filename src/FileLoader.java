package com.example.mathcompetencysurvey;

import java.io.File;
import java.io.FileNotFounfException;
import java.util.Scanner;

public class FileLoader {
    private String filename;

    public FileLoader(String filename) {
        this.filename = filename;
    }

    public void readAnddisplay() {
        try {
            File myObj = new File(this.filename);
            Scanner myReader = new Scanner
        }
    }

    public static void main(String args[]) {
        FileLoader fl = new FileLoader("filename.txt");
        System.out.println(fl.getFilename());
        fl.readAnddisplay();


    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}

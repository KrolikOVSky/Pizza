package com.pizza.files.setting;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InfoFromFile {
    private String content;

    public InfoFromFile(){

    }

    private static String readUsingFiles(String fileName)  {
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

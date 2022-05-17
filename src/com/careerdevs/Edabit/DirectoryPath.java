package com.careerdevs.Edabit;

public class DirectoryPath {

    public static String getFilename(String path) {
        String arr [] = path.split("/");
        return arr[arr.length -1 ];

    }
}


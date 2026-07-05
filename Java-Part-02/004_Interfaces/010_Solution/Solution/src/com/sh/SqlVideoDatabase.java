package com.sh;

public class SqlVideoDatabase implements VideoDatabase {

    @Override
    public void store(Video video) {
        System.out.println("Storing video metadata");
        System.out.println("title: "+ video.getTitle());
        System.out.println("file name: "+ video.getFileName());
        System.out.println("Done!\n");
    }
}
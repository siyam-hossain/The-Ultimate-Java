package com.sh;

public class VideoDatabase {

    public void store(Video video) {
        System.out.println("Storing video '" + video.getTitle() + "' in the database.");
    }
}
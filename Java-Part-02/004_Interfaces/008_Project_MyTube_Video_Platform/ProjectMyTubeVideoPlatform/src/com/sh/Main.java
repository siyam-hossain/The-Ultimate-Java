package com.sh;

public class Main {
    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Siyam's birthday");
        video.setUser(new User("s@gmail.com"));

        var processor = new VideoProcessor();
        processor.process(video);
    }
}

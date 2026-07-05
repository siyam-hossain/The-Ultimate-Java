package com.sh;

public class CVideoEncoder implements VideoEncoder {

    @Override
    public void encode(Video video) {
        System.out.println("Encoding video: " + video.getTitle());
    }
}
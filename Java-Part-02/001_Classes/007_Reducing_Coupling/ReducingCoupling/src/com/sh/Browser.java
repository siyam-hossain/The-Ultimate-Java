package com.sh;

public class Browser {
    public void navigate(String address){
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    /*
        by giving private access modifier to the methods we reduce coupling
     */

    private String sendHttpRequest(String ip) {
        return "<h1></h1>";
    }

    private String findIpAddress(String address) {
        return "127.0.0.1";
    }
}

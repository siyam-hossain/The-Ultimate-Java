package com.sh;

public class EmailService {

    public void sendEmail(User user) {
        System.out.println("Sending email to " + user.getEmail());
    }
}
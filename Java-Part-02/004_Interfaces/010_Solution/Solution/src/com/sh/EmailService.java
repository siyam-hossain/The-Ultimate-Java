package com.sh;

public class EmailService implements NotificationService {

    @Override
    public void sendEmail(User user) {
        System.out.println("Sending email to " + user.getEmail());
    }
}
package com.serhiihonchar.userloginandregistrationplusemailverification.email;

public interface EmailSender {
    void send(String to, String email);
}

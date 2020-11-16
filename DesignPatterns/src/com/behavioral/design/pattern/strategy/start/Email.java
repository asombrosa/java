package com.behavioral.design.pattern.strategy.start;

public class Email implements ShareStrategy {
    public void share() {
        System.out.println("I'm emailing the photo");
    }
}

package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("Cricket coach");
    }

    public String getDailyWorkout() {
        return "Practice Bowling!";
    }
}

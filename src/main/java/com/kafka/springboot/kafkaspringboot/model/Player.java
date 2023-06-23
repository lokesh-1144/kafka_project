package com.kafka.springboot.kafkaspringboot.model;

public class Player {

    private int id;
    private String name;
    private String country;
    private int runs;

    public Player() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player(int id, String name, String country, int runs) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.runs = runs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }
}

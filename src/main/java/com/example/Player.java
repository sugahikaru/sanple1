package com.example;

import java.util.Objects;

public class Player {

    private Integer id;
    private String name;

    private int number;

    private String team;

    public Player(Integer id, String name, int number, String team) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.team = team;
    }

    public Player(String name, int number, String team) {
        this.name = name;
        this.number = number;
        this.team = team;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getTeam() {
        return team;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTeam(String team) {
        this.team = team;
    }


}
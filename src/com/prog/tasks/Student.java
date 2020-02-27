package com.prog.tasks;

public class Student {
    private String name;
    private long number;
    private int yearOfBirth;
    private String cityOfBirth;

    public Student(String name, long number, int yearOfBirth, String cityOfBirth) {
        this.name = name;
        this.number = number;
        this.yearOfBirth = yearOfBirth;
        this.cityOfBirth = cityOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }
}


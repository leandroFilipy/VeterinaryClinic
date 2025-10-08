package org.example.model;

public class Animal {

    private int id;
    private String name;
    private String specie;
    private String race;
    private int age;
    private int idOwner;


    public Animal(){

        this.name="";
        this.specie="";
        this.race="";
        this.age=0;
        this.idOwner=0;
    }

    public Animal(int id, String name, String specie, String race, int age, int idOwner) {
        this.id = id;
        this.name = name;
        this.specie = specie;
        this.race = race;
        this.age = age;
        this.idOwner = idOwner;
    }
    public Animal(String name, String specie, String race, int age, int idOwner) {
        
        this.name = name;
        this.specie = specie;
        this.race = race;
        this.age = age;
        this.idOwner = idOwner;
    }

    public Animal(String animalName2, String animalSpecie, String animalSpecie1, String animalRace2, int animalAge, int animalOwner) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

}

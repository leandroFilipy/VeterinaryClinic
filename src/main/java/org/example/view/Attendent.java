package org.example.view;

import java.util.Scanner;

public class Attendent {

    Scanner read = new Scanner(System.in);

    public int menu(){

        System.out.println("===================================================");
        System.out.println("||          Welcome to Veterinary Clinic         ||");
        System.out.println("||-----------------------------------------------||");
        System.out.println("||                                               ||");
        System.out.println("|| 1 - Register Client                           ||");
        int decision = read.nextInt();

        read.nextLine();

        return decision;
    }


    public String clientName(){

        System.out.println("");
        System.out.println("||-----------------------------------------------||");
        System.out.println("||                New Client's name                ||");
        System.out.println("||-----------------------------------------------||");
        System.out.print("|| - Put here: ");
        String clientName = read.nextLine();

        return clientName;
    }
    public String clientCpf(){

        System.out.println("");
        System.out.println("||-----------------------------------------------||");
        System.out.println("||                New Client's CPF               ||");
        System.out.println("||-----------------------------------------------||");
        System.out.print("|| - Put here: ");
        String clientCpf = read.nextLine();

        return clientCpf;
    }
    public String clientPhone(){

        System.out.println("");
        System.out.println("||-----------------------------------------------||");
        System.out.println("||               New Client's Phone              ||");
        System.out.println("||-----------------------------------------------||");
        System.out.print("|| - Put here: ");
        String clientPhone = read.nextLine();

        return clientPhone;
    }
    public void clientRegistered(){
        System.out.println("");
        System.out.println("||-----------------------------------------------||");
        System.out.println("||                New Client's CPF               ||");
        System.out.println("||-----------------------------------------------||");

    }
    public String animalName(){

        System.out.println("");
        System.out.println("||-----------------------------------------------||");
        System.out.println("||                New Animal's Name              ||");
        System.out.println("||-----------------------------------------------||");
        System.out.print("|| - Put here: ");
        String animalName = read.nextLine();

        return animalName;
    }
    public String animalSpecie(){

        System.out.println("");
        System.out.println("||-----------------------------------------------||");
        System.out.println("||              New Animal's Specie              ||");
        System.out.println("||-----------------------------------------------||");
        System.out.print("|| - Put here: ");
        String animalSpecie = read.nextLine();

        return animalSpecie;
    }
    public String animalRace(){

        System.out.println("");
        System.out.println("||-----------------------------------------------||");
        System.out.println("||              New Animal's Race                ||");
        System.out.println("||-----------------------------------------------||");
        System.out.print("|| - Put here: ");
        String animalRace = read.nextLine();

        return animalRace;
    }
    public int animalAge(){

        System.out.println("");
        System.out.println("||-----------------------------------------------||");
        System.out.println("||               New Animal's Age                ||");
        System.out.println("||-----------------------------------------------||");
        System.out.print("|| - Put here: ");
        int animalAge = read.nextInt();

        read.nextLine();

        return animalAge;
    }
    public int animalOwner(){

        System.out.println("");
        System.out.println("||-----------------------------------------------||");
        System.out.println("||              New Animal's Owner               ||");
        System.out.println("||-----------------------------------------------||");
        System.out.print("|| - Put here: ");
        int animalAge = read.nextInt();

        read.nextLine();

        return animalAge;
    }




}

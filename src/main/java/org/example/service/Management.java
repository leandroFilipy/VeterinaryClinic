package org.example.service;

import org.example.dao.AnimalDao;
import org.example.dao.ClientDao;
import org.example.model.Animal;
import org.example.model.Client;
import org.example.view.Attendent;

import java.sql.SQLException;

public class Management {


    public void management(int decision2, Attendent attendent) throws SQLException {

        switch (decision2){


            case 1:

                String clientName2 = attendent.clientName();
                String clientCpf2 = attendent.clientCpf();
                String clientPhone2 = attendent.clientPhone();

                var client = new Client(clientName2,clientCpf2,clientPhone2);

                if (client.getName() == null || client.getCpf() == null){

                    System.err.println("Name or CPF are null");
                    return;
                }
                ClientDao clientDao = new ClientDao();



                if (clientDao.verifyIfClientAlreadYExist(client.getCpf())){

                    System.err.println("This Client already exits");
                    System.out.println("");
                    System.out.println("");
                    return;
                }


                attendent.clientRegistered();
                System.out.println("");
                System.out.println("");
                clientDao.registerClient(client);


                break;

            case 2:

                String animalName2 = attendent.animalName();
                String animalSpecie = attendent.animalSpecie();
                String animalRace2 = attendent.animalRace();
                int animalAge = attendent.animalAge();
                int animalOwner = attendent.animalOwner();

                AnimalDao animalDao = new AnimalDao();
                Animal animal = new Animal(animalName2, animalSpecie, animalSpecie, animalRace2, animalAge, animalOwner);

                if(animalDao.verifyIfTheOwnerHasAtLeastOneAnimalWithThisName(animalOwner,animalName2)){

                    System.out.println("This owner already has a pet with this name");
                    return;
                }

                animalDao.registerPet(animal);

                break;
        }

    }

}

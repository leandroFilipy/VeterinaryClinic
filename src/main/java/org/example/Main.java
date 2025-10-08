package org.example;


import org.example.model.Client;
import org.example.service.Management;
import org.example.view.Attendent;

import java.sql.SQLException;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Management management = new Management();
        Attendent attendent = new Attendent();
        Client client = new Client();



        while(true){


            try{

                int decision2 = attendent.menu();

                management.management(decision2, attendent);

            }catch (InputMismatchException e){
                main(args);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
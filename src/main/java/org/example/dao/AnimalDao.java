package org.example.dao;

import org.example.database.ConnectionClass;
import org.example.model.Animal;
import org.example.model.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnimalDao {

    public void registerPet(Animal animal, Client client)throws SQLException{

        String query = "INSERT INTO Animal (nome, especie, raca, idade, idCliente) VALUES (?,?,?,?,?);";

        try(Connection conn = ConnectionClass.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, animal.getName());
            stmt.setString(2, animal.getSpecie());
            stmt.setString(3, animal.getRace());
            stmt.setInt(4, animal.getAge());
            stmt.setInt(5, client.getId());
            stmt.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public boolean verifyIfTheOwnerHasAtLeastOneAnimalWithThisName(int ownerId, String animalName)throws SQLException {

        String query = "SELECT COUNT(*) FROM Animal WHERE idCliente = ? AND nome = ?";

        try(Connection conn = ConnectionClass.connect();
        PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setInt(1, ownerId);
            stmt.setString(2, animalName);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return rs.getInt(1) > 0;
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return false;
    }


    public void registerPet() {
    }

    public void registerPet(Animal animal) {
    }
}

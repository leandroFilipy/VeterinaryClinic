package org.example.dao;

import org.example.database.ConnectionClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.example.database.ConnectionClass;
import org.example.model.Client;

public class ClientDao {


    public void registerClient(Client client)throws SQLException{

        String query = "INSERT INTO Cliente (nome,cpf,telefone) VALUES (?,?,?);";

        try(Connection conn = ConnectionClass.connect();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, client.getName());
            stmt.setString(2, client.getCpf());
            stmt.setString(3, client.getPhone());
            stmt.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public boolean verifyIfClientAlreadYExist(String cpf) throws SQLException{

        String query = "SELECT COUNT(*) FROM Cliente WHERE cpf = ?;";

        try(Connection conn = ConnectionClass.connect();
        PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return rs.getInt(1) > 0;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return false;
    }

}

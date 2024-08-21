package org.example.daos;

import org.example.models.Role;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RolesDao {
    public List<Role> getAllRoles() throws SQLException {
        try(Connection connection = DatabaseConnector.getConnection()) {
            String query = "SELECT id, roleName, location, capability, band, closingDate, status FROM `role`;";
            PreparedStatement statement = connection.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();

            List<Role> roleList = new ArrayList<>();
            while (resultSet.next()) {
                roleList.add(new Role(
                        resultSet.getInt("id"),
                        resultSet.getString("roleName"),
                        resultSet.getString("location"),
                        resultSet.getString("capability"),
                        resultSet.getString("band"),
                        resultSet.getString("closingDate"),
                        resultSet.getString("status")
                        ));
            }
            return roleList;
        }
    }
}

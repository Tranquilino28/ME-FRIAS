/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mefrias.mefrias.security;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
/**
 *
 * @author TRANQUILINO-FRIAS
 */
public class GenerateIDUnique {
    private static final String CHARACTERS = "AABBCCDDEEFFGGHHIIJJKKLLMMNNOOPPQQRRSSTTUUVVWWXXYYZZ0123456789";//"ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int ID_LENGTH = 6;
    private static final int MAX_ATTEMPTS = 1000;

    
    public static String generateUniqueID() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(ID_LENGTH);
        Set<String> usedIDs = new HashSet<>();

        for (int i = 0; i < MAX_ATTEMPTS; i++) {
            sb.setLength(0); // Reset the StringBuilder
            for (int j = 0; j < ID_LENGTH; j++) {
                int index = random.nextInt(CHARACTERS.length());
                char character = CHARACTERS.charAt(index);
                sb.append(character);
                
            }
            String id = sb.toString();
            if (!usedIDs.contains(id)) {
                usedIDs.add(id);
                return id;
            }
        }

        throw new RuntimeException("Unable to generate a unique ID.");
    }
    
    public static String generateUniqueID(List listDatabase ) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(ID_LENGTH);
        
        Set<String> usedIDs = new HashSet<>();

        for (int i = 0; i < MAX_ATTEMPTS; i++) {
            sb.setLength(0); // Reset the StringBuilder
            for (int j = 0; j < ID_LENGTH; j++) {
                int index = random.nextInt(CHARACTERS.length());
                char character = CHARACTERS.charAt(index);
                sb.append(character);
                
            }
            String id = sb.toString();
            if (!usedIDs.contains(id)) {
                usedIDs.add(id);
                return id;
            }
        }

        throw new RuntimeException("Unable to generate a unique ID.");
    }
}
/**
 * import java.sql.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UniqueIDGenerator {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int ID_LENGTH = 6;
    private static final int MAX_ATTEMPTS = 1000;
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String DB_USERNAME = "your_username";
    private static final String DB_PASSWORD = "your_password";
    
    public static void main(String[] args) {
        String uniqueID = generateUniqueID();
        System.out.println("Unique ID: " + uniqueID);
    }
    
    public static String generateUniqueID() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(ID_LENGTH);
        Set<String> usedIDs = getExistingIDsFromDatabase();
        
        for (int i = 0; i < MAX_ATTEMPTS; i++) {
            sb.setLength(0); // Reset the StringBuilder
            for (int j = 0; j < ID_LENGTH; j++) {
                int index = random.nextInt(CHARACTERS.length());
                sb.append(CHARACTERS.charAt(index));
            }
            String id = sb.toString();
            if (!usedIDs.contains(id)) {
                usedIDs.add(id);
                insertIDIntoDatabase(id);
                return id;
            }
        }
        
        throw new RuntimeException("Unable to generate a unique ID.");
    }
    
    public static Set<String> getExistingIDsFromDatabase() {
        Set<String> existingIDs = new HashSet<>();
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT id FROM your_table")) {
            
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                existingIDs.add(id);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return existingIDs;
    }
    
    public static void insertIDIntoDatabase(String id) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement("INSERT INTO your_table (id) VALUES (?)")) {
            
            statement.setString(1, id);
            statement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
 */

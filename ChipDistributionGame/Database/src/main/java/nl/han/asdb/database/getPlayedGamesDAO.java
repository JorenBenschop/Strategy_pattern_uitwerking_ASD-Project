package nl.han.asdb.database;

import java.sql.*;

public class getPlayedGamesDAO {

    public static void createNewDatabase(String fileName) {
        String url = "jdbc:sqlite:C:/sqlite/" + fileName;
        try {
            Connection conn = DriverManager.getConnection(url);
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void getPlayedGames(){

        String sql1 = "SELECT * FROM GameInfo";
        String sql2 = "SELECT * FROM EntityStatistics";
        try {
            Connection conn = this.connect();
            Statement stmt  = conn.createStatement();
            ResultSet rs1   = stmt.executeQuery(sql1);
            ResultSet rs2   = stmt.executeQuery(sql2);
            // loop through the result set
            System.out.println("GameInfo:");
            System.out.println("Aantal rondes = " + rs1.getInt("numberOfRounds"));
            System.out.println("Type van de game = " + rs1.getString("gameType"));
            while (rs2.next()) {
                System.out.println("Ronde = " + rs2.getInt("roundNumber"));
                System.out.println("Speler = " + rs2.getInt("entityId"));
                System.out.println("Afdeling = " + rs2.getString("entityType"));
                System.out.println("Stock = " + rs2.getInt("stock"));
                System.out.println("Kosten = " + rs2.getInt("costs"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:C://sqlite/playedGames.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void main(String[] args) {
        createNewDatabase("playedGames.db");
        connect();
        getPlayedGames();
    }
}


package platziapp;

import java.sql.Connection;

public class Starter {
    public static void main(String[] args) {
        Connect connection = new Connect();
        Connection cnx = connection.get_connection();
    }
}

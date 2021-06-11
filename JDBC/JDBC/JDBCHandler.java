//package .JDBC;

import org.sqlite.JDBC;
import java.sql.*;


public class JDBCHandler {
    public static class Handle {
        public static Connection conn = null;

        public static void Connect() {
            System.out.println("Connecting to SQLite database...");
            try {
                // db parameters
                String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "/db/JDBCHandler.db";
                // create a connection to the database
                conn = DriverManager.getConnection(url);

                System.out.println("Connection to SQLite has been established.");

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        public static void Disconnect() {
            try {
                conn.close();
                conn = null;
                System.out.println("Connection Closed..");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                System.out.println("Is database connected?");
            }
        }

        public static void ExecuteSQL(String SQLQuery) {
            ExecuteSQL(SQLQuery, true);
        }

        public static void ExecuteSQL(String SQLQuery, boolean closeConnection) {
            if (conn != null) {
                try (Statement statement = conn.createStatement()
                ) {
                    statement.execute(SQLQuery);
                } catch (SQLException e) {
                    System.out.println("Err >> " + e);
                }

                if (closeConnection) Disconnect();
            } else {
                Connect();
                ExecuteSQL(SQLQuery);
            }

        }

        public static void getTablesNames() {
            if (conn != null) {
                try (ResultSet rs = conn.getMetaData().getTables(null, null, null, null)
                ) {
                    while (rs.next()) {
                        System.out.println(rs.getString("TABLE_NAME"));
                    }
                } catch (SQLException e) {
                    System.out.println("Err >> " + e);
                }
                Disconnect();
            } else {
                Connect();
                getTablesNames();
            }

        }


    }
}

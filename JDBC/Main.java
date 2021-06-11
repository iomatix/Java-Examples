
//import JDBC.JDBCHandler;

public class Main {

    public static void main(String[] args) {
        // write your code here
        JDBCHandler.Handle.Connect(); // Simple Connection
        JDBCHandler.Handle.Disconnect(); // Disconnect
        JDBCHandler.Handle.ExecuteSQL("CREATE TABLE IF NOT EXISTS TEST_TABLE ("
                + "	id integer PRIMARY KEY,"
                + "	test_text text NOT NULL,"
                + "	capacity real"
                + ");");
        JDBCHandler.Handle.ExecuteSQL("CREATE TABLE IF NOT EXISTS TEST_TABLE2 ("
                + "	id integer PRIMARY KEY,"
                + "	test_text text NOT NULL,"
                + "	capacity real"
                + ");");
        JDBCHandler.Handle.getTablesNames();
    }

}

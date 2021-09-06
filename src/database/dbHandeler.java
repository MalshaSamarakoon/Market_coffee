/*package database;

import java.sql.*;

    public class dbHandeler extends database.Config {

    Connection dbConnection;
    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://"+dbHost + ":" + dbPort + "/" + dbName;
        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString,dbUsername,dbPassword);

        return dbConnection;
    }

    public dbHandeler() throws SQLException, ClassNotFoundException{
        dbConnection=getDbConnection();


        // if (dbConnection == null)
        //   System.exit(status: 1);
    }

    public boolean isDbConnected() throws SQLException{
        return !dbConnection.isClosed();
    }

    public boolean loginNow(String user, String pass) throws SQLException, ClassNotFoundException{
        ResultSet resultSet=null;
        PreparedStatement PreparedStatement=null;

        String query ="SELECT * FROM " + database.Const.USER_TABLE + "WHERE " + database.Const.USER_USERNAME+ "=?" + "AND" + database.Const.USER_PASSWORD + "=?";


        PreparedStatement = getDbConnection().prepareStatement(query);

        PreparedStatement.setString(1, user);
        PreparedStatement.setString(2, pass);

        resultSet= PreparedStatement.executeQuery();

        if (resultSet.next()) {
            return true;
        }
        else {
            return false;
        }

    }
}

*/
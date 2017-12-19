package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;





public class DataLayer {
	private Connection connection;

	public void openConnection() {
		try {
			System.out.println("Loading JDBC Driver...");

			// DriverManager.registerDriver(new
			// com.microsoft.sqlserver.jdbc.SQLServerDriver());

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			System.out.println("JDBC Driver loaded");
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to load JDBC Driver!");

			// if loading driver failed, then it is no use to continue program => terminate
			System.exit(0);
		}

		// String databaseName = "master";
		String databaseName = "SkatDB";

		String connectionString = "jdbc:sqlserver://localhost:1433;" + "instanceName=SQLEXPRESS;" + "databaseName="
				+ databaseName + ";" + "integratedSecurity=true;";

		try {
			System.out.println("Connecting to database...");
			System.out.println(connectionString);

			connection = DriverManager.getConnection(connectionString);

			if (connection != null)
				System.out.println("Connected to database");
			else
				System.out.println("Could not connect to database");

			// connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> getAllby() {
		ArrayList<String> byer = new ArrayList<String>();
		try {
			Statement statement = connection.createStatement();

			String sql = "SELECT navn FROM skat ";
			System.out.println(sql);

			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
								
				byer.add(resultSet.getString("navn"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return byer;
	}
	public float getprocent(String navn) {
		try {
			String sql = "SELECT skatteprocent FROM skat WHERE navn=" + "'"+ navn+"'";
			System.out.println(sql);

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);

			if (resultSet.next())

				return resultSet.getFloat("skatteprocent");
			else

				return 0;
		} catch (SQLException e) {
			return 0;
		}

	}


}

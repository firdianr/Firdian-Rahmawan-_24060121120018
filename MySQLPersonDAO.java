/*
 * File		: MySQLPersonDAO.java	31 Mei 2023
 * Penulis	: Firdian Rahmawan (24060121120018)
 * Deskripsi	: implementasi PersonDAO untuk MySQL
 *
*/

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO{
	public void savePerson(Person person) throws Exception{
		String name = person.getName();
		String url = "jdbc:mysql://localhost:3306/pbo";
		String username = "root";
		String password = "F1rdianr";

		// membuat koneksi, nama db, user, password menyesuaikan
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username, password);

		// kerjakan mysql query
		String query = "INSERT INTO person(name) VALUES ('"+name+"')";
		System.out.println(query);
		Statement s = con.createStatement();
		s.executeUpdate(query);

		// tutup koneksi database
		con.close();
	}
}
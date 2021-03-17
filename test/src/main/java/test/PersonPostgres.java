package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class PersonPostgres {
		String URL = "jdbc:postgresql://" + "localhost" + ":5432/" + "postgres" + "?";
		String USERNAME = "postgres";
		String PASSWORD = "password";
			
		public void createPerson(Person person){
			String sql ="INSERT INTO persons(firstname,lastname,fatherid,motherid) VALUES (?, ?, ?, ?);";
			
			Connection conn;
			try {
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				PreparedStatement stmt;
				try {
					stmt = conn.prepareStatement(sql);
					stmt.setString(1, person.getFirstName());
					stmt.setString(2, person.getLastName());
					stmt.setInt(3, person.getFatherid());
					stmt.setInt(4, person.getMotherid());
					stmt.executeUpdate();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		public Person getPersonByName(String firstname, String lastname) {		
			Person person = null;		
			try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {//
				String sql = "select person_id,firstname,lastname from persons where firstname = '" + firstname + "' and lastname = '" + lastname + "' ;";
				Statement stmt = conn.createStatement();			
				ResultSet rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					System.out.println(rs.getString("person_id"));
					person = new Person();
					person.setPersonid(rs.getInt("person_id"));
					person.setFirstName(rs.getString("firstname"));
					person.setLastName(rs.getString("lastname"));
					
				}			
			} catch (SQLException e) {
			}
			return person;
		}
		
		
	public int getIDByName(String firstname, String lastname){//	
			Person person = null;		
			try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {//
				String sql = "select person_id,firstname,lastname from persons where firstname = '" + firstname + "' and lastname = '" + lastname + "' ;";
				Statement stmt = conn.createStatement();			
				ResultSet rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					System.out.println(rs.getString("person_id"));
					person = new Person();
					person.setPersonid(rs.getInt("person_id"));
					person.setFirstName(rs.getString("firstname"));
					person.setLastName(rs.getString("lastname"));
					
				}			
			} catch (SQLException e) {
			}
			return person.getPersonid();
		}
	
	public int getFatherIDByName(String firstname, String lastname){//	
		Person person = null;		
		try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {//
			String sql = "select fatherid from persons where firstname = '" + firstname + "' and lastname = '" + lastname + "' ;";
			Statement stmt = conn.createStatement();			
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				person = new Person();
				person.setPersonid(rs.getInt("person_id"));
				person.setFirstName(rs.getString("firstname"));
				person.setLastName(rs.getString("lastname"));
				person.setFatherid(rs.getInt("fatherid"));				
			}			
		} catch (SQLException e) {
		}
		return person.getFatherid();
	}
	public int getMotherIDByName(String firstname, String lastname){//	
		Person person = null;		
		try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {//
			String sql = "select motherid from persons where firstname = '" + firstname + "' and lastname = '" + lastname + "' ;";
			Statement stmt = conn.createStatement();			
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				person = new Person();
				person.setPersonid(rs.getInt("person_id"));
				person.setFirstName(rs.getString("firstname"));
				person.setLastName(rs.getString("lastname"));
				person.setMotherid(rs.getInt("motherid"));				
			}			
		} catch (SQLException e) {
		}
		return person.getMotherid();
	}
	
		
	}


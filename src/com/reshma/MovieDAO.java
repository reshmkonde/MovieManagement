
package com.reshma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MovieDAO {
	DatabaseUtility databaseUtility = new DatabaseUtility();
	
	public int saveMovie(Movie movietb) {
		int flag=0;
		try {
			Connection con=databaseUtility.getconnection();
			String query ="INSERT INTO movietb (NAME) VALUES (?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, movietb.getName());
			int response=ps.executeUpdate();
			if(response==1) {
				flag=1;
			}else {
				flag=0;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	}

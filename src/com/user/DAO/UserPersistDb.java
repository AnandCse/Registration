package com.user.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import com.user.bean.User;

public class UserPersistDb {

	public int insert(User pUser) {
		try {
			int userId = 1;
			ArrayList<Object> li = new ArrayList<Object>();
			Connection connection = DbConnection.getConnection();
			PreparedStatement p = connection
					.prepareStatement("insert into user values(?,?,?,?)");
			Statement st = connection.createStatement();
			String lQuery = "select id from user";
			ResultSet rs = st.executeQuery(lQuery);

			while (rs.next()) {
				li.add(rs.getInt("id"));
			}

			int id = 0;
			boolean token = true;
			if (li != null) {
				Iterator<Object> iter = li.iterator();
				token = true;
				while (iter.hasNext()) {
					Object i = iter.next();
					id = Integer.parseInt(i.toString());
					if (id == userId) {
						token = false;
					}
				}
			}
			if (token) {
				p.setInt(1, id + 1);
			} else {
				p.setInt(1, id + 1);
			}

			p.setString(2, pUser.getName());
			p.setString(3, pUser.getPassWord());
			p.setLong(4, pUser.getPhoneNumber());
			int upDate = p.executeUpdate();
			return upDate;
		} catch (Exception e) {
			System.out.print(e);
		}
		return -1;
	}

	public boolean verifyUser(User user) {
		Connection connection = DbConnection.getConnection();
		try {
			Statement st = connection.createStatement();
			String query = "select * from user";
			ResultSet rs = st.executeQuery(query);
			boolean token = false;
			while (rs.next()) {
				if ((rs.getString("mailid").toString()).equals(user.getName())
						&& ((rs.getString("password").toString()).equals(user
								.getPassWord()))) {
					token = true;
				}

			}
			return token;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

}

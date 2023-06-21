package com.java.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {

	private Context context = null;
	private DataSource dataSource = null;
	private Connection conn = null; //실행시키는 것
	private Member member = null;
	private PreparedStatement pstmt;
	private ResultSet rs; //데이터를 받아오는 것
	private String id,pw,name,phone,gender,hobby;
	private String query;
	
	//로그인 메소드
	public Member selectLogin(String userId, String userPw) {
		try {
			conn = getConnection();
			query = "select * from member where id=? and pw=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPw);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				System.out.println(name);
				phone = rs.getString("phone");
				gender = rs.getString("gender");
				hobby = rs.getString("hobby");
				member = new Member(id, pw, name, phone, gender, hobby);
			}
		} catch (Exception e) {e.printStackTrace();

		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
				
			} catch (Exception e2) {e2.printStackTrace();}
		}
		return member;
	}
	
	//커넥션 메소드
	public Connection getConnection() {
		Connection connection = null;
		try {
			context = new InitialContext();
	    	dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
	    	connection = dataSource.getConnection();
		}catch(Exception e){e.printStackTrace();}
		return connection;
	}
}

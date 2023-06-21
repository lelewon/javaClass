package com.java.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.sql.DataSource;

public class test {
	
	Context context = null;
	DataSource dataSource = null;
	Connection conn = null; //실행시키는 것
	PreparedStatement pstmt;
	ResultSet rs; //데이터를 받아오는 것
	//컬럼타입
	Member member = null;
	String id,pw,name,phone;
	String query;
	int result;
	
	//커넥션 연결메소드 - conn
	private Connection getConnection() {
		Connection connection = null;
		try {
			context = new InitialContext();
			dataSource = (DataSource) context.lookupLink("java:comp/env/jdbc/Oracle11g");
			connection = dataSource.getConnection();
		}catch(Exception e) {e.printStackTrace();}
		return connection;
	}
	
	public Member selectLogin(String userId, String userPw) {
		Member member = null;
		try {
			System.out.println("userId : "+userId);
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
				phone = rs.getString("phone");
				member = new Member(id,pw,name,phone);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {e2.printStackTrace();}
		}
		return member;
	}//selectMemberOne
	
	//회원정보리스트 메소드
	public ArrayList<member> selectMember(){
		ArrayList<Member> list = new ArrayList<>();
		try {
			conn = getConnection();
			query = "select * from member";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				list.add(new Member(id,pw,name,phone));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

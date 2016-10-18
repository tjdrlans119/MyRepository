package ch07.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import ch07.dto.Member;

public class MemberDao {

	public List<Member> selectAll() {
		List<Member> list = new ArrayList<>();
		Connection conn = null; 
		try {
			Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
				String sql = "select * from member";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					Member mb = new Member();
					mb.setMid(rs.getString("mid"));
					mb.setMname(rs.getString("mname"));
					 list.add(mb);
				}
				rs.close();
				pstmt.close();	
				
		} catch (Exception e) {
			try {conn.close();} catch (SQLException e2) {}
			e.printStackTrace(); 
		} 
		return list;
	}

	
	
	public Member selectByMid(String string) {
		Member mb = null;
		Connection conn = null; 
		try {
			Class.forName("oracle.jdbc.OracleDriver"); 
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345"); 
				String sql = "select * from member where mid=?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,  string);
				ResultSet rs = pstmt.executeQuery(); 
				if(rs.next()) {
					 mb = new Member();
					 mb.setMid(rs.getString("mid"));
					 mb.setMname(rs.getString("mname"));
				}
				rs.close();
				pstmt.close();												
		} catch (Exception e) {
			try {conn.close();} catch (SQLException e2) {}
			e.printStackTrace(); 
		} 
		return mb;
	}

}

package ch07.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ch07.dto.Board;

public class BoardDao {

	public List<Board> selectAll() {
		List<Board> list = new ArrayList<>();
		Connection conn = null; 
		try {
			Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
				String sql = "select * from board";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					Board bo = new Board();
					bo.setBno(rs.getInt("bno"));
					bo.setBtitle(rs.getString("btitle"));
					bo.setBcontent(rs.getString("bcontent"));
					 list.add(bo);
				}
				rs.close();
				pstmt.close();	
				
		} catch (Exception e) {
			try {conn.close();} catch (SQLException e2) {}
			e.printStackTrace(); 
		} 
		return list;
	}

	
	
	public Board selectByBno(int i) {
		Board bo = null;
		Connection conn = null; 
		try {
			Class.forName("oracle.jdbc.OracleDriver"); 
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345"); 
				String sql = "select * from board where bno=?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, i);
				ResultSet rs = pstmt.executeQuery(); 
				if(rs.next()) {
					 bo = new Board();
					 bo.setBno(rs.getInt("bno"));
					 bo.setBtitle(rs.getString("btitle"));
					 bo.setBcontent(rs.getString("bcontent"));
				}
				rs.close();
				pstmt.close();												
		} catch (Exception e) {
			try {conn.close();} catch (SQLException e2) {}
			e.printStackTrace(); 
		} 
		return bo;
	}

}

package ch08.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ch08.dto.Board;

public class BoardDao {

	public void insert(Board board) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
			String sql = "INSERT into board(bno,btitle,bcontent,bwriter,bhitcount,bdate) values(?,?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, board.getBno());
			pstmt.setString(2, board.getBtitle());
			pstmt.setString(3, board.getBcontent());
			pstmt.setString(4, board.getBwriter());
			pstmt.setInt(5, board.getBhitcount());
			pstmt.setDate(6, new Date(board.getBdate().getTime())); 
			
			int rowNo = pstmt.executeUpdate();
			if (rowNo >= 1) {
				System.out.println("저장성공");
			}

			pstmt.close();

		} catch (Exception e) {
			System.out.println("저장실패");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}

	}

	public void update(Board board) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
			String sql = "UPDATE board set btitle=? where bwriter=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,board.getBtitle());
			pstmt.setString(2,board.getBwriter());

			int rowNo = pstmt.executeUpdate();
			if (rowNo >= 1) {
				System.out.println(rowNo+"개의 행이 수정되었습니다.");
			}else if(rowNo==0){
				System.out.println("수정된 행이 없습니다.");
			}

			pstmt.close();

		} catch (Exception e) {
			System.out.println("수정실패");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
	}

	public void deleteByWriter(String bwriter) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
			String sql = "DELETE board where bwriter=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);// SQL실행을 준비하는 객체
			pstmt.setString(1, bwriter);
			int rowNo = pstmt.executeUpdate();
			if (rowNo >= 1) {
				System.out.println("삭제 성공");
			}else if(rowNo==0){
				System.out.println("삭제된 행이 없다");
			}
			pstmt.close();

		} catch (Exception e) {
			System.out.println("삭제 실패");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}		
	}

}
package ch08.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ch08.dto.Member;

public class MemberDao {

	public void insert(Member member) {

		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
			String sql = "insert into member(mid, mname, mage, mbirth)values(?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);// SQL실행을 준비하는 객체
			pstmt.setString(1,member.getMid());
			pstmt.setString(2,member.getMname());
			pstmt.setInt(3,member.getMage());
			pstmt.setDate(4, new Date(member.getMbirth().getTime())); //utill의 long값으로 받아서 SQL의 Date로 넣는다.
			// pstmt.executeQuery() select(조회) 데이터를 조회할때만 query를 쓴다.
			int rowNo = pstmt.executeUpdate();
			if (rowNo == 1) {
				System.out.println("저장성공");
			}

			pstmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
	}

	public void update(Member member) {

		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
			String sql = "UPDATE member set mage=?, mbirth=? where mid=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);// SQL실행을 준비하는 객체
			pstmt.setInt(1,member.getMage());
			pstmt.setDate(2,new Date(member.getMbirth().getTime()));
			pstmt.setString(3,member.getMid());
			int rowNo = pstmt.executeUpdate();
			/*executeUpdate의 3가지 리턴.
					1.  리턴(1이상의값): 1개 이상의 행이 수정됨
					2.  리턴(0      ): 어떤 행도 수정되지 않았음
					3.  리턴(예외)*/
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

	public void deleteByMid(String mid) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
			String sql = "DELETE member where mid=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);// SQL실행을 준비하는 객체
			pstmt.setString(1,mid);
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
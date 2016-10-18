package ch02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam02 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//어떤 JDBC Driver를 사용할 것인가(JDBC Driver 로딩)
		Class.forName("oracle.jdbc.OracleDriver");
		//연결 요청을 해서 연결 객체를 얻기
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
		
		//매개변수화된 SQL문
		String sql = "select ename,empno, sal from emp where ename like ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "%성%"); // %성%을 물음표 자리에 넣겠다.
		ResultSet rs = pstmt.executeQuery(); // rs 안에는 select * from emp where ename like '%성%' 값이 들어가 있다.
		//커서의 처음 위치는 before first에 위치한다.
		//커서를 이동시킬려면 next();이다.
		//커서의 위치에 있는 값을 읽고 싶으면 rs.getxxx(1); get으로 읽으면 된다.
		
		while(rs.next()) {
			int empno = rs.getInt(2);
			String ename = rs.getString("ename");
			int sal = rs.getInt("sal");
			System.out.println(empno + ":" + ename + ":" + sal);
		}
		 
		rs.close();
		pstmt.close();
		conn.close();

	}

}

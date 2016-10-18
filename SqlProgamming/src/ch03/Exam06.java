package ch03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Exam06 {

	public static void main(String[] args) {

//---------------------------------------------1------------------------------------------------------
		
			Employee emp = getEmployee(1001);
			System.out.println(emp.getEmpno() + ":" + emp.getEname() + ":" + emp.getSal());
			
//--------------------------------------------2-------------------------------------------------------		
			
			List<Department> result = getDepartment("개발");
			for(Department dept : result) {
				System.out.println(dept.getDeptno() + ":" + dept.getDname() + ":" + dept.getLoc());
			}
		}
	
//-----------------------------------------------1--------------------------------------------------------------------
	
	private static Employee getEmployee(int searchEmpno) { //2가지 값을 리턴 할수 있다. NULL값과 Employee값
		// select * from emp where empno=?
		Employee emp = null;
		Connection conn = null; // 값을 넣어주지 않으면 선언만 된상태에서 값이 들어 있지 않기에 초기화가 되어있지 않은 상태이다.
		try {
			Class.forName("oracle.jdbc.OracleDriver"); //jdbc Driver를 로드한다.
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345"); // DriverManager가 로드한 Driver를 사용한다.
				String sql = "select * from emp where empno=?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1,  searchEmpno);
				ResultSet rs = pstmt.executeQuery(); 
				if(rs.next()) {
					 emp = new Employee(); //객체를 넣어줬다.
					 emp.setEmpno(rs.getInt("empno"));
					 emp.setEname(rs.getString("ename"));
					 emp.setSal(rs.getInt("sal"));
				}
				rs.close();
				pstmt.close();												
		} catch (Exception e) {
			try {conn.close();} catch (SQLException e2) {}
			e.printStackTrace(); 
		} 
		return emp;
	}
	
	
//------------------------------------------------2------------------------------------------------------------------------
	
	private static List<Department> getDepartment(String searchDname) {
		//select * from dept where dname like ?
		List<Department> list = new ArrayList<>();
		Connection conn = null; //블럭내부에서 선언하면 블록내부에서만 사용할수 있기에 선언을 밖에서 해준다.
		try {
			Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345");
				String sql = "select * from dept where dname like ?"; //sql문을 
				PreparedStatement pstmt = conn.prepareStatement(sql); //여기에 넣어준다. // 쿼리를 전송할수 있는 객체를 얻는다.
				pstmt.setString(1, "%" + searchDname + "%");
				ResultSet rs = pstmt.executeQuery(); // 쿼리를 DBMS에 전송하여 결과를 얻는다.
				while(rs.next()) {
					Department dept = new Department();
					 dept.setDeptno(rs.getInt("deptno"));
					 dept.setDname(rs.getString("dname"));
					 dept.setLoc(rs.getString("loc"));
					 list.add(dept);
				}
				rs.close();
				pstmt.close();	
				
		} catch (Exception e) {
			try {conn.close();} catch (SQLException e2) {} //Connection conn을 생성하면 꼭 conn.close();로 닫아 줘야한다.
			e.printStackTrace(); 
		} 
		return list;
	}


}

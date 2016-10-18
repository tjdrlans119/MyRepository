package ch04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Exam07 {

	public static void main(String[] args) {
		List<JobSalary> result = getMethod("사원", 1000);
		for(JobSalary js : result) {
			System.out.println(js.getJob() + ":" + js.getSalary());
		}

	}

	private static List<JobSalary> getMethod(String searchJob, int searchSalary) {
		List<JobSalary> list = new ArrayList<>();
		Connection conn = null;
		try{
			Class.forName("oracle.jdbc.OracleDriver"); //jdbc Driver를 로드한다.
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "tester1", "kosa12345"); // DriverManager가 로드한 Driver를 사용한다.
			String sql = "select job, sum(sal) as salary from emp where job <> ? group by job having sum(sal)>=? order by salary"; 
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  searchJob);
			pstmt.setInt(2,  searchSalary);
			ResultSet rs = pstmt.executeQuery(); 
			
			while(rs.next()) {
				JobSalary  js = new JobSalary();
				js.setJob(rs.getString("job"));
				js.setSalary(rs.getInt("salary"));
				list.add(js);
				
			}
			
			rs.close();
			pstmt.close();
			
		} catch (Exception e) {
			try {conn.close();} catch (SQLException e2) {} 
			e.printStackTrace(); 
		} 
		return list;
	}
	
	

}

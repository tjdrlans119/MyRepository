package com.mycompany.myweb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mycompany.myweb.dto.FreeBoard;
import com.mycompany.myweb.dto.Member;

@Component
public class FreeBoardDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(FreeBoard freeBoard) {
		String sql = "insert into freeboard(bno, btitle, bcontent, bwriter, bhitcount, bdate) values(seq_freeboard_bno.nextval,?,?,?,0,sysdate)";
		int row = jdbcTemplate.update(sql, freeBoard.getBtitle(), freeBoard.getBcontent(), freeBoard.getBwriter());
		return row;
	}

	public int update(FreeBoard freeBoard) {
		String sql = "update freeboard set btitle=?, bcontent=?, bhitcount=? where bno=?";
		int row = jdbcTemplate.update(sql, freeBoard.getBtitle(), freeBoard.getBcontent(), freeBoard.getBhitcount(),
				freeBoard.getBno());
		return row;
	}

	public int delete(int bno) {
		String sql = "delete from freeboard where bno=?";
		int row = jdbcTemplate.update(sql, bno);
		return row;
	}

	public FreeBoard selectByBno(int bno) {
		String sql = "select bno, btitle, bcontent, bwriter, bhitcount, bdate from freeboard where bno=?";
		List<FreeBoard> list = jdbcTemplate.query(sql, new Object[] { bno }, new RowMapper<FreeBoard>() {
			@Override
			public FreeBoard mapRow(ResultSet rs, int now) throws SQLException {
				FreeBoard freeBoard = new FreeBoard();
				freeBoard.setBno(rs.getInt("bno"));
				freeBoard.setBtitle(rs.getString("btitle"));
				freeBoard.setBcontent(rs.getString("bcontent"));
				freeBoard.setBwriter(rs.getString("bwriter"));
				freeBoard.setBhitcount(rs.getInt("bhitcount"));
				freeBoard.setBdate(rs.getDate("bdate"));
				return freeBoard;
			}
		});
		return (list.size() != 0) ? list.get(0) : null;
	}
	
	public List<FreeBoard> selectByPage(int pageNo, int rowsPerPage){
		String sql="";
		sql+=" select rn, bno,btitle,bwriter,bhitcount,bdate ";
		sql+=" from(select rownum as rn,bno,btitle,bwriter,bhitcount,bdate ";
		sql+=" FROM (select bno, btitle,bwriter,bhitcount,bdate from freeboard order by bno desc) ";
		sql+=" where rownum <=?) ";
		sql+=" WHERE rn>=? ";
		List<FreeBoard> list = jdbcTemplate.query(
				sql,
				new Object[]{(pageNo*rowsPerPage),((pageNo-1)*rowsPerPage+1)},
				new RowMapper<FreeBoard>(){
					@Override
					public FreeBoard mapRow(ResultSet rs, int row) throws SQLException {
						FreeBoard freeBoard = new FreeBoard();
						freeBoard.setBno(rs.getInt("bno"));
						freeBoard.setBtitle(rs.getString("btitle"));
						freeBoard.setBwriter(rs.getString("bwriter"));
						freeBoard.setBhitcount(rs.getInt("bhitcount"));
						freeBoard.setBdate(rs.getDate("bdate"));
						return freeBoard;
					}
				}
				);
		return list;
	}
	//rowMpper : 각 컬럼의 값을 연결시켜주기 위해서(컬럼과 필드를 맵핑시켜주기위해서 사용한다)
	
	public int count(){
		String sql="select count(*) from freeboard";
		//qyeryForObject--
		//--sql문이 반드시 하나의 행을 가져오는 경우라면 사용해도된다.
		//--값을 가져와서 객체의 타입.class를 넣어주면 자동 언박싱을 통해서 int타입의 count에 넣어준다
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}
	
	
}

// 스프링을 쓰면 좋은점: 의존성 관리를 할수 있다. 스프링이 관리하고 있다가 넣어준다.(의존성관리가 수월하다)
// connection을 쉽게 만들수 있다.























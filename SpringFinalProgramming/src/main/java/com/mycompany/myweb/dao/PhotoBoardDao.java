package com.mycompany.myweb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mycompany.myweb.dto.PhotoBoard;
import com.mycompany.myweb.dto.PhotoBoard;

public class PhotoBoardDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(PhotoBoard photoBoard) {
		String sql = "insert into photoboard(bno, btitle, bcontent, bwriter, bhitcount, bdate, originalfile, savedfile, mimetype) values(seq_photoboard_bno.nextval,?,?,?,0,sysdate,?,?,?)";
		int row = jdbcTemplate.update(sql, photoBoard.getBtitle(), 
				photoBoard.getBcontent(),
				photoBoard.getBwriter(),
				photoBoard.getOriginalfile(),
				photoBoard.getSavedfile(), 
				photoBoard.getMimetype() );
		return row;
	}

	public int update(PhotoBoard photoBoard) {
		String sql = "update photoboard set btitle=?, bcontent=?, bhitcount=?, originalfile=?, savedfile=?, mimetype=? where bno=?";
		int row = jdbcTemplate.update(sql, photoBoard.getBtitle(), photoBoard.getBcontent(), photoBoard.getBhitcount(),photoBoard.getOriginalfile(),photoBoard.getSavedfile(),photoBoard.getMimetype()
				,photoBoard.getBno());
		return row;
	}

	public int delete(int bno) {
		String sql = "delete from photoboard where bno=?";
		int row = jdbcTemplate.update(sql, bno);
		return row;
	}
	//rowMpper : 각 컬럼의 값을 연결시켜주기 위해서(컬럼과 필드를 맵핑시켜주기위해서 사용한다)
	public PhotoBoard photoByBno(int bno) {
		String sql = "select bno, btitle, bcontent, bwriter, bhitcount, bdate, originalfile, savedfile, mimefile from photoboard where bno=?";
		List<PhotoBoard> list = jdbcTemplate.query(sql, new Object[] { bno }, new RowMapper<PhotoBoard>() {
			@Override
			public PhotoBoard mapRow(ResultSet rs, int now) throws SQLException {
				PhotoBoard photoBoard = new PhotoBoard();
				photoBoard.setBno(rs.getInt("bno"));
				photoBoard.setBtitle(rs.getString("btitle"));
				photoBoard.setBcontent(rs.getString("bcontent"));
				photoBoard.setBwriter(rs.getString("bwriter"));
				photoBoard.setBhitcount(rs.getInt("bhitcount"));
				photoBoard.setBdate(rs.getDate("bdate"));
				photoBoard.setOriginalfile(rs.getString("originalfile"));
				photoBoard.setSavedfile(rs.getString("savedfile"));
				photoBoard.setMimetype(rs.getString("mimetype"));
				return photoBoard;
			}
		});
		return (list.size() != 0) ? list.get(0) : null;
	}
	
	public List<PhotoBoard> selectByPage(int pageNo, int rowsPerPage){
		String sql="";
		sql+=" select rn, bno, btitle, bhitcount, savedfile";
		sql+=" from(select rownum as rn, bno, btitle, bhitcount, savedfile ";
		sql+=" FROM (select bno, btitle, bhitcount, savedfile from photoboard order by bno desc) ";
		sql+=" where rownum <=?) ";
		sql+=" WHERE rn>=? ";
		List<PhotoBoard> list = jdbcTemplate.query(
				sql,
				new Object[]{(pageNo*rowsPerPage),((pageNo-1)*rowsPerPage+1)},
				new RowMapper<PhotoBoard>(){
					@Override
					public PhotoBoard mapRow(ResultSet rs, int row) throws SQLException {
						PhotoBoard photoboard = new PhotoBoard();
						photoboard.setBno(rs.getInt("bno"));
						photoboard.setBtitle(rs.getString("btitle"));
						photoboard.setBhitcount(rs.getInt("bhitcount"));
						photoboard.setSavedfile(rs.getString("Savedfile"));
						return photoboard;
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

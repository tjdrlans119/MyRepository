package com.mycompany.myweb.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myweb.dao.MemberDao;
import com.mycompany.myweb.dto.Member;

@Component
public class MemberService {
	
	public static final int JOIN_SUCCESS=0;
	public static final int JOIN_FAIL=1;
	
	public static final int LOGIN_SUCCESS=0;
	public static final int LOGIN_FAIL_MID=1;
	public static final int LOGIN_FAIL_MPASSWORD=2;
	
	public static final int LOGOUT_SUCCESS=0;
	public static final int LOGOUT_FAIL=1;
	
	public static final int MODIFY_SUCCESS=0;
	public static final int MODIFY_FAIL=1;
	
	public static final int WITHDRAW_SUCCESS=0;
	public static final int WITHDRAW_FAIL=1;
	
	@Autowired
	private MemberDao memberDao;
	
	//정상실행과 예외를 가지고 판단한다면 리턴타입을 void로 한다.
	public int join(Member member){
		memberDao.insert(member);
		return JOIN_SUCCESS;
	}
	
	public int login(String mid, String mpassword){
		Member member = memberDao.selectByMid(mid);
		if(member==null){return LOGIN_FAIL_MID;}
		if(member.getMpassword().equals(mpassword)==false){return LOGIN_FAIL_MPASSWORD;}
		return LOGIN_SUCCESS;
	}
		
	public int logout(String mid){
		return LOGOUT_SUCCESS;
	}
	
	
	public String findMpassword(String mid, String memail){
		Member member = memberDao.selectByMid(mid); //mid존재를 검사한다.
		if(member==null){return null;}
		if(member.getMemail().equals(memail)==false)return null;
		return member.getMpassword();
	}
	
	
	public String findMid(String memail){
		return memberDao.selectByEmail(memail);
	}
	
	
	public Member info(String mid, String mpassword){
		Member member = memberDao.selectByMid(mid);
		if(member.getMpassword().equals(mpassword)==false){return null;}
		return member;
	}
	
	
	public int modify(Member member){
		Member dbMember = memberDao.selectByMid(member.getMid());
		if(dbMember.getMpassword().equals(member.getMpassword())==false){return MODIFY_FAIL;}
		int row = memberDao.update(member);
		 if(row!=1){return MODIFY_FAIL;}
		 return MODIFY_FAIL;	 
	}
	
	
	public int withdraw(String mid,String mpassword){
		Member member = memberDao.selectByMid(mid);
		if(member.getMpassword().equals(mpassword)==false){return WITHDRAW_FAIL;}
		memberDao.delete(mid);
		logout(mid);
		return WITHDRAW_SUCCESS;
	} //2가지 경우지만 예외가 없을때
	
	
	public boolean isMid(String mid){
		Member member = memberDao.selectByMid(mid);
		if(member == null){ return false; }
		return true;
	}
	
	//서비스에 무언가 실행햇는데 2가지이상이 발생한다면 상수를사용해서 처리한다.
	//2가지 이지만 한가지가 예외일때는 void만으로도 처리 가능하다.
	
	//트랜젝션처리는 service에서 한다.
	
}

















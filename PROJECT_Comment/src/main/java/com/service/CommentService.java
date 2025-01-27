package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.CommentDao;
import com.dto.CommentDTO;

public class CommentService {
	
	CommentDao dao;
	

	public CommentService() {
		dao = new CommentDao();
	}
	
	public int AddCommnet(CommentDTO commentDB) {
		
		int recordCount = 0;
		SqlSession s = MySqlSessionFactory.getSqlSession();
		
		try {
			recordCount = dao.AddCommnet(commentDB,s);
			s.commit();
		}finally {
			if(s!=null) s.close();
		}
		
		return recordCount;
	}
	
	
	
	  public List<CommentDTO> selectAll() {
	  
	  List<CommentDTO> commentDB = null; SqlSession s =
	  MySqlSessionFactory.getSqlSession();
	  
	  try { commentDB = dao.selectAll(s); s.commit(); }finally { if(s!=null)
	  s.close(); }
	  
	 return commentDB;
	 }
	 

	  public int selectOne(CommentDTO commentDB) {
			
			int commid = 0;
			SqlSession s = MySqlSessionFactory.getSqlSession();
			
			try {
				commid = dao.selectOne(commentDB,s);
				s.commit();
			}finally {
				if(s!=null) s.close();
			}
			
			return commid;
		}
	
	
	
	
	public int deleteComment(int comid) { 
		int num = 0;
		SqlSession s = MySqlSessionFactory.getSqlSession();
		
		try {
			num = dao.deleteComment(s,comid);
			s.commit();
		}finally {
			if(s!=null) s.close();
		}
		return num;
		
	}
	
	
	public int updateComment(int comid) { 
		int num = 0;
		SqlSession s = MySqlSessionFactory.getSqlSession();
		
		try {
			num = dao.updateComment(s,comid);
			s.commit();
		}finally {
			if(s!=null) s.close();
		}
		return num;
		
	}
	

}

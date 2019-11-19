package com.woniuxy.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.woniuxy.domain.Comments;

public interface ICommentsService {
	void save(Comments comments);
	void delete(Integer cid);
	void update(Comments comments);
	Comments findOne(Integer cid);
	List<Comments> findAll(RowBounds rowBounds);
}

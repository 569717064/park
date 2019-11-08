package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Comments;

public interface ICommentsService {
	void save(Comments comments);
	void delete(Integer cid);
	void update(Comments comments);
	Comments findOne(Integer cid);
	List<Comments> findAll();
}

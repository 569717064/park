package com.woniuxy.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.CommentsMapper;
import com.woniuxy.domain.Comments;
import com.woniuxy.service.ICommentsService;

@Service
public class CommentsServiceImpl implements ICommentsService {

	@Autowired
	private CommentsMapper commentsMapper;
	
	@Transactional
	@Override
	public void save(Comments comments) {
		commentsMapper.insertSelective(comments);
	}

	@Transactional
	@Override
	public void delete(Integer cid) {
		commentsMapper.deleteByPrimaryKey(cid);
	}

	@Transactional
	@Override
	public void update(Comments comments) {
		commentsMapper.updateByPrimaryKeySelective(comments);
	}

	@Transactional(readOnly = true)
	@Override
	public Comments findOne(Integer cid) {
		return commentsMapper.selectByPrimaryKey(cid);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Comments> findAll(RowBounds rowBounds) {
		return commentsMapper.selectByExample(null,rowBounds);
	}

}

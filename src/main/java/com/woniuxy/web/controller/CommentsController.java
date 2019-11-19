package com.woniuxy.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woniuxy.domain.Comments;
import com.woniuxy.service.ICommentsService;

@RestController
@RequestMapping("comments")
public class CommentsController {

	@Resource
	private ICommentsService commentsServiceImpl;
	
	@PostMapping
	public void save(@RequestBody Comments comments) {
		System.out.println("CommentsController.save()"+comments);
	}
	
	@DeleteMapping
	public void delete() {
		
	}
	
	@PutMapping
	public void update() {
		
	}
	
	@GetMapping("{offset}/{limit}")
	public List<Comments> findAll(@PathVariable int offset,@PathVariable int limit){
		RowBounds rowBounds = new RowBounds(offset,limit);
		return commentsServiceImpl.findAll(rowBounds);
	}
}

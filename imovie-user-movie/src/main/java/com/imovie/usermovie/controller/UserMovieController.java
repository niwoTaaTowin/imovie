package com.imovie.usermovie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imovie.common.pojo.UserMovie;
import com.imovie.common.vo.SysResult;
import com.imovie.usermovie.service.UserMovieService;

@RestController
@RequestMapping("usermovie/manage/")
public class UserMovieController {
	@Autowired
	private UserMovieService userMovieService = null;
	//添加
	@RequestMapping("save")
	public SysResult saveUserMovie(UserMovie userMovie){
		try {
			userMovieService.saveUserMovie(userMovie);
			return SysResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return SysResult.build(201, "", null);
		}
	}
	//删除
	@RequestMapping("delete")
	public SysResult deleteUserMovie(UserMovie userMovie){
		try {
			userMovieService.deleteUserMovie(userMovie);
			return SysResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return SysResult.build(201, "", null);
		}
	}
	//查询
	@RequestMapping("query")
	public List<UserMovie> queryUserMovie(UserMovie userMovie){
		return userMovieService.queryUserMovie(userMovie);
	}
	
	
}

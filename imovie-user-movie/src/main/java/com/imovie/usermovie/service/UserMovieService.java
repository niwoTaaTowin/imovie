package com.imovie.usermovie.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.imovie.common.pojo.Movie;
import com.imovie.common.pojo.UserMovie;
import com.imovie.common.utils.SysNoUtil;
import com.imovie.usermovie.mapper.UserMovieMapper;

@Service
public class UserMovieService {

	@Autowired
	UserMovieMapper userMovieMapper = null;
	@Autowired
	RestTemplate client = null;
	public void saveUserMovie(UserMovie userMovie) {
		/*添加逻辑
		 * 1.如果数据库中已经存在，数据库保存 电影是否看过状态 与 用户当前操作状态一致，无数据库操作
		 * 2.如果数据库中已经存在，数据库保存 电影是否看过状态 与 用户当前操作状态不一致，更新数据库电影状态
		 * 3.如果数据库中不存在，向数据库中添加数据
		 */
		//查询已存
		UserMovie exist = userMovieMapper.selectUserMovieByUIdAndMId(userMovie);
		//数据库
		if(exist!=null){
			//逻辑2
			if(exist.getWantOrWatched()!=userMovie.getWantOrWatched()){
				userMovieMapper.updateUserMovieWOWByUIdAndMId(userMovie);
			}
		}else {
			//逻辑3
			//真是使用数据
//			Movie movie = client.getForObject("查询电影的链接"+userMovie.getMvId(), Movie.class);
//			userMovie.setMvImgUrl(movie.getMvImgUrl());
//			userMovie.setMvName(movie.getMvName());
//			userMovie.setMvPoint(movie.getMvPoint());
//			userMovie.setMvDate(movie.getMvDate());
//			userMovie.setMvDirector(movie.getMvDirector());
//			userMovie.setMvActor(movie.getMvActor());
//			userMovie.setMvLanguage(movie.getMvLanguage());
//			userMovie.setMvTypeId(movie.getMvTypeId());
//			userMovie.setMvDistirct(movie.getMvDistrict);
			userMovie.setSystemNo(SysNoUtil.getSysNo());
			userMovie.setLikeTime(new Date());
			//以下为测试所用数据
			userMovie.setMvImgUrl(userMovie.getMvId());
			userMovie.setMvName(userMovie.getMvId());
			userMovie.setMvPoint(10.0);
			userMovie.setMvDate(userMovie.getMvId());
			userMovie.setMvDirector(userMovie.getMvId());
			userMovie.setMvActor(userMovie.getMvId());
			userMovie.setMvLanguage(userMovie.getMvId());
			userMovie.setMvTypeId(userMovie.getMvId());
			userMovie.setMvDistirct(userMovie.getMvId());
			userMovieMapper.insertUserMovie(userMovie);
		}
	}
	public void deleteUserMovie(UserMovie userMovie) {
		userMovieMapper.deleteUserMovieByUIdAndMId(userMovie);
	}
	public List<UserMovie> queryUserMovie(UserMovie userMovie) {
		List<UserMovie> list = userMovieMapper.selectUserMovieByUIdAndWOW(userMovie);
		return list;
	}
	
	

}

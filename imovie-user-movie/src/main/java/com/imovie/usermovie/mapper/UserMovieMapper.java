package com.imovie.usermovie.mapper;

import java.util.List;

import com.imovie.common.pojo.UserMovie;

public interface UserMovieMapper {
	//通过user_id 和 mv_id 查询数据
	UserMovie selectUserMovieByUIdAndMId(UserMovie userMovie);
	//通过 查询 与 user_id 和 mv_id 匹配的数据，更新want_or_watched
	void updateUserMovieWOWByUIdAndMId(UserMovie userMovie);
	//插入一条新数据至 user_movie数据库中
	void insertUserMovie(UserMovie userMovie);
	//删除数据
	void deleteUserMovieByUIdAndMId(UserMovie userMovie);
	//查询数据 通过 user_id 和 want_or_watched 
	List<UserMovie> selectUserMovieByUIdAndWOW(UserMovie userMovie);

}

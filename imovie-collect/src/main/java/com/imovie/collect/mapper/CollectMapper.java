package com.imovie.collect.mapper;

import java.util.List;

import com.imovie.common.pojo.Collections;

public interface CollectMapper {

	Collections selectExistByUIdAndRId(Collections collection);
	//查询收藏表
	List<Collections> queryCollectionsByUserId(String userId);
	//添加收藏
	void insertCollections(Collections collection);
	//删除收藏
	void deleteCollectionsByIdAndReviewId(Collections collection);

}

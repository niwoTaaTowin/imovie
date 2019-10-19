package com.imovie.collect.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.imovie.collect.mapper.CollectMapper;
import com.imovie.common.pojo.Collections;
import com.imovie.common.pojo.Review;
import com.imovie.common.utils.SysNoUtil;

@Service
public class CollectService {

	@Autowired
	CollectMapper collectMapper = null;
	@Autowired
	private RestTemplate client = null;

	//查询
	public List<Collections> queryCollections(String userId) {
		return collectMapper.queryCollectionsByUserId(userId);
	}
	//添加收藏信息
	public void saveCollections(Collections collection) {
		//查询已有
		Collections exits = collectMapper.selectExistByUIdAndRId(collection);
		try {
			if(exits==null){
				//与评论整合
//				Review review = client.getForObject
//						("http://com.imovie.review/review/manage/item"+collection.getReviewId(), Review.class);
//				collection.setReviewContent(review.getContent());
//				collection.setReviewTitle(review.getTitle());
				collection.setSystemNo(SysNoUtil.getSysNo());
				collection.setCollectionTime(new Date());
				//测试数据
				collection.setReviewContent(collection.getReviewId());
				collection.setReviewTitle(collection.getReviewId());
				collection.setCollectionTag(collection.getReviewId());
				
				collectMapper.insertCollections(collection);
			}
		} catch (Exception e) {
			
		}
	}
	//删除收藏信息
	public void deleteCollections(Collections collection) {
		collectMapper.deleteCollectionsByIdAndReviewId(collection);
	}

}

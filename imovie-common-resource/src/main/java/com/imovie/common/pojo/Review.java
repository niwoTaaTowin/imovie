package com.imovie.common.pojo;

import java.util.Date;


public class Review {
	
	private String systemNo;
	private String reviewId;
	private String userId;
	private String mvId;
	private Date reviewTime;
	private String likeNum;
	private String collectionNum;
	private String title;
	private String content;
	
	public String getSystemNo() {
		return systemNo;
	}
	public void setSystemNo(String systemNo) {
		this.systemNo = systemNo;
	}
	public String getReviewId() {
		return reviewId;
	}
	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMvId() {
		return mvId;
	}
	public void setMvId(String mvId) {
		this.mvId = mvId;
	}
	public Date getReviewTime() {
		return reviewTime;
	}
	public void setReviewTime(Date data) {
		this.reviewTime = data;
	}
	public String getLikeNum() {
		return likeNum;
	}
	public void setLikeNum(String likeNum) {
		this.likeNum = likeNum;
	}
	public String getCollectionNum() {
		return collectionNum;
	}
	public void setCollectionNum(String collectionNum) {
		this.collectionNum = collectionNum;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}

package com.imovie.common.pojo;

import java.util.Date;

public class Collections {
	private String systemNo;
	private String userId;
	private Date collectionTime;
	private String collectionTag;
	private String reviewId;
	private String reviewContent;
	private String reviewTitle;
	
	public String getSystemNo() {
		return systemNo;
	}
	public void setSystemNo(String systemNo) {
		this.systemNo = systemNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getCollectionTime() {
		return collectionTime;
	}
	public void setCollectionTime(Date collectionTime) {
		this.collectionTime = collectionTime;
	}
	public String getCollectionTag() {
		return collectionTag;
	}
	public void setCollectionTag(String collectionTag) {
		this.collectionTag = collectionTag;
	}
	public String getReviewId() {
		return reviewId;
	}
	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}
	public String getReviewContent() {
		return reviewContent;
	}
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
	public String getReviewTitle() {
		return reviewTitle;
	}
	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}
}

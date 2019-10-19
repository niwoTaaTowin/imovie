package com.imovie.common.pojo;

import java.util.Date;

public class UserMovie {
	
	private String systemNo;
	private String userId;
	private String mvId;
	private Boolean wantOrWatched;
	//添加时间
	private Date likeTime;
	private String mvImgUrl;
	private String mvName;
	private Double mvPoint;
	private String mvDate;
	private String mvDirector;
	private String mvActor;
	private String mvLanguage;
	private String mvTypeId;
	private String mvDistrict;
	
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
	public String getMvId() {
		return mvId;
	}
	public void setMvId(String mvId) {
		this.mvId = mvId;
	}
	public Boolean getWantOrWatched() {
		return wantOrWatched;
	}
	public void setWantOrWatched(Boolean wantOrWatched) {
		this.wantOrWatched = wantOrWatched;
	}
	public Date getLikeTime() {
		return likeTime;
	}
	public void setLikeTime(Date likeTime) {
		this.likeTime = likeTime;
	}
	public String getMvImgUrl() {
		return mvImgUrl;
	}
	public void setMvImgUrl(String imgUrl) {
		this.mvImgUrl = imgUrl;
	}
	public String getMvName() {
		return mvName;
	}
	public void setMvName(String mvName) {
		this.mvName = mvName;
	}
	public Double getMvPoint() {
		return mvPoint;
	}
	public void setMvPoint(Double mvPoint) {
		this.mvPoint = mvPoint;
	}
	public String getMvDate() {
		return mvDate;
	}
	public void setMvDate(String mvDate) {
		this.mvDate = mvDate;
	}
	public String getMvDirector() {
		return mvDirector;
	}
	public void setMvDirector(String mvDirector) {
		this.mvDirector = mvDirector;
	}
	public String getMvActor() {
		return mvActor;
	}
	public void setMvActor(String mvActor) {
		this.mvActor = mvActor;
	}
	public String getMvLanguage() {
		return mvLanguage;
	}
	public void setMvLanguage(String mvLanguage) {
		this.mvLanguage = mvLanguage;
	}
	public String getMvTypeId() {
		return mvTypeId;
	}
	public void setMvTypeId(String mvTypeId) {
		this.mvTypeId = mvTypeId;
	}
	public String getMvDistirct() {
		return mvDistrict;
	}
	public void setMvDistirct(String mvDistirct) {
		this.mvDistrict = mvDistirct;
	}
	
}

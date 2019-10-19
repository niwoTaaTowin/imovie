package com.imovie.collect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imovie.collect.service.CollectService;
import com.imovie.common.pojo.Collections;
import com.imovie.common.vo.SysResult;

@RestController
@RequestMapping("collect/manage")
public class CollectController {
	@Autowired
	CollectService collectService;
	//查询
	@RequestMapping("query")
	public List<Collections> queryCollections(String userId){
		System.out.println("123123");
		return collectService.queryCollections(userId);
	}	
	
	
	
//	@RequestMapping("query/{queryType}")
//	public List<Collections> queryCollections(String userId, @PathVariable String queryType){
//		return collectService.queryCollections(userId);
//	}
	
	
	//新增收藏
	@RequestMapping("save")
	public SysResult saveCollections(Collections collection){
		try {
			collectService.saveCollections(collection);
			return SysResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return SysResult.build(201, "", null);
		}
	}
	
	//删除收藏
	@RequestMapping("delete")
	public SysResult deleteCollections(Collections collection){
		try {
			collectService.deleteCollections(collection);
			return SysResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return SysResult.build(201, "", null);
		}
	}
	
}

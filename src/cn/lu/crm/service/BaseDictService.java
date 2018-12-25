package cn.lu.crm.service;

import java.util.List;

import cn.lu.crm.pojo.BaseDict;

public interface BaseDictService {

	
	//查询
	List<BaseDict> selectBaseDictListByCode(String code);
}

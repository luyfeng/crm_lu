package cn.lu.crm.mapper;

import java.util.List;

import cn.lu.crm.pojo.BaseDict;

public interface BaseDictDao {

	
	//查询
	List<BaseDict> selectBaseDictListByCode(String code);
}

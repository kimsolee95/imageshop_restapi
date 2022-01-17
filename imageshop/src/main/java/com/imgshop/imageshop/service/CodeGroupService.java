package com.imgshop.imageshop.service;

import java.util.List;

import com.imgshop.imageshop.domain.CodeGroup;

public interface CodeGroupService {

	public int codeGroupregister(CodeGroup codeClass) throws Exception;
	
	public List<CodeGroup> selectCodeGroupList() throws Exception;

	public CodeGroup selectCodeGroupOne(String groupCode) throws Exception;
	
	public int deleteCodeGroupOne(String groupCode) throws Exception;
}

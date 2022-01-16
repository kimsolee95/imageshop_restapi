package com.imgshop.imageshop.service;

import java.util.List;

import com.imgshop.imageshop.domain.CodeGroup;

public interface CodeGroupService {

	public int codeGroupregister(CodeGroup codeClass) throws Exception;
	
	public List<CodeGroup> selectCodeGroupList() throws Exception;
}

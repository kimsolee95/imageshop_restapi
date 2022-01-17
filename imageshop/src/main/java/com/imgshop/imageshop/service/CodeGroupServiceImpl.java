package com.imgshop.imageshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.imgshop.imageshop.domain.CodeGroup;
import com.imgshop.imageshop.mapper.CodeGroupMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CodeGroupServiceImpl implements CodeGroupService{
	
	private final CodeGroupMapper codeGroupMapper;
	
	@Override
	public int codeGroupregister(CodeGroup codeGroup) throws Exception {
		
		int result = codeGroupMapper.codeGroupregister(codeGroup);
		return result;
	}
	
	@Override
	public List<CodeGroup> selectCodeGroupList() throws Exception {
		
		List<CodeGroup> selectCodeGroupList = codeGroupMapper.selectCodeGroupList();
		return selectCodeGroupList;
	}

	@Override
	public CodeGroup selectCodeGroupOne(String groupCode) throws Exception {
		CodeGroup selectCodeGroupOne = codeGroupMapper.selectCodeGroupOne(groupCode);
		return selectCodeGroupOne;
	}
	
	@Override
	public int deleteCodeGroupOne(String groupCode) throws Exception {
		int result = codeGroupMapper.deleteCodeGroupOne(groupCode);	
		return result;
	}
	
}

package com.imgshop.imageshop.service;

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

	
}

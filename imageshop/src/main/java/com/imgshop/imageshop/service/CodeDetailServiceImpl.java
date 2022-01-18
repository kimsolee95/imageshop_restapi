package com.imgshop.imageshop.service;

import org.springframework.stereotype.Service;

import com.imgshop.imageshop.domain.CodeDetail;
import com.imgshop.imageshop.domain.CodeDetailId;
import com.imgshop.imageshop.mapper.CodeDetailMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CodeDetailServiceImpl implements CodeDetailService {

	private final CodeDetailMapper codeDetailMapper;

	@Override
	public CodeDetail codeDetailSelectOne(CodeDetailId codeDetailId) throws Exception {
		
		CodeDetail codeDetailSelectOne = codeDetailMapper.codeDetailSelectOne(codeDetailId);
		
		return codeDetailSelectOne;
	}
}

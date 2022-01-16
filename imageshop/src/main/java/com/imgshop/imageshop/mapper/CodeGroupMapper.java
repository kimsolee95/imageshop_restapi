package com.imgshop.imageshop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.imgshop.imageshop.domain.CodeGroup;

@Repository
@Mapper
public interface CodeGroupMapper {
	
	public int codeGroupregister(CodeGroup codeGroup);

}

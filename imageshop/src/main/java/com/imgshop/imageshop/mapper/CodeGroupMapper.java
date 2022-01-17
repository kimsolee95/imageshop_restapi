package com.imgshop.imageshop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.imgshop.imageshop.domain.CodeGroup;

@Repository
@Mapper
public interface CodeGroupMapper {
	
	public int codeGroupregister(CodeGroup codeGroup);

	public List<CodeGroup> selectCodeGroupList();
	
	public CodeGroup selectCodeGroupOne(String groupCode);

	public int deleteCodeGroupOne(String groupCode);
}

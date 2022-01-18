package com.imgshop.imageshop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.imgshop.imageshop.domain.CodeDetail;
import com.imgshop.imageshop.domain.CodeDetailId;

@Repository
@Mapper
public interface CodeDetailMapper {
	
	public List<Object[]> getMaxSortSeq(String groupCode);
	
	public CodeDetail codeDetailSelectOne(CodeDetailId codeDetailId);
}

package com.imgshop.imageshop.service;

import com.imgshop.imageshop.domain.CodeDetail;
import com.imgshop.imageshop.domain.CodeDetailId;

public interface CodeDetailService {

	public CodeDetail codeDetailSelectOne(CodeDetailId codeDetailId) throws Exception;
}

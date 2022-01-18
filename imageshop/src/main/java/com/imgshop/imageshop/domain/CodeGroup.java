package com.imgshop.imageshop.domain;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CodeGroup {

	private String groupCode;
	
	private String groupName;
	
	private String useYn = "Y";
	
	private List<CodeDetail> codeDetails;
	
	@JsonFormat(pattern="yyyy-mm-dd HH:mm")
	private LocalDateTime regDate;
	
	@JsonFormat(pattern="yyyy-mm-dd HH:mm")
	private LocalDateTime updDate;
	
}

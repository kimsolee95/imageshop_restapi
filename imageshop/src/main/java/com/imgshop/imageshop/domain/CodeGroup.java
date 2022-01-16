package com.imgshop.imageshop.domain;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CodeGroup {

	private String groupCode;
	
	private String groupName;
	
	private String useYn = "Y";
	
	@JsonFormat(pattern="yyyy-mm-dd HH:mm")
	private LocalDateTime regDate;
	
	@JsonFormat(pattern="yyyy-mm-dd HH:mm")
	private LocalDateTime updDate;
	
}

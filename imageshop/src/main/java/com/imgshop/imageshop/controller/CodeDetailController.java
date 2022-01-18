package com.imgshop.imageshop.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imgshop.imageshop.domain.CodeDetail;
import com.imgshop.imageshop.domain.CodeDetailId;
import com.imgshop.imageshop.service.CodeDetailService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/codedetails")
public class CodeDetailController {

	private final CodeDetailService codeDetailService; 
	
	@GetMapping("/{groupCode}/{codeValue}")
	public ResponseEntity<CodeDetail> read(@PathVariable("groupCode") String groupCode,
											@PathVariable("codeValue") String codeValue) throws Exception {
		
		CodeDetailId codeDetailId = new CodeDetailId();
		codeDetailId.setGroupCode(groupCode);
		codeDetailId.setCodeValue(codeValue);
		
		CodeDetail response = codeDetailService.codeDetailSelectOne(codeDetailId);
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}

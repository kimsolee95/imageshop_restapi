package com.imgshop.imageshop.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imgshop.imageshop.domain.CodeGroup;
import com.imgshop.imageshop.service.CodeGroupService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/codegroups")
public class CodeGroupController {

	private final CodeGroupService service;
	
	@PostMapping
	public ResponseEntity<CodeGroup> register(@Validated @RequestBody CodeGroup codeGroup) throws Exception {
		
		int result = service.codeGroupregister(codeGroup);
		
		if (result > 0 ) {
			return new ResponseEntity<>(codeGroup, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(codeGroup, HttpStatus.BAD_REQUEST);
		}
		

	}
}

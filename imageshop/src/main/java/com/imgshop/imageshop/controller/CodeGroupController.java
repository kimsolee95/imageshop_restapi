package com.imgshop.imageshop.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public ResponseEntity<CodeGroup> codeGroupregister(@Validated @RequestBody CodeGroup codeGroup) throws Exception {
		
		int result = service.codeGroupregister(codeGroup);
		
		if (result > 0 ) {
			return new ResponseEntity<>(codeGroup, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(codeGroup, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@GetMapping
	public ResponseEntity<List<CodeGroup>>selectCodeGroupList() throws Exception {
		
		List<CodeGroup> codeGroupList = service.selectCodeGroupList();
		
		if (codeGroupList.isEmpty()) {
			return new ResponseEntity<>(null, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(codeGroupList, HttpStatus.OK);
		}
		
	}
	
	@GetMapping("/{groupCode}")
	public ResponseEntity<CodeGroup> selectCodeGroupOne(@PathVariable("groupCode") String groupCode) throws Exception {
		
		CodeGroup selectCodeGroupOne = service.selectCodeGroupOne(groupCode);
		
		if (ObjectUtils.isEmpty(selectCodeGroupOne)) {
			return new ResponseEntity<>(null, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(selectCodeGroupOne, HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/{groupCode}")
	public ResponseEntity<Void> deleteCodeGroupOne(@PathVariable("groupCode") String groupCode) throws Exception {
		
		int result = service.deleteCodeGroupOne(groupCode);
		
		if (result > 0) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		}
	}
	
}

package com.wyf.tea.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.wyf.tea.dao.UserInfoRepository;
import com.wyf.tea.entity.UserInfoEntity;

@RestController
public class TestController {

	@Autowired
	UserInfoRepository userInfoRepository;

	@GetMapping(name = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserInfoEntity> get() {
		return Lists.newArrayList(this.userInfoRepository.findAll());
	}
}

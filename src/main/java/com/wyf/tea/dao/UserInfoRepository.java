package com.wyf.tea.dao;

import org.springframework.data.repository.CrudRepository;

import com.wyf.tea.entity.UserInfoEntity;

public interface UserInfoRepository extends CrudRepository<UserInfoEntity, Long> {

}

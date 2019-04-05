package com.wyf.tea.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "user_info")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInfoEntity {

	@Id
	private Long id;
	private String name;
	private String tel;
	private String pwd;
	private Integer job;
	private Long updateTime;

}

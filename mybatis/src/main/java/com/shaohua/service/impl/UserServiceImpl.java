package com.shaohua.service.impl;

import org.springframework.stereotype.Service;

import com.shaohua.dao.UserMapper;
import com.shaohua.pojo.User;
import com.shaohua.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	public UserMapper userMapper;
	
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}


	public User getUserById(String id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

}

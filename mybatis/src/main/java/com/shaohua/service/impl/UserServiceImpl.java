package com.shaohua.service.impl;

import com.shaohua.dao.UserMapper;
import com.shaohua.pojo.User;
import com.shaohua.service.UserService;

public class UserServiceImpl implements UserService {

	public UserMapper userMapper;
	
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

    @Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}


	public User getUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}

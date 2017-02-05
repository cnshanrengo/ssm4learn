package com.srg.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.srg.dao.IUserDao;
import com.srg.pojo.User;
import com.srg.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{

	@Resource
	private IUserDao userDao;
	
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}

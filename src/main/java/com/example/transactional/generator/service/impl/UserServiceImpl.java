package com.example.transactional.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.transactional.generator.mapper.UserMapper;
import com.example.transactional.generator.service.UserService;
import com.example.transactional.generator.domain.User;
import org.springframework.stereotype.Service;

/**
* @author zhaoyu
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-11-14 11:34:02
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}





package com.example.transactional;

import com.example.transactional.generator.domain.User;
import com.example.transactional.generator.service.DeptService;
import com.example.transactional.generator.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TransactionalApplicationTests {
    @Autowired
    private UserService userService;

    @Autowired
    private DeptService deptService;

    /**
     * 0. 测试数据库连接
     * */
    @Test
    void test0() {
        User user = new User();
        user.setUsername("zhaoyu");
        user.setPassword("123456");

        userService.save(user);

        User byId = userService.getById(1);

        System.out.println(byId);
    }

}



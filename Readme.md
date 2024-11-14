# Transactional 注解学习
@Transactional 注解是 Spring 框架提供的一个注解，用于标记方法或类级别的事务管理。

### 0. 环境准备
在本地的mysql数据库中创建数据库: transactional, 准备表: user, dept

使用mybatis-x生成mapper相关代码, 我们在test中进行测试 -> test0

### 1. 事务的传播级别

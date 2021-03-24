package org.mybook.service;

import org.mybook.dao.mapper.roleMapper;
import org.mybook.model.role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @作者 江南一点雨
 * @公众号 江南一点雨
 * @微信号 a_java_boy
 * @GitHub https://github.com/lenve
 * @博客 http://wangsong.blog.csdn.net
 * @网站 http://www.javaboy.org
 * @时间 2019-10-01 19:41
 */
@Service
public class RoleService {
    @Autowired
    roleMapper roleMapper;
    public List<role> getAllRoles() {
        return roleMapper.getAllRoles();
    }

    public Integer addRole(role role) {
        if (!role.getName().startsWith("ROLE_")) {
            role.setName("ROLE_" + role.getName());
        }
        return roleMapper.insert(role);
    }

    public Integer deleteRoleById(Integer rid) {
        return roleMapper.deleteByPrimaryKey(rid);
    }
}

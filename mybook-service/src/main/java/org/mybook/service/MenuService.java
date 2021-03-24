package org.mybook.service;

import org.mybook.dao.mapper.MenuMapper;
import org.mybook.dao.mapper.MenuRoleMapper;
import org.mybook.model.readers;
import org.mybook.model.Menu;
import org.mybook.model.MenuRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @作者 江南一点雨
 * @公众号 江南一点雨
 * @微信号 a_java_boy
 * @GitHub https://github.com/lenve
 * @博客 http://wangsong.blog.csdn.net
 * @网站 http://www.javaboy.org
 * @时间 2019-09-27 7:13
 */
@Service
@CacheConfig(cacheNames = "menus_cache")
public class MenuService {
    @Autowired
    MenuMapper menuMapper;
    @Autowired
    MenuRoleMapper menuRoleMapper;
    public List<Menu> getMenusByHrId() {
        System.out.println("当前id---start");
        System.out.println(((readers) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
        System.out.println("当前id---end");
        return menuMapper.getMenusByReId(((readers) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    //@Cacheable
    public List<Menu> getAllMenusWithRole() {
        List<Menu> _list=menuMapper.getAllMenusWithRole();
        System.out.println("打印菜单数据---------------------sart------------");
        System.out.println(_list.get(0).getName());
        System.out.println(_list.size());
        System.out.println("打印菜单数据---------------------end------------");
        return menuMapper.getAllMenusWithRole();
    }

    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }

    public List<Integer> getMidsByRid(Integer rid) {
        return menuMapper.getMidsByRid(rid);
    }

    @Transactional
    public boolean updateMenuRole(Integer rid, Integer[] mids) {
        menuRoleMapper.deleteByRid(rid);
        if (mids == null || mids.length == 0) {
            return true;
        }
        Integer result = menuRoleMapper.insertRecord(rid, mids);
        return result==mids.length;
    }
}

package org.mybook.dao.mapper;

import org.mybook.model.role;

import java.util.List;

public interface roleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(role record);

    int insertSelective(role record);

    role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(role record);

    int updateByPrimaryKey(role record);

    List<role> getAllRoles();
}
package org.mybook.dao.mapper;

import org.mybook.model.readers;
import org.mybook.model.role;

import java.util.List;

public interface readersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(readers record);

    int insertSelective(readers record);

    readers selectByPrimaryKey(Integer id);

    readers loadUserByUsername(String username);

    List<role> getReaderRolesById(Integer id);

    int updateByPrimaryKeySelective(readers record);

    int updateByPrimaryKey(readers record);
}
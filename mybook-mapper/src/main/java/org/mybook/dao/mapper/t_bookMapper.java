package org.mybook.dao.mapper;

import org.mybook.model.t_book;

import java.util.List;

public interface t_bookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(t_book record);

    int insertSelective(t_book record);

    t_book selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(t_book record);

    int updateByPrimaryKey(t_book record);

    List<t_book> GetBookList();
}
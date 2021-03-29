package org.mybook.dao.mapper;


import org.mybook.model.book_rank;

import java.util.List;

public interface book_rankMapper   {
    int deleteByPrimaryKey(Integer id);

    int insert(book_rank record);

    int insertSelective(book_rank record);

    book_rank selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(book_rank record);

    int updateByPrimaryKey(book_rank record);

    List<book_rank> GetBookRankList();
}
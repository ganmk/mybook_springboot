package org.mybook.service;

import org.mybook.dao.mapper.book_rankMapper;
import org.mybook.model.RespPageBean;
import org.mybook.model.book_rank;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class BookRankService {
    @Autowired
    book_rankMapper _rankMapper;

    public RespPageBean GetRankBooks()
    {
        List<book_rank> data=_rankMapper.GetBookRankList();
        RespPageBean bean = new RespPageBean();
        bean.setData(data);
        //bean.setTotal(total);
        return bean;


    }

    public Integer addRank(book_rank _rank) {
        return _rankMapper.insert(_rank);
    }
}

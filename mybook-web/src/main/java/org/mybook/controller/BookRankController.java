package org.mybook.controller;

import org.mybook.model.book_rank;
import org.mybook.model.RespBean;
import org.mybook.model.RespPageBean;
import org.mybook.service.BookRankService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book/rank")
public class BookRankController {
    @Autowired
    BookRankService bookRankService;

    @GetMapping("/GetRankBooks")
    public RespPageBean GetRankBooks() {
        return bookRankService.GetRankBooks();
    }

    @PostMapping("/add")
    public RespBean addRole(@RequestBody book_rank _rank) {
        if (bookRankService.addRank(_rank) == 1) {
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败!");
    }
}

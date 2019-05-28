package com.alban.api.demo.feign;

import com.alban.api.service.BookService;
import com.alban.model.DTO.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Alban
 * @Date 2019-05-28
 * @Email: mrfj@live.cn
 * @Description: book api
 */
@RestController
@RequestMapping("/book")
public class BookApi {

    private static final Logger logger = LoggerFactory.getLogger(BookApi.class);

    @Autowired
    private BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> list() {
        return this.bookService.findAll();
    }

    @RequestMapping(value = "/{uuid}", method = RequestMethod.GET)
    public Book detail(@PathVariable String uuid) {
        return this.bookService.loadByUuid(uuid);
    }

}

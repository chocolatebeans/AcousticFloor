package com.alban.business.demo.service.fegin;

import com.alban.model.DTO.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.*;

/**
 * @Author Alban
 * @Date 2019-05-28
 * @Email: mrfj@live.cn
 * @Description: book service
 */
@RestController
@RequestMapping("/book")
public class BookService {

    private static final Logger logger = LoggerFactory.getLogger(BookService.class);


    @RequestMapping(method = RequestMethod.GET)
    public Collection<Book> list() {
        logger.info("we find a request for all books");
        return this.buildBooks().values();
    }

    @RequestMapping(value = "/{uuid}", method = RequestMethod.GET)
    public Book detail(@PathVariable String uuid) {
        logger.info("we find a request, value uuid is {}",uuid);
        Map<String,Book> books = this.buildBooks();
        if(books.containsKey(uuid)){
            return books.get(uuid);
        }
        return null;
    }

    protected Map<String,Book> buildBooks() {
        Map<String,Book> bookMap=new HashMap<>();
        bookMap.put("1",new Book("1","SBN9876"
                ,"Data structure", BigDecimal.valueOf(55.6d),5));
        bookMap.put("2",new Book("2","SBN7675"
                ,"Algorithm", BigDecimal.valueOf(56.6d),2));
        bookMap.put("3",new Book("3","SBN9234"
                ,"Linear algebra", BigDecimal.valueOf(32d),9));
        bookMap.put("4",new Book("4","SBN9476"
                ,"Discrete mathematics", BigDecimal.valueOf(56d),5));
        bookMap.put("5",new Book("5","SBN9896"
                ,"Database principle", BigDecimal.valueOf(45d),0));
        bookMap.put("6",new Book("6","SBN9326"
                ,"Compter network", BigDecimal.valueOf(55d),3));
        bookMap.put("7",new Book("7","SBN4376"
                ,"Compliation principle", BigDecimal.valueOf(78.3d),1));
        return bookMap;
    }
}

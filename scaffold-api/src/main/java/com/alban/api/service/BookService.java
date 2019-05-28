package com.alban.api.service;

import com.alban.model.DTO.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author Alban
 * @Date 2019-05-28
 * @Email: mrfj@live.cn
 * @Description: book fegin service
 */
@FeignClient("SERVICE-DEMO-eureka")
public interface BookService {

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    List<Book> findAll();

    @RequestMapping(value = "/book/{uuid}", method = RequestMethod.GET)
    Book loadByUuid(@PathVariable("uuid") String uuid);


}

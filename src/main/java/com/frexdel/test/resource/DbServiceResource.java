package com.frexdel.test.resource;

import com.frexdel.test.dao.QuotesRepository;
import com.frexdel.test.model.Quote;
import com.frexdel.test.model.Quotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rest/db")
public class DbServiceResource {

    QuotesRepository quotesRepository;
    @Autowired
    public DbServiceResource(QuotesRepository quotesRepository) {
        this.quotesRepository = quotesRepository;
    }

    @GetMapping("/{username}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<String> getQuotes(@PathVariable("username")final String username){
        return
        quotesRepository.findQuoteByUserName(username)
                .stream()
                .map(Quote::getQuote)
                .collect(Collectors.toList());
    }

    @PostMapping("/add")
    public List<String> add(@RequestBody final Quotes quotes){
        return null;
    }



}

package com.frexdel.test.resource;

import com.frexdel.test.dao.QuotesRepository;
import com.frexdel.test.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/test")
public class ElshafiController {
    QuotesRepository quotesRepository;
@Autowired
    public ElshafiController(QuotesRepository quotesRepository) {
        this.quotesRepository = quotesRepository;
    }

    @GetMapping("")
    private List<Quote> hello(){
        return quotesRepository.findAll();
    }
    @GetMapping(value = "/hello/{usernamee}")
    private String helloByName(@PathVariable String usernamee){
        return String.format("Bonjour %s, how are you ?",usernamee);
    }
    @GetMapping("/quotes")
    private List<String> getAllQuotes(){
    return quotesRepository.findAll().stream().map(Quote::getUserName).collect(Collectors.toList());
    }

    @GetMapping(value = {"/test1","/test2"})
    private List<Quote> getlist(){
    List<Quote> data= Arrays.asList(new Quote("younessss","QQQQQQQQ"),

            new  Quote("younessss","QQQQQQQQ"));
    return data;
    }

    @GetMapping("/test3/{id}")
    private List<Quote> getQuoteById(@PathVariable final int id){

    List<Quote> data=quotesRepository.findAll().stream().filter(f->f.getId()==id).collect(Collectors.toList());
        return data;
    }

    @PostMapping({"/",""})
    private boolean save(@RequestBody final Quote quote){
    quotesRepository.save(quote);
    return true;
    }

    /**
     * Save Quote
     */



}
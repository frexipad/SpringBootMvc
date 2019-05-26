package com.frexdel.test.bootStrap;

import com.frexdel.test.dao.QuotesRepository;
import com.frexdel.test.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Component
public class BootStrapData implements CommandLineRunner {
    @Autowired
    QuotesRepository quotesRepository;
    @Override
    public void run(String... args) throws Exception {
        quotesRepository.save(new Quote("youness","c une Quote de youness"));
        quotesRepository.findAll().forEach(p->System.out.println(p));
    }
}

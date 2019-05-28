package com.frexdel.test.bootStrap;

import com.frexdel.test.dao.QuotesRepository;
import com.frexdel.test.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    @Autowired
    QuotesRepository quotesRepository;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Bonjour Youness App Started");

//        for (int i = 0; i < 5; i++) {
//            quotesRepository.save(new Quote("youness","Cest une cotes de youness"));
//        }
    }
}

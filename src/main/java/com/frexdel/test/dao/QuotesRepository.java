package com.frexdel.test.dao;

import com.frexdel.test.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface QuotesRepository extends JpaRepository<Quote,Long> {
    List<Quote> findQuoteByUserName(String username);

    ArrayList<String> findQuoteById(int id);
}

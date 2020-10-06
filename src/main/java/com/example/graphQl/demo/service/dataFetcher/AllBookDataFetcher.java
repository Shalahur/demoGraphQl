package com.example.graphQl.demo.service.dataFetcher;

import com.example.graphQl.demo.model.Book;
import com.example.graphQl.demo.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AllBookDataFetcher implements DataFetcher<List<Book>> {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> get(DataFetchingEnvironment dataFetchingEnvironment) throws Exception {
        return bookRepository.findAll();
    }
}

package com.example.graphQl.demo.service.dataFetcher;

import com.example.graphQl.demo.model.Book;
import com.example.graphQl.demo.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookDataFetcher implements DataFetcher<Book> {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book get(DataFetchingEnvironment dataFetchingEnvironment) throws Exception {

        String isn = dataFetchingEnvironment.getArgument("id");
        return bookRepository.findById(isn).get();
    }
}

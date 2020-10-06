package com.example.graphQl.demo.resource;

import com.example.graphQl.demo.service.GraphQLService;
import graphql.ExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest")
@RestController
public class BookResource {

    @Autowired
    GraphQLService graphQLService;

    @RequestMapping("/books")
    public ResponseEntity<Object> getAllBooks(@RequestBody String query) {
        ExecutionResult result = graphQLService.getGraphQL().execute(query);
        return new ResponseEntity<Object>(result, HttpStatus.OK);
    }
}

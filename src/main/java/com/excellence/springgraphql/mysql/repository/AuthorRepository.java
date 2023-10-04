package com.excellence.springgraphql.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excellence.springgraphql.mysql.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}

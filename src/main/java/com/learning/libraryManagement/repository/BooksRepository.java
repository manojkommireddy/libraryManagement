package com.learning.libraryManagement.repository;

import com.learning.libraryManagement.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books,Long> {

}

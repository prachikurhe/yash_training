package com.infy.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.infy.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	List<Book> findByAuthorName(String authorName);

	@Query("select b from Book b where b.price >= :price")
	List<Book> findByPriceGreaterThanEqualsTo(Integer price);

	@Query("select b from Book b where b.price < :price")
	List<Book> getBookLessThanPrice(Integer price);

//	List<Book> bookPublishedBetweenYear(LocalDate startYear, LocalDate endYear);
//
//	List<Book> bookPublishedAfterYear(LocalDate year);

	@Query("select b from Book b where b.authorName = :authorName and b.publisher = :publisher")
	List<Book> getBookByAuthorNameAndPublisher(String authorName, String publisher);
}
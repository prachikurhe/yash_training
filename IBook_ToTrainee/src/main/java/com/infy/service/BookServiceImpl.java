package com.infy.service;

import java.time.LocalDate;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.BookDTO;
import com.infy.entity.Book;
import com.infy.exception.InfyBookException;
import com.infy.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository repository;
	
	@Autowired
	ModelMapper mapper;
	
	@Override
	public BookDTO getBookDetails(Integer bookId) throws InfyBookException {
		Optional<Book> findById = repository.findById(bookId);
		return mapper.map(findById, BookDTO.class);
	}

	@Override
	public void addBook(BookDTO bookDTO) throws InfyBookException {
		repository.save(mapper.map(bookDTO, Book.class));
		System.out.println("save book");
	}

	@Override
	public List<BookDTO> getBookByAuthorName(String authorName) throws InfyBookException {
		List<Book> books = repository.findByAuthorName(authorName);
		List<BookDTO> collect = 
				books
				.stream()
				.map(book -> mapper.map(book, BookDTO.class))
				.collect(Collectors.toList());
		return  collect;
	}

	@Override
	public List<BookDTO> getBookGreaterThanEqualToPrice(Integer price) throws InfyBookException {
		List<Book> books = repository.findByPriceGreaterThanEqualsTo(price);
		List<BookDTO> collect = 
				books
				.stream()
				.map(book -> mapper.map(book, BookDTO.class))
				.collect(Collectors.toList());
		return  collect;
	}

	@Override
	public List<BookDTO> getBookLessThanPrice(Integer price) throws InfyBookException {
		List<Book> books = repository.getBookLessThanPrice(price);
		List<BookDTO> collect = 
				books
				.stream()
				.map(book -> mapper.map(book, BookDTO.class))
				.collect(Collectors.toList());
		return  collect;
	}

	@Override
	public List<BookDTO> bookPublishedBetweenYear(LocalDate startYear, LocalDate endYear) throws InfyBookException {
//		List<Book> books = repository.bookPublishedBetweenYear(startYear, endYear);
//		List<BookDTO> collect = 
//				books
//				.stream()
//				.map(book -> mapper.map(book, BookDTO.class))
//				.collect(Collectors.toList());
//		return  collect;
		return null;
	}

	@Override
	public List<BookDTO> bookPublishedAfterYear(LocalDate year) throws InfyBookException {
//		List<Book> books = repository.bookPublishedAfterYear(year);
//		List<BookDTO> collect = 
//				books
//				.stream()
//				.map(book -> mapper.map(book, BookDTO.class))
//				.collect(Collectors.toList());
//		return  collect;
		return null;
	}

	@Override
	public List<BookDTO> getBookByAuthorNameAndPublisher(String authorName, String publisher) throws InfyBookException {
		List<Book> books = repository.getBookByAuthorNameAndPublisher(authorName,publisher);
		List<BookDTO> collect = 
				books
				.stream()
				.map(book -> mapper.map(book, BookDTO.class))
				.collect(Collectors.toList());
		return  collect;
	}

	@Override
	public void updateBookPrice(Integer bookId, Integer price) throws InfyBookException {
		Optional<Book> findById = repository.findById(bookId);
		if(findById.isPresent()) {
			Book entity = findById.get();
			entity.setPrice(price);
			repository.save(entity);
		}
	}

	@Override
	public void deleteBook(Integer bookId) throws InfyBookException {
		Optional<Book> findById = repository.findById(bookId);
		if(findById.isPresent()) {
			Book entity = findById.get();
			repository.delete(entity);
		}
	}


	
}

package com.albertgarcia.mysql.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.albertgarcia.mysql.models.Book;
import com.albertgarcia.mysql.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    public Book updateBook(Long id, String title, String desc, String lang,  int numOfPages) {
    	Book book = this.findBook(id);
    	if(book == null) {
    		return null;
    	}
    	book.setTitle(title);
    	book.setDescription(desc);
    	book.setLanguage(lang);
    	book.setNumberOfPages(numOfPages);
    	
    	return bookRepository.save(book);
    }
    public void deleteBook(long id) {
    	Book book = this.findBook(id);
    	if(book == null) {
    		System.out.println("Book not found");
    	} else {
    		bookRepository.delete(book);
    	}
    	
    }
}

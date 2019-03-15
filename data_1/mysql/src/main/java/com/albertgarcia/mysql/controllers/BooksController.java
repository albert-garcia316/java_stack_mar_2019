package com.albertgarcia.mysql.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.albertgarcia.mysql.models.Book;
import com.albertgarcia.mysql.services.BookService;

@Controller
public class BooksController {
	private final BookService bookService;
    
    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }
	
	
	@GetMapping("/books")
	public String home(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
		return "index.jsp";
	}
    @RequestMapping("/books/new")
    public String newBook(@ModelAttribute("book") Book book) {
        return "new.jsp";
    }
    @RequestMapping(value="/books", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "new.jsp";
        } else {
            bookService.createBook(book);
            return "redirect:/books";
        }
    }
    @GetMapping("books/{id}")
    public String showBook(@PathVariable("id") Long id, Model model) {
    	Book book = bookService.findBook(id);
    	if(book != null) {
        	model.addAttribute("book", book);
        	return "show.jsp";
    	} else {
    		return "redirect:/books";
    	}
    }
}

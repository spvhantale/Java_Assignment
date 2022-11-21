package com.swapnil.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swapnil.model.Book;
@RestController
@RequestMapping("/bookservice")
public class MyController {
	
	private List<Book> list=new ArrayList<>();
	
	
	public MyController() {
		
		list.add(new Book(101, "abc", "a", "java", "pb", 5000, 650, "G20"));
		list.add(new Book(102, "cde", "c", "DSA", "pb", 7000, 850, "G21"));
		list.add(new Book(103, "efg", "e", "Coding", "pb", 8000, 750, "G22"));
		list.add(new Book(104, "ijk", "i", "java", "pb", 9000, 4450, "G23"));
		
	}
	
	
	@GetMapping("/hello")
	public ResponseEntity<String> myhello(){
		
		
		return new ResponseEntity<String>("Welcome", HttpStatus.OK);
	}
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getallBook(){
		
		
		return new ResponseEntity<List<Book>>(list, HttpStatus.OK);
		
	}
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBook(@PathVariable("id") Integer id){
		
		List<Book> l=list.stream().filter(s->s.getBookId()==id).toList();
		
		return new ResponseEntity<Book>(l.get(0), HttpStatus.OK);
	}
	
	@PostMapping("/books")
	public ResponseEntity<String> createBook(@RequestBody Book book){
		
		list.add(book);
		
		return new ResponseEntity<String>("book Added Successfully", HttpStatus.CREATED);
	}
	
	@DeleteMapping("/books/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer id){
		
		list.removeIf(s-> s.getBookId()==id);
		
		return new ResponseEntity<String>("deleted the book", HttpStatus.OK);
	}
	@PutMapping("books/{id}")
	public ResponseEntity<Book> UpdateBook(@PathVariable Integer id,@RequestBody Book book){
		
		List<Book> l=list.stream().filter(s->s.getBookId()==id).toList();
		
		l.get(0).setAuthor(book.getAuthor());
		l.get(0).setAuthor_no(book.getAuthor_no());
		l.get(0).setCategory(book.getCategory());
		l.get(0).setName(book.getName());
		l.get(0).setPages(book.getPages());
		l.get(0).setPrice(book.getPrice());
		l.get(0).setPublication(book.getPublication());
		
		return new ResponseEntity<Book>(l.get(0), HttpStatus.ACCEPTED);
		
	}
}

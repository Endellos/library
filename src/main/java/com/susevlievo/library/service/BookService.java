package com.susevlievo.library.service;

import com.susevlievo.library.domain.Book;
import com.susevlievo.library.exeptions.ObjectDoesNotExistException;
import com.susevlievo.library.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    BookRepository bookRepository;


    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

   public List<Book> getAllBooks(){
      return   bookRepository.findAll();
    }
    public Book getBookById(long id){
        if(!bookRepository.findById(id).isPresent()){
            throw new ObjectDoesNotExistException("Book with id"+ id + "does not exist");
        }
        return bookRepository.findById(id).get();
    }

    public Book addBook(Book book){
        return   bookRepository.save(book);

    }

    public void deleteBookById(long id){
        bookRepository.deleteById(id);
    }

}

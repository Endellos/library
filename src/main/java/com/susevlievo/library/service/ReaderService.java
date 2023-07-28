package com.susevlievo.library.service;

import com.susevlievo.library.domain.Reader;
import com.susevlievo.library.exeptions.ObjectDoesNotExistException;
import com.susevlievo.library.repository.ReaderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderService {
    ReaderRepository readerRepository;

    public ReaderService(ReaderRepository readerRepository) {
        this.readerRepository = readerRepository;
    }

    public List<Reader> getAllReaders(){
        return readerRepository.findAll();
    }

    public  Reader getReaderById(long id){
        if(!readerRepository.findById(id).isPresent()){
            throw new ObjectDoesNotExistException("Reader with id"+ id + "does not exist");
        }
        return readerRepository.findById(id).get();
    }

    public Reader addReader(Reader reader){
      return readerRepository.save(reader);
    }

    public void deleteReaderById(long id){
      readerRepository.deleteById(id);
    }

   public List<Reader> findReadersByFullName(String name){
        return readerRepository.findReadersByFullName(name);
    }
}

package com.stackoute.springjdbc.controller;

import com.stackoute.springjdbc.domain.Movie;
import com.stackoute.springjdbc.repository.SpringJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class SpringJdbcController {

    @Autowired
    private SpringJdbcRepository springJdbcRepository;

   /* public ResponseEntity<String> executeShow() {
        Movie entity = springJdbcRepository.get("10");
        return new ResponseEntity<String>("Student : "+entity.getMovieid()+ " "+entity.getMoviename(),HttpStatus.OK);
    }*/

    public ResponseEntity<String> insert() {
        Movie movie = new Movie(102,"nannaku prematho",2017,5);
        springJdbcRepository.insert(movie);
        return new ResponseEntity<String>("movie add: "+movie.getMovieid()+ " "+movie.getMoviename()+" "+movie.getMovieyear()+"  "+movie.getRating(),HttpStatus.OK);
    }

    /*public ResponseEntity<String> read() {
        Movie movie = springJdbcRepository.get("");
        return new ResponseEntity<String>("Student Get: "+movie.getMovieid()+ " "+movie.getMoviename()+" "+movie.getMovieyear()+"  "+movie.getRating(),HttpStatus.OK);
    }*/

    public ResponseEntity<String> update() {
        Movie movie = new Movie("dhoni",10);
        springJdbcRepository.update(movie);
        return new ResponseEntity<String>("Student Update: "+movie.getMovieid()+ " "+movie.getMoviename(),HttpStatus.OK);
    }

    public ResponseEntity<String> delete() {
        Movie entity = new Movie("rabhasa",20);
        springJdbcRepository.delete(entity);
        return new ResponseEntity<String>("Student Delete: "+entity.getMovieid()+ " "+entity.getMoviename(),HttpStatus.OK);
    }
    public ResponseEntity<?> getAll() {
        List<Movie> studentList =springJdbcRepository.getAll();
        return new ResponseEntity<List<Movie>>(studentList,HttpStatus.OK);
    }
}

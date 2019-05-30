package com.stackoute.springjdbc.repository;

import com.stackoute.springjdbc.domain.Movie;
import com.stackoute.springjdbc.domain.Movie;
import com.stackoute.springjdbc.mapper.MovieRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class SpringJdbcRepository {

    private JdbcTemplate jdbcTemplate;

    public SpringJdbcRepository(){}


    @Autowired
    public void  setDataSource(final DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Movie> getAll() {
        return jdbcTemplate.query("SELECT * FROM movie", new MovieRowMapper());
    }


    public int insert(Movie movie) {
        return jdbcTemplate.update("INSERT INTO movie VALUES (?, ?, ?, ?)", movie.getMovieid(), movie.getMoviename(),movie.getMovieyear(),movie.getRating());
    }

  /*  public Movie get(final String id) {
        final String query = "SELECT * FROM movie WHERE id = ?";
        return jdbcTemplate.queryForObject(query, new Object[] { id }, new MovieRowMapper());
    }*/

    public int update(Movie entity) {
        return jdbcTemplate.update("UPDATE movie SET name=? WHERE id=?", entity.getMoviename(), entity.getMovieid());
    }


    public int delete(Movie entity) {
        return jdbcTemplate.update("DELETE FROM movie WHERE ID=?", entity.getMovieid());
    }

}

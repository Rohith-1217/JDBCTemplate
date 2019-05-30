package com.stackoute.springjdbc.mapper;

import com.stackoute.springjdbc.domain.Movie;
import com.stackoute.springjdbc.domain.Movie;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

    public class MovieRowMapper implements org.springframework.jdbc.core.RowMapper<Movie> {

        @Override
        public Movie mapRow(final ResultSet rs, final int rowNum) throws SQLException {
             final Movie movie = new Movie();
            movie.setMovieid(rs.getInt("id"));
            movie.setMoviename(rs.getString("name"));
            movie.setMovieyear(rs.getInt("year"));
            movie.setRating(rs.getInt("rating"));
             return movie;
        }
    }

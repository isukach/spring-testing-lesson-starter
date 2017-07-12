package by.hector.dao;

import by.hector.entity.Genre;
import by.hector.entity.Movie;

import java.util.List;

/**
 * @author i.sukach
 */
public interface MovieDao {

    List<Movie> findAllByGenre(Genre genre);

    Movie findById(Long id);
}

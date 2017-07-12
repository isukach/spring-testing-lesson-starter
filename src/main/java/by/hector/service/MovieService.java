package by.hector.service;

import by.hector.entity.Genre;
import by.hector.entity.Movie;

/**
 * @author i.sukach
 */
public interface MovieService {

    int getCountByGenre(Genre genre);

    Movie findById(Long id);
}

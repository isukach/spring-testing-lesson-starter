package by.hector.service;

import by.hector.dao.MovieDao;
import by.hector.entity.Genre;
import by.hector.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author i.sukach
 */
@Service
public class MovieServiceImpl implements MovieService {

    private MovieDao movieDao;

    @Autowired
    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public int getCountByGenre(Genre genre) {
        return movieDao.findAllByGenre(genre).size();
    }

    @Override
    public Movie findById(Long id) {
        return movieDao.findById(id);
    }
}

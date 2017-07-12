package by.hector.dao;

import by.hector.entity.Genre;
import by.hector.entity.Movie;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author i.sukach
 */
@Repository
public class MovieDaoImpl implements MovieDao {

    private List<Movie> moviesInDatabase = Arrays.asList(
            new Movie(1L, "Cabin in the Woods", Genre.HORROR),
            new Movie(2L, "Scream", Genre.HORROR),
            new Movie(3L, "Terminator", Genre.ACTION),
            new Movie(4L, "Predator", Genre.ACTION),
            new Movie(5L, "Spiderman", Genre.ACTION)
    );

    @Override
    public List<Movie> findAllByGenre(Genre genre) {
        System.out.println("Going to database...");
        //TODO: real implementation here
        return moviesInDatabase
                .stream()
                .filter(m -> m.getGenre().equals(genre))
                .collect(toList());
    }

    @Override
    public Movie findById(Long id) {
        System.out.println("Going to database...");
        //TODO: real implementation here
        return moviesInDatabase
                .stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}

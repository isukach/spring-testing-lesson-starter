package by.hector.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author i.sukach
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    private Long id;
    private String name;
    private Genre genre;
}

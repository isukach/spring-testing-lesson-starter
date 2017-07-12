package by.hector.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author i.sukach
 */
@Configuration
@ComponentScan(basePackages = {"by.hector.dao", "by.hector.service"})
public class RootConfig {
}

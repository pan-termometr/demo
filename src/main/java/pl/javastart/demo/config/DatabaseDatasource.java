package pl.javastart.demo.config;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface DatabaseDatasource {
    List<String> getDatabase();
}

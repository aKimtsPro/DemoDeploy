package be.akimts.demo.deploy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "/book")
public interface BookRepository extends JpaRepository<Book, Long> {
}
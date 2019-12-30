package main.java.com.locspring.springit.respository;

import main.java.com.locspring.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRespository extends JpaRepository<Link, Long> {

    Link findByTitle(String title);
}

package main.java.com.locspring.springit.respository;

import main.java.com.locspring.springit.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRespository extends JpaRepository<Comment, Long> {
}

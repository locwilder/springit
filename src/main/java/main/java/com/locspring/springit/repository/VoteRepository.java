package main.java.com.locspring.springit.repository;

import main.java.com.locspring.springit.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote,Long> {
}

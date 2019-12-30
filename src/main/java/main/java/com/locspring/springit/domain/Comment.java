package main.java.com.locspring.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
public class Comment extends Auditable{
    
    @Id
    @GeneratedValue
    private long id;
    private String body;

    @ManyToOne
    private Link link;
}

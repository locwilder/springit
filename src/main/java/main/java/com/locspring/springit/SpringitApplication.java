package main.java.com.locspring.springit;

import com.config.SpringitProperties;
import org.ocpsoft.prettytime.PrettyTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import main.java.com.locspring.springit.domain.Comment;
import main.java.com.locspring.springit.domain.Link;
import main.java.com.locspring.springit.repository.CommentRepository;
import main.java.com.locspring.springit.repository.LinkRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.swing.*;

@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);

    public static void main(String[] args){
        SpringApplication.run(SpringitApplication.class, args);
    }

    @Bean
    PrettyTime prettyTime() {
        return new PrettyTime();
    }

    /*@Autowired
    private SpringitProperties springitProperties;

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository){
        return args -> {
            System.out.println("this is our message " + springitProperties.getWelcomeMsg());
            Link link = new Link("Getting startet", "url bla bla");
            linkRepository.save(link);

            Comment comment = new Comment("its awesome", link);
            commentRepository.save(comment);

            link.addComment(comment);

            System.out.println("we added a link with comment");

            Link firstlink = linkRepository.findByTitle("Getting startet");
            //System.out.println(firstlink.getTitle());

        };
    }*/


}

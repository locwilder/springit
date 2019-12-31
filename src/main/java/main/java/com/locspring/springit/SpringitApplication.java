package main.java.com.locspring.springit;

import com.config.SpringitProperties;
import main.java.com.locspring.springit.domain.Comment;
import main.java.com.locspring.springit.domain.Link;
import main.java.com.locspring.springit.repository.CommentRespository;
import main.java.com.locspring.springit.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(SpringitProperties.class)
public class SpringitApplication {

    @Autowired
    private SpringitProperties springitProperties;

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRespository commentRespository){
        return args -> {
            System.out.println("this is our message " + springitProperties.getWelcomeMsg());
            Link link = new Link("Getting startet", "url bla bla");
            linkRepository.save(link);

            Comment comment = new Comment("its awesome", link);
            commentRespository.save(comment);

            link.addComment(comment);

            System.out.println("we added a link with comment");

            Link firstlink = linkRepository.findByTitle("Getting startet");
            System.out.println(firstlink.getTitle());

        };
    }


}

package main.java.com.locspring.springit;

import org.ocpsoft.prettytime.PrettyTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.thymeleaf.extras.springsecurity5.dialect.SpringSecurityDialect;

@SpringBootApplication
@EnableJpaAuditing
@EnableTransactionManagement
public class SpringitApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);

    public static void main(String[] args){
        SpringApplication.run(SpringitApplication.class, args);
    }

    @Bean
    PrettyTime prettyTime() {
        return new PrettyTime();
    }

    // TODO * Configuring this bean should not be needed once Spring Boot's Thymeleaf starter includes configuration
// TODO   for thymeleaf-extras-springsecurity5 (instead of thymeleaf-extras-springsecurity4)
    @Bean
    public SpringSecurityDialect securityDialect() {
        return new SpringSecurityDialect();
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

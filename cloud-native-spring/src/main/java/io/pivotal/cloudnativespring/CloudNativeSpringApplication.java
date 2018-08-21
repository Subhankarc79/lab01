package io.pivotal.cloudnativespring;

//For Lab01
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//For Lab02
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@SpringBootApplication //<----- Lab01
@RestController //<---- Lab01

@EnableJpaRepositories // <---- Lab02
@Import(RepositoryRestMvcConfiguration.class) // <---- Lab02

public class CloudNativeSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudNativeSpringApplication.class, args);
	}
	
	@RequestMapping("/")
	public String hello() {
	    return "Hello World! - From Subhankar";
	}
}



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class Online_Movie_Rest_Application {

	public static void main(String[] args) {
		SpringApplication.run(Online_Movie_Rest_Application.class, args);
		System.out.println("spring boot rest api up");
	}

}

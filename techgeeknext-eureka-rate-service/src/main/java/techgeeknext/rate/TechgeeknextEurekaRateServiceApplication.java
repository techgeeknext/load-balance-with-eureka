package techgeeknext.rate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TechgeeknextEurekaRateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechgeeknextEurekaRateServiceApplication.class, args);
	}
}

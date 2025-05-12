package proj.promptgame.prompttoJSON;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class PromptToJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PromptToJsonApplication.class, args);
	}

}

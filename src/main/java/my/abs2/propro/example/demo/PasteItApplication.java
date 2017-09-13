package my.abs2.propro.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.Arrays;

@SpringBootApplication
public class PasteItApplication {

	public static void main(String[] args) {
		// SpringApplication.run(PasteItApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(PasteItApplication.class, args);
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		System.out.println("**************************************");
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
	}
}

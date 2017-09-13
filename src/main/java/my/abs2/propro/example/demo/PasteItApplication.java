package my.abs2.propro.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import java.util.concurrent.TimeUnit;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.http.HttpStatus;
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
	
	@Bean
	public EmbeddedServletContainerFactory servletContainer() {
	    TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
	    factory.setPort(9876);
	    factory.setSessionTimeout(10, TimeUnit.MINUTES);
	    factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/notfound.html"));
	    return factory;
	} 
}

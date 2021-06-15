package br.com.moreirallan.manipulacaoarquivos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories({
		"br.com.moreirallan.core.auth",
		"br.com.moreirallan.core.clients"
})
@EntityScan({
		"br.com.moreirallan.core.auth"
})
@ComponentScan({
		"br.com.moreirallan.core.utils",
		"br.com.moreirallan.core.rest",
		"br.com.moreirallan.core.auth",
		"br.com.moreirallan.core.clients",
		"br.com.moreirallan.manipulacaoarquivos",
})
@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
}

package br.com.sales_service.Sales_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SalesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesServiceApplication.class, args);
	}

}

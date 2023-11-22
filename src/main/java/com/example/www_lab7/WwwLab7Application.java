package com.example.www_lab7;

import com.example.www_lab7.enums.ProductStatus;
import com.example.www_lab7.models.Product;
import com.example.www_lab7.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import net.datafaker.Faker;
import net.datafaker.providers.base.Device;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WwwLab7Application {

    public static void main(String[] args) {
        SpringApplication.run(WwwLab7Application.class, args);
    }

    @Autowired
    private ProductRepository repository;
//    @Bean
    CommandLineRunner createSampleProduct() {
        return args -> {
            Faker faker = new Faker();
            Device device = faker.device();
            for (int i = 0; i < 200; i++) {
                Product product = new Product(
                        device.modelName(),
                        faker.lorem().paragraph(30), "piece",
                        device.manufacturer(), ProductStatus.ACTIVE
                );
                repository.save(product);
            }
        };
    }
}

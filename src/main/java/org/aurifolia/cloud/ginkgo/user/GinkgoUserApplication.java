package org.aurifolia.cloud.ginkgo.user;

import org.aurifolia.cloud.id.client.generator.IdGenerator;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Duration;
import java.time.Instant;

/**
 * GinkgoUserApplication
 *
 * @author Peng Dan
 * @since 1.0
 */
@SpringBootApplication
public class GinkgoUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(GinkgoUserApplication.class, args);
	}

    @Bean
    public ApplicationRunner applicationRunner(IdGenerator idGenerator) {
        return args -> {
            int times = 10000000;
            long id = -1;
            Instant now = Instant.now();
            for (int i = 0; i < times; i++) {
                long current = idGenerator.nextId();
                if (current < id) {
                    throw new RuntimeException("id is duplicated");
                }
                id = current;
            }
            System.out.println((double) times / Duration.between(now, Instant.now()).toMillis());
        };
    }
}

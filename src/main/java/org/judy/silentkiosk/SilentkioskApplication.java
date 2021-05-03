package org.judy.silentkiosk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SilentkioskApplication {

    public static void main(String[] args) {
        SpringApplication.run(SilentkioskApplication.class, args);
    }

}

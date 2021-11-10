package verm.jvrs.com.memours;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "verm.jvrs.com.memours")
@EnableMongoRepositories
@EntityScan("verm.jvrs.com.memours.core.entity")
public class MemoursApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemoursApplication.class, args);
    }
}

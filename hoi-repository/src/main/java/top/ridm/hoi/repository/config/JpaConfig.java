package top.ridm.hoi.repository.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "top.ridm.hoi.repository")
@Configuration
public class JpaConfig {
}

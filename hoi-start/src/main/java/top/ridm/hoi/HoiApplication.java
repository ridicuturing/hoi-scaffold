package top.ridm.hoi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "top.ridm.hoi")
public class HoiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HoiApplication.class, args);
    }

}

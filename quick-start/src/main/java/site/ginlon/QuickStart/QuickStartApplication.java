package site.ginlon.QuickStart;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 主启动类
 */
@SpringBootApplication
public class QuickStartApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(QuickStartApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}

package lk.pulasthi.sfgdi;

import lk.pulasthi.sfgdi.controllers.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
		  Controller controller = (Controller) context.getBean("controller");

		System.out.println(controller.hello());
	}

}

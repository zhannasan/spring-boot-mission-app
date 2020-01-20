package dev.mission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import dev.mission.exec.InsererMission;
import dev.mission.exec.ListerMissions;

@SpringBootApplication
public class MissionAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MissionAppApplication.class, args);
		
		Runnable exec = context.getBean(ListerMissions.class);
		exec.run();

	}

}

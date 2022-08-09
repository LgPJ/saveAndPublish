package com.siif;

/*import org.jobrunr.scheduling.JobScheduler;
import org.jobrunr.scheduling.cron.Cron;
import org.springframework.beans.factory.annotation.Autowired;*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.siif.configuration.JobrunrConfig;
/*import com.siif.service.SaveTokenService;*/

@SpringBootApplication
@Import(JobrunrConfig.class)
public class SaveAndPublishApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaveAndPublishApplication.class, args);
	}
	
	/*@Autowired
	private JobScheduler jobScheduler;
	
	@Autowired
	private SaveTokenService saveTokenService;*/
	
	//Execute recurring get token job every 15 minutes
	/*public void execute() {
		jobScheduler.scheduleRecurrently(() -> saveTokenService.save(), Cron.every5minutes());
	}*/

}

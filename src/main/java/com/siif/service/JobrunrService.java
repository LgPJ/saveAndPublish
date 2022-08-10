package com.siif.service;

import org.jobrunr.scheduling.JobScheduler;
import org.jobrunr.scheduling.cron.Cron;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobrunrService {
	
	@Autowired
	private JobScheduler jobScheduler;
	
	@Autowired
	private SaveTokenService saveTokenService;
	
	//Execute recurring get token job every 15 minutes
	public void execute() {
		 jobScheduler.scheduleRecurrently(() -> saveTokenService.save(), Cron.every5minutes());
	}

}

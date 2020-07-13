package com.example.demo.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	private Job job;
	
	@GetMapping("/invokejob")
	public String invokeJob() throws Exception {
		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
                .toJobParameters();
        jobLauncher.run(job, jobParameters);

		return "Job is called";
	}
}

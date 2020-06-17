package com.example.demo.listener;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;

public class PersonProcessListener extends JobExecutionListenerSupport{

	@Override
	public void afterJob(JobExecution jobExecution) {
		if(jobExecution.getStatus()== BatchStatus.COMPLETED) {
			System.out.println(" =================  ");
			System.out.println("completed..");
		}
	}
	
	

}

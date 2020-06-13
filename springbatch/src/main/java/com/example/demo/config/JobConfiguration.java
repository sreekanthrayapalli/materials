package com.example.demo.config;

import java.io.Reader;
import java.io.Writer;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.batchsteps.StringProcess;
import com.example.demo.batchsteps.StringReader;
import com.example.demo.batchsteps.StringWriter;
import com.example.demo.listener.StringProcessListener;

@Configuration
public class JobConfiguration {

	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Autowired
	private StepBuilderFactory stepBuilderFactory;

	@Bean
	public Job processJob() {
		return jobBuilderFactory.get("p").incrementer(new RunIdIncrementer()).listener(listener()).flow(orderStep1())
				.end().build();
	}

	@Bean
	public JobExecutionListener listener() {
		// TODO Auto-generated method stub
		return new StringProcessListener();
	}

	@Bean
	public Step orderStep1() {
		return stepBuilderFactory.get("o").<String, Integer> chunk(1)
				.reader(new StringReader()).processor(new StringProcess())
				.writer(new StringWriter()).build();

	}

}

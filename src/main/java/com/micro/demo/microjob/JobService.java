package com.micro.demo.microjob;

import java.util.concurrent.TimeUnit;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;

@Component
public class JobService {
	private static Logger logger = LoggerFactory.getLogger(JobService.class);
	@XxlJob("demoJobHandler")
	public void demoJobHandler() throws Exception {
		XxlJobHelper.log("XXL-JOB, Hello World.");

		for (int i = 0; i < 5; i++) {
			XxlJobHelper.log("beat at:" + i);
			TimeUnit.SECONDS.sleep(2);
		}
		// default success
	}
}

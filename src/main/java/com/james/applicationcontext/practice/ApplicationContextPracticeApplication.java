package com.james.applicationcontext.practice;
import com.james.applicationcontext.practice.service.GreetingService;
import com.james.applicationcontext.practice.service.OutputService;
import com.james.applicationcontext.practice.service.TimeService;

public class ApplicationContextPracticeApplication {

	public static void main(String[] args) throws Exception {
		GreetingService greetingService = new GreetingService("Hello");
		TimeService timeService = new TimeService(true);
		OutputService outputService = new OutputService(greetingService, timeService);

		for (int i=0;i<5;i++){
			outputService.generateOutput("World");
			Thread.sleep(3000);
		}
	}
}

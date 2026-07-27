package Hooks;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import com.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass{
	
	@After
	public void after(Scenario scenario) throws IOException {
		
		if (scenario.isFailed()) {
			String screenShotPath = screenShot(driver,scenario.getName() );
			
			//for cucumber report
			byte[] ss = Files.readAllBytes(new File(screenShotPath).toPath());
			
			scenario.attach(ss, "image/png", scenario.getName());
			
		}

	}

}

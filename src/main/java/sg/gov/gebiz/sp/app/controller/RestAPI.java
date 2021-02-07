package sg.gov.gebiz.sp.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {

	
	@GetMapping("/api/message")
	public String getMessage() {
		return "OK 200";
	}

}

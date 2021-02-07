package sg.gov.gebiz.sp.app.model;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginDetail {

	@GetMapping
	public String getUserDetail() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = "";
		if(principal instanceof UserDetails) {
			username = ((UserDetails) principal).getUsername();

		}else {
			username = principal.toString();
		}
		return "You are logged in as: " + username;
	}
}

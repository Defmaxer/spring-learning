package ch.andres.springlearning.users;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

//	@GetMapping({"{id}"})
//	public @ResponseBody ResponseEntity<User> getSingleUser(long userId) {
//		
//		return new ResponseEntity<User>(User user, HttpStatus.OK);
//	}
	
	
}

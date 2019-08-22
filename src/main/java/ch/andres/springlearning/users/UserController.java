package ch.andres.springlearning.users;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
		userService.createExampleUsers();
	}

	/**
	 * This method returns User with requested Id
	 * @param id
	 * @return ResponseEntity with the User
	 */
	@GetMapping({"/{id}"})
	public @ResponseBody ResponseEntity<User> getUserById(@PathVariable int id) {	
		userService.createExampleUsers();
		User user = userService.getUserById(id);
		if(user == null) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	/**
	 * This method returns all Users
	 * @return ResponseEntity with an ArrayList within all Users
	 */
	@GetMapping({"", "/"}) 
	public @ResponseBody ResponseEntity<Iterable<User>> getAllUsers() {	
		ArrayList<User> allUsers = userService.getAllUsers();
		return new ResponseEntity<>(allUsers, HttpStatus.OK);
	}
	
	/**
	 * This method creates a single user
	 * @param user
	 * @return String message as a feedback for the user
	 */
	@PostMapping("/registration")
	public @ResponseStatus ResponseEntity<String> createSingleUser(@RequestBody User user) {
		String msg = userService.createUser(user);
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}
	
	/**
	 * This method edits an existing user completly
	 * @param user
	 * @return String message as a feedback for the user
	 */
	@PutMapping("/edit")
	public @ResponseStatus ResponseEntity<String> editSingleUser(@RequestBody User user) {
		String msg = userService.editUser(user);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public @ResponseStatus ResponseEntity<String> deleteUser(@PathVariable int id) {
		String msg = userService.removeUser(id);
		return new ResponseEntity<String>(msg, HttpStatus.NO_CONTENT);
	}
	
}

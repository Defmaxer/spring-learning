package ch.andres.springlearning.helloworld;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {

	@GetMapping({"", "/"})
	public @ResponseBody ResponseEntity<String> getText() {
		return new ResponseEntity<String>("Hello World", HttpStatus.OK);
	}

}

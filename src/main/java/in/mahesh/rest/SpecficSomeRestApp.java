package in.mahesh.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpecficSomeRestApp {
	
	@GetMapping("/login")
	public ResponseEntity<String> loginPage(){
		return new ResponseEntity<String>("Welcome to Login Page", HttpStatus.OK);
	}
	
	
	@GetMapping("/transfer")
	public ResponseEntity<String> transfer(){
		return new ResponseEntity<String>("Welcome to transfer Page", HttpStatus.OK);
	}
	
	
	@GetMapping("/balance")
	public ResponseEntity<String> balance(){
		return new ResponseEntity<String>("Welcome to balance Page", HttpStatus.OK);
	}
	
	@GetMapping("/aboutUs")
	public ResponseEntity<String> aboutUs(){
		return new ResponseEntity<String>("Welcome to aboutUs Page", HttpStatus.OK);
	}
	
	
	
	@GetMapping("/contactUs")
	public ResponseEntity<String> contactUs(){
		return new ResponseEntity<String>("Welcome to contactUs Page", HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

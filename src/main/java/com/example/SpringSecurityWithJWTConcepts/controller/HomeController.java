package com.example.SpringSecurityWithJWTConcepts.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    /*
		We will be configuring Spring Security and JWT for performing 2 operations-
			Generating JWT - Expose a POST API with mapping /authenticate. On passing correct username and password it will generate a JSON Web Token(JWT)
			Validating JWT - If user tries to access GET API with mapping /hello. It will allow access only if request has a valid JSON Web Token(JWT)
	 */

    @GetMapping("/")
    public ResponseEntity<String> rootPage() {
        String rootPageContents = "<h2>Root Page</h2><br><br>" +
                "/admin -> for ADMIN role <br>" +
                "/public -> for everyone" +
                "/logout -> for logout";
        return new ResponseEntity<>(rootPageContents, HttpStatus.OK);
    }

    @GetMapping("/public/welcome")
    public ResponseEntity<String> welcomePage() {
        return new ResponseEntity<>("<h2>Welcome page</h2>", HttpStatus.OK);
    }

    @GetMapping("/home")
    public ResponseEntity<String> homePage() {
        return new ResponseEntity<>("<h2>Home page</h2>", HttpStatus.OK);
    }

    @GetMapping("/admin")
    public ResponseEntity<String> adminPage() {
        return new ResponseEntity<>("<h2>This is admin user</h2>", HttpStatus.OK);
    }

    @GetMapping("/normalUser")
    public ResponseEntity<String> normalUserPage() {
        return new ResponseEntity<>("<h2>This is normal user</h2>", HttpStatus.OK);
    }

}

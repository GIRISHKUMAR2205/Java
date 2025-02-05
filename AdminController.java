//package com.findshow.controller;
//
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.findshow.model.User;
//import com.findshow.service.UserService;
//
//@Controller
//public class AdminController {
//	@Autowired
//	private UserService userservice;
//	@GetMapping("/admin")
//	public String adminPage() {
//		
//		return "homepage";
//	}
//	@PostMapping("/admin")
//	public String adminLogin(@RequestParam("email") String email,@RequestParam("password") String password, Model model) {
//        User user = new User();
//        user.setEmail(email);
//        user.setName(password);
//        model.addAttribute("user", user);
//		return "admindashboard";
//	}
//	
//}
package com.findshow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.findshow.LogController;

@Controller
public class AdminController  {

    @GetMapping("/home")
    public String showHomePage(Model model) {
        // Sample list of movies (you can retrieve this from a database)
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Movie 1", "2025-02-10 18:00"));
        movies.add(new Movie("Movie 2", "2025-02-11 20:00"));
        
        // Add the movie list and current date to the model
        model.addAttribute("movies", movies);
        model.addAttribute("currentDate", new Date());
        
        return "homepage"; // This refers to home.jsp
    }

    public static class Movie {
        private String name;
        private String showTime;

        public Movie(String name, String showTime) {
            this.name = name;
            this.showTime = showTime;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
        	this.name=name;
        }
        public void setShowTime(String name) {
        	this.showTime=name;
        }

        public String getShowTime() {
            return showTime;
        }
    }
}


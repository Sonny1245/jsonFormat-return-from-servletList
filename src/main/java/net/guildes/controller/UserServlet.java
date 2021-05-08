package net.guildes.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import net.guildes.model.User;
import net.guildes.service.UserService;


//Testing new branch...

@WebServlet(urlPatterns= {"/users"}, name="UserServlet" , description="UserServlet returns json")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService service = new UserService();
  
    public UserServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<User> users = new ArrayList<>();
		users = service.getUsers();
		
		
		Gson gson = new Gson();
		String userJson = gson.toJson(users);
		
		PrintWriter printWriter = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		printWriter.write(userJson);
		printWriter.close();
		
	}

}

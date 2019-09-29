package org.soft.oa.product.Servlet;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.soft.oa.product.Dao.TestUserDao;
import org.soft.oa.product.Factory.Factory;
import org.soft.oa.product.model.TestUser;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


@WebServlet("/doUserServer")
public class TestUserServlet  extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private String op = null;

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;charset=utf-8");
		
		BufferedReader reader = request.getReader();
        String json = reader.readLine();
        System.out.println(json);
        reader.close();

        JsonParser jParser = new JsonParser();
        JsonObject jsonObject = jParser.parse(json).getAsJsonObject();
        
        op  = jsonObject.get("op").getAsString();
        String userAccount = jsonObject.get("userAccount").getAsString();
        String userPassword = jsonObject.get("userPassword").getAsString();
        
        TestUser testUser = new TestUser(0, userAccount, userPassword);
        
        if (op == "UserLogin" || "UserLogin".equals(op)) {
        	this.dologin(request, response,testUser);
		}	
       
	}
	

	 
	protected void dologin(HttpServletRequest request, HttpServletResponse response,TestUser testUser) throws ServletException, IOException {
		
		
        
		TestUserDao testUserDao = Factory.getFactory().geTestUserDao();
		testUser = testUserDao.login(testUser);
		if (testUser != null) {
			request.getSession().setAttribute("testUser", testUser);
			String jsonStr="{\"success\":\"true\",\"data\":\"false\"}";
			response.getWriter().write(jsonStr);
		}
	}
}
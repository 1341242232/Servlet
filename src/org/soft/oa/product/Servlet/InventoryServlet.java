package org.soft.oa.product.Servlet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.soft.oa.product.Dao.InventoryDao;
import org.soft.oa.product.Factory.Factory;
import org.soft.oa.product.model.Inventory;
import org.soft.oa.product.utlis.GsonJson;
import org.soft.oa.product.utlis.StringToData;

import com.google.gson.Gson;
import com.google.gson.JsonObject;


@WebServlet("/doInventoryServlet")
public class InventoryServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String op = null;
	
	
	@Override
	public void init() throws ServletException {
		super.init();
	}
	
	
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
		String jsonStr = reader.readLine();
		reader.close();
		
		Gson gson = new Gson();
		
		GsonJson gsonJson = gson.fromJson(jsonStr, GsonJson.class);
		System.out.println(gsonJson.toString());
		op = gsonJson.getOp();
		int inventoryId = gsonJson.getInventoryId();
		
		
		 if (op == "doaddproduct" || "doaddproduct".equals(op)) {
			 String iDate = gsonJson.getiDate();
			 Date date = StringToData.parseTimeFormattoDayDate(iDate);
			 Inventory inventory = new Inventory(0, gsonJson.getStorageId(), gsonJson.getiName(), gsonJson.getiNumber(), gsonJson.getiType(), gsonJson.getiSpecification(),date, gsonJson.getRemark(), gsonJson.getpId(), gsonJson.getTransactor());
			this.doaddProduct(request, response,inventory);
		}else if (op == "doqueryoroduct" || "doqueryoroduct".equals(op)) {
			this.doqueryProductList(request, response);
		}else if (op == "dodeleteProduct" || "dodeleteProduct".equals(op)) {
			this.dodeleteProduct(request, response,inventoryId);
		}
	}
	

	protected void doaddProduct(HttpServletRequest request, HttpServletResponse response,Inventory inventory) throws ServletException, IOException {
		
		InventoryDao inventoryDao = Factory.getFactory().getInventoryDao();
		boolean b = inventoryDao.addProduct(inventory);
		System.out.println(b);
		if (b) {
			String json = "{\"success\":\"true\"}";
			response.getWriter().write(json);
			System.out.println(json);
		}else {
			String json = "{\"error\":\"false\"}";
			response.getWriter().write(json);
		}
	}
	
	protected void doqueryProductList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Inventory> list = new ArrayList<Inventory>();
		InventoryDao inventoryDao = Factory.getFactory().getInventoryDao();
		list = inventoryDao.queryInventoryList();
		if (list != null) {
			PrintWriter out = null;
			Gson gson = new Gson();
			String jtr = gson.toJson(list);
			try {
				out = response.getWriter();
				out.print(jtr.toString());
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				out.flush();
				out.close();
			}
			System.out.println(jtr);
		}
	}
	
	
	protected void dodeleteProduct(HttpServletRequest request, HttpServletResponse response,int inventoryId) throws ServletException, IOException {
		InventoryDao inventoryDao = Factory.getFactory().getInventoryDao();
		boolean b = inventoryDao.deleteInventoryById(inventoryId);
		System.out.println(b);
		PrintWriter out = response.getWriter();
		if (b) {
			    out.write("{\"success\":\"true\"}"); 
		}else {
			  out.write("{\"error\":\"false\"}"); 
		}
		out.flush();
        out.close();
	}
}

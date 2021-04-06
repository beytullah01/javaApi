package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.Closeable;

import dao.implementKisiDao;
import dao.kisiDao;

@WebServlet("/loginController")
public class login extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	
			
			String kullaniciAdi=req.getParameter("kullaniciAdi");
			String sifre=req.getParameter("sifre");
			
			kisiDao kisi=new implementKisiDao();
			int a=kisi.kisiSorgula(kullaniciAdi, sifre);
			System.out.println(a);
			
			if(a==1) {
				
				RequestDispatcher dis =req.getRequestDispatcher("anasayfa.jsp");
				dis.forward(req, resp);
				
				
				
			}else if((kisi.kisiSorgula(kullaniciAdi, sifre)==0)) {
				
				RequestDispatcher dis =req.getRequestDispatcher("giris.jsp");
				dis.forward(req, resp);
				
				
			}
			
			//HttpSession session=req.getSession();
			
			//session.setAttribute(kullaniciAdi, kullaniciAdi);
			//session.getAttribute(kullaniciAdi);
			
			
		
		
		
		
	}
	
}

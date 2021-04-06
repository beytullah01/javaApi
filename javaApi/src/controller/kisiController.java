package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.implementKisiDao;
import dao.kisiDao;


@WebServlet("/kisiiController")
public class kisiController extends HttpServlet{
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
			int id=Integer.parseInt(req.getParameter(""));
			
			kisiDao kisi=new implementKisiDao();
		
			
			
		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
	
			long tc=Long.parseLong(req.getParameter("tc"));
			String ad=req.getParameter("ad");
			String soyad=req.getParameter("soyad");
			String kullaniciAdi=req.getParameter("kullaniciAdi");
			String sifre=req.getParameter("sifre");
			
			kisiDao kisi=new implementKisiDao();
			
			kisi.kisiyiEkle(tc, ad, soyad, kullaniciAdi, sifre);
			
			RequestDispatcher disp=req.getRequestDispatcher("giris.jsp");
			disp.forward(req, resp);
			
			System.out.println("beytullah bozkurrt");

			
			
			
			
			
		}

}

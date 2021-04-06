package dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ConnectionGroupManager;
import com.sun.net.httpserver.Authenticator.Result;

public class implementKisiDao implements kisiDao {

	private static final String insert="insert into kisi(tc,ad,soyad,kullaniciAdi,sifre) values(?,?,?,?,?)";
	private static final String search="select * from kisi where kullaniciAdi=? and sifre=?";
	

	private DataSource mysqldata() {
		
		baglanti manager =new baglanti();
		DataSource dataSource=manager.getMySQLDataSource();
		
		
		return dataSource;
	}
	public void kisiyiEkle(Long tc, String ad, String soyad, String kullaniciAdi, String sifre) {

		DataSource dataSource= mysqldata();
		
		try {
			Connection connection=(Connection) dataSource.getConnection();
			PreparedStatement ps=connection.prepareStatement(insert);
			ps.setLong(1, tc);
			ps.setString(2, ad);
			ps.setString(3, soyad);
			ps.setString(4, kullaniciAdi);
			ps.setString(5, sifre);
			ps.executeUpdate();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public int  kisiSorgula(String kullaniciAdi, String sifre) {
		
		int a=0;
		int say=0;
		DataSource dataSource=mysqldata();
		try {
			Connection connection=(Connection) dataSource.getConnection();
			PreparedStatement ps=connection.prepareStatement(search);
			
			ps.setString(1, kullaniciAdi);
			ps.setString(2, sifre);
			
			ResultSet result= ps.executeQuery();
			
			while(result.next()) {
				++say;
			
			
			
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return say;
	}







}

package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ConnectionGroupManager;

public class implementKisiDao implements kisiDao {

	private static final String insert="insert into kisi(tc,ad,soyad,kullaniciAdi,sifre) values(?,?,?,?,?)";
	

	private DataSource mysqldata() {
		
		baglanti manager =new baglanti();
		DataSource dataSource=manager.getMySQLDataSource();
		
		
		return dataSource;
	}
	public void kisiyiEkle(int tc, String ad, String soyad, String kullaniciAdi, String sifre) {

		DataSource dataSource= mysqldata();
		
		try {
			Connection connection=(Connection) dataSource.getConnection();
			PreparedStatement ps=connection.prepareStatement(insert);
			ps.setInt(1, tc);
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







}

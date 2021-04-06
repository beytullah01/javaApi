package dao;

public interface kisiDao {
	
	public void kisiyiEkle(Long tc,String ad,String soyad,String kullaniciAdi,String sifre);
	
	public int  kisiSorgula(String  kullaniciAdi,String sifre);
	

	
	
}

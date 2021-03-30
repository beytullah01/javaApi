package model;

public class kisi {

	private int id;
	private int tc;
	private String ad;
	private String soyad;
	private String kullaniciAdi;
	private String sifre;
	
	
	
	public kisi(int id, int tc, String ad, String soyad, String kullaniciAdi, String sifre) {
	
		this.id = id;
		this.tc = tc;
		this.ad = ad;
		this.soyad = soyad;
		this.kullaniciAdi = kullaniciAdi;
		this.sifre = sifre;
	}
	

	
	public kisi() {
		super();
	}
	


	public int getTc() {
		return tc;
	}


	public void setTc(int tc) {
		this.tc = tc;
	}


	public String getAd() {
		return ad;
	}



	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getSoyad() {
		return soyad;
	}


	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}


	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	
	
}

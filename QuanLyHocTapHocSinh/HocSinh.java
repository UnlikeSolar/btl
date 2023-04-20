package QuanLyHocTapHocSinh;

import java.io.Serializable;
import java.util.Scanner;

public class HocSinh implements Serializable{
	protected String maHocSinh; 
	protected String hoVaTen; 
	protected String lop;
	protected String ngaySinh;
	protected String gioiTinh; 
	protected double diemToan; 
	protected double diemVan;
	protected double diemAnh; 
	protected String hanhKiem; 
	protected double diemTrungBinh;
	
	
	public HocSinh(String maHocSinh, String hoVaTen, String lop, String ngaySinh, String gioiTinh, double diemToan,
			double diemVan, double diemAnh, String hanhKiem, double diemTrungBinh) {
		super();
		this.maHocSinh = maHocSinh;
		this.hoVaTen = hoVaTen;
		this.lop = lop;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diemToan = diemToan;
		this.diemVan = diemVan;
		this.diemAnh = diemAnh;
		this.hanhKiem = hanhKiem;
		this.diemTrungBinh = diemTrungBinh;
	}
	
	public HocSinh() {
		super();
	}
	



	public String getMaHocSinh() {
		return maHocSinh;
	}

	public void setMaHocSinh(String maHocSinh) {
		this.maHocSinh = maHocSinh;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public double getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}

	public double getDiemVan() {
		return diemVan;
	}

	public void setDiemVan(double diemVan) {
		this.diemVan = diemVan;
	}

	public double getDiemAnh() {
		return diemAnh;
	}

	public void setDiemAnh(double diemAnh) {
		this.diemAnh = diemAnh;
	}

	public String getHanhKiem() {
		return hanhKiem;
	}

	public void setHanhKiem(String hanhKiem) {
		this.hanhKiem = hanhKiem;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public void nhap() {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Nhap ma hoc sinh: ");
		maHocSinh=sc.nextLine(); 
		System.out.println("Nhap ho va ten: ");
		hoVaTen=sc.nextLine(); 
		System.out.println("Nhap lop: ");
		lop=sc.nextLine(); 
		System.out.println("Nhap ngay sinh: ");
		ngaySinh=sc.nextLine();
		System.out.println("Nhap gioi tinh: ");
		gioiTinh=sc.nextLine(); 
		System.out.println("Nhap hanh kiem: ");
		hanhKiem=sc.nextLine(); 
		System.out.println("Nhap diem toan: ");
		diemToan=Double.parseDouble(sc.nextLine());
		System.out.println("Nhap diem van: ");
		diemVan=Double.parseDouble(sc.nextLine()); 
		System.out.println("Nhap diem anh: ");
		diemAnh=Double.parseDouble(sc.nextLine());
		
		
	}
	public void hienThi() {
		System.out.println("Ma hoc sinh: "+maHocSinh);
		System.out.println("Ho va ten: "+hoVaTen);
		System.out.println("Lop: "+lop);
		System.out.println("Ngay sinh: "+ngaySinh);
		System.out.println("Gioi tinh: "+gioiTinh);
		System.out.println("Hanh kiem: "+hanhKiem);
	}
	

}

package QuanLyHocTapHocSinh;

import java.io.Serializable;
import java.util.Scanner;

public class HocSinhKHXH extends HocSinh implements Serializable{
	private double diemSu; 
	private double diemDia; 
	private double diemGDCD;
	
	public HocSinhKHXH(String maHocSinh, String hoVaTen, String lop, String ngaySinh, String gioiTinh, double diemToan,
			double diemVan, double diemAnh, String hanhKiem, double diemTrungBinh, double diemSu, double diemDia,
			double diemGDCD) {
		super(maHocSinh, hoVaTen, lop, ngaySinh, gioiTinh, diemToan, diemVan, diemAnh, hanhKiem, diemTrungBinh);
		this.diemSu = diemSu;
		this.diemDia = diemDia;
		this.diemGDCD = diemGDCD;
	}
	
	public HocSinhKHXH() {
		super();
	}
	

	public double getDiemSu() {
		return diemSu;
	}

	public void setDiemSu(double diemSu) {
		this.diemSu = diemSu;
	}

	public double getDiemDia() {
		return diemDia;
	}

	public void setDiemDia(double diemDia) {
		this.diemDia = diemDia;
	}

	public double getDiemGDCD() {
		return diemGDCD;
	}

	public void setDiemGDCD(double diemGDCD) {
		this.diemGDCD = diemGDCD;
	}

	@Override
	public void nhap() {
		Scanner sc=new Scanner(System.in); 
		super.nhap();
		System.out.println("Nhap diem su: ");
		diemSu=Double.parseDouble(sc.nextLine());
		System.out.println("Nhap diem dia: ");
		diemDia=Double.parseDouble(sc.nextLine());
		System.out.println("Nhap diem GDCD: ");
		diemGDCD=Double.parseDouble(sc.nextLine());
		diemTrungBinh=(diemToan+diemVan+diemAnh+diemSu+diemDia+diemGDCD)/6;
	}
	@Override
	public void hienThi() {
		super.hienThi();
		System.out.println("Diem: Toan: "+diemToan+" Van:"+diemVan+" Anh:"+diemAnh+" Su:"+diemSu+" Dia:"+diemDia+" GDCD:"+diemGDCD);
		System.out.println("Diem trung binh: "+diemTrungBinh);
	}
	

}

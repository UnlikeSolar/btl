package QuanLyHocTapHocSinh;

import java.io.Serializable;
import java.util.Scanner;

public class HocSinhKHTN extends HocSinh implements Serializable{
	private double diemLy; 
	private double diemHoa; 
	private double diemSinh;
	public HocSinhKHTN(String maHocSinh, String hoVaTen, String lop, String ngaySinh, String gioiTinh, double diemToan,
			double diemVan, double diemAnh, String hanhKiem, double diemTrungBinh, double diemLy, double diemHoa,
			double diemSinh) {
		super(maHocSinh, hoVaTen, lop, ngaySinh, gioiTinh, diemToan, diemVan, diemAnh, hanhKiem, diemTrungBinh);
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.diemSinh = diemSinh;
	}
	public HocSinhKHTN() {
		super();
	}
	public double getDiemLy() {
		return diemLy;
	}
	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}
	public double getDiemHoa() {
		return diemHoa;
	}
	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}
	public double getDiemSinh() {
		return diemSinh;
	}
	public void setDiemSinh(double diemSinh) {
		this.diemSinh = diemSinh;
	}
	@Override
	public void nhap() {
		Scanner sc=new Scanner(System.in); 
		super.nhap();
		System.out.println("Nhap diem ly: ");
		diemLy=Double.parseDouble(sc.nextLine());
		System.out.println("Nhap diem hoa: ");
		diemHoa=Double.parseDouble(sc.nextLine());
		System.out.println("Nhap diem sinh: ");
		diemSinh=Double.parseDouble(sc.nextLine());
		diemTrungBinh=(diemToan+diemVan+diemAnh+diemLy+diemHoa+diemSinh)/6;
	}
	@Override
	public void hienThi() {
		super.hienThi();
		System.out.println("Diem: Toan: "+diemToan+" Van:"+diemVan+" Anh:"+diemAnh+" Ly:"+diemLy+" Hoa:"+diemHoa+" Sinh:"+diemSinh);
		System.out.println("Diem trung binh: "+diemTrungBinh);
	}
	

}

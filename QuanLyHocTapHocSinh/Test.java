package QuanLyHocTapHocSinh;

import java.io.IOException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		DanhSachHocSinh danhSachHocSinh=new DanhSachHocSinh();
		int chon=0;
		do {
		System.out.println("___CHON CHUC NANG DE QUAN LY HOC TAP HOC SINH___ \n"
				+ "___BAN KHTN___ \n"
				+ "1.Nhap them vao danh sach hoc sinh KHTN \n"
				+ "2.Hien thi danh sach hoc sinh KHTN  \n"
				+ "3.Hien thi danh sach hoc sinh KHTN theo thu tu giam dan diem trung binh \n"
				+ "4.Xoa hoc sinh KHTN theo ma \n"
				+ "5.Tim hoc sinh KHTN theo ma \n"
				+ "6.Sua hoc sinh KHTN \n"
				+ "7.Luu danh sach hoc sinh KHTN xuong file \n"
				+ "8.Doc danh sach hoc sinh KHTN tu file \n"
				+ "___BAN KHXH___ \n"
				+ "9.Nhap them vao danh sach hoc sinh KHXH \n"
				+ "10.Hien thi danh sach hoc sinh KHXH  \n"
				+ "11.Hien thi danh sach hoc sinh KHXH theo thu tu giam dan diem trung binh \n"
				+ "12.Xoa hoc sinh KHXH theo ma \n"
				+ "13.Tim hoc sinh KHXH theo ma \n"
				+ "14.Sua hoc sinh KHXH \n"
				+ "15.Luu danh sach hoc sinh KHXH xuong file \n"
				+ "16.Doc danh sach hoc sinh KHXH tu file \n"
				+ "0.Thoat \n");
		chon=Integer.parseInt(sc.nextLine());
		if(chon==1) {
			danhSachHocSinh.nhapDSHSKHTN();
		}else if(chon==2) {
			danhSachHocSinh.hienThiDanhSachHSKHTN();
		}else if(chon==3) {
			danhSachHocSinh.hienThiDanhSachHocSinhKHTNTheoDiemTBGiam();
		}else if(chon==4) {
			danhSachHocSinh.xoaHSKHTNTheoMa();
		}else if(chon==5) {
			danhSachHocSinh.timKiemHSKHTNTheoMa();
		}else if(chon==6) {
			danhSachHocSinh.suaHSKHTNTheoMa();
		}else if(chon==7) {
			danhSachHocSinh.ghiHocSinhKHXHXuongFile();
		}else if(chon==8) {
			danhSachHocSinh.docHocSinhKHXHtuFile();
		}else if(chon==9) {
			danhSachHocSinh.nhapDSHSKHXH();
		}else if(chon==10) {
			danhSachHocSinh.hienThiDanhSachHSKHXH();
		}else if(chon==11) {
			danhSachHocSinh.hienThiDanhSachHocSinhKHXHTheoDiemTBGiam();
		}else if(chon==12) {
			danhSachHocSinh.xoaHSKHXHTheoMa();
		}else if(chon==13) {
			danhSachHocSinh.timKiemHSKHXHTheoMa();
		}else if(chon==14) {
			danhSachHocSinh.suaHSKHXHTheoMa();
		}else if(chon==15) {
			danhSachHocSinh.ghiHocSinhKHXHXuongFile();
		}else if(chon==16) {
			danhSachHocSinh.docHocSinhKHXHtuFile();
			}
		
		}while(chon!=0);
		
	}
		
}

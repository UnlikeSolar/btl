package QuanLyHocTapHocSinh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachHocSinh implements IQuanLyHocSinh{
	
	ArrayList<HocSinhKHTN> danhSachHSKHTN =new ArrayList<>();
	ArrayList<HocSinhKHXH> danhSachHSKHXH =new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	public void nhapDSHSKHTN() {
		HocSinhKHTN hsKHTN=new HocSinhKHTN();
		hsKHTN.nhap();
		danhSachHSKHTN.add(hsKHTN);
	}
	public void nhapDSHSKHXH() {
		HocSinhKHXH hsKHXH=new HocSinhKHXH();
		hsKHXH.nhap();
		danhSachHSKHXH.add(hsKHXH);
	}
	public void hienThiDanhSachHSKHTN() {
		for (HocSinhKHTN hocSinhKHTN : danhSachHSKHTN) {
			hocSinhKHTN.hienThi();
			System.out.println();
		}
	}
	public void hienThiDanhSachHSKHXH() {
		for (HocSinhKHXH hocSinhKHXH: danhSachHSKHXH) {
			hocSinhKHXH.hienThi();
			System.out.println();
		}
	}
	public void hienThiDanhSachHocSinhKHTNTheoDiemTBGiam() {
		Collections.sort(this.danhSachHSKHTN,new Comparator<HocSinhKHTN>() {

			@Override
			public int compare(HocSinhKHTN o1, HocSinhKHTN o2) {
				if(o1.getDiemTrungBinh()<o2.getDiemTrungBinh()) {
					return 1;
				}else if(o1.getDiemTrungBinh()>o2.getDiemTrungBinh()) {
					return -1;
				}else return 0;
				
			}
		});
		for (HocSinhKHTN hocSinhKHTN : danhSachHSKHTN) {
			hocSinhKHTN.hienThi();
			System.out.println();
		}
	}
	public void hienThiDanhSachHocSinhKHXHTheoDiemTBGiam() {
		Collections.sort(this.danhSachHSKHXH,new Comparator<HocSinhKHXH>() {

			@Override
			public int compare(HocSinhKHXH o1, HocSinhKHXH o2) {
				if(o1.getDiemTrungBinh()<o2.getDiemTrungBinh()) {
					return 1;
				}else if(o1.getDiemTrungBinh()>o2.getDiemTrungBinh()) {
					return -1;
				}else return 0;
				
			}
		});
		for (HocSinhKHXH hocSinhKHXH : danhSachHSKHXH) {
			hocSinhKHXH.hienThi();
			System.out.println();
		}
	}
	
	public void xoaHSKHTNTheoMa() {
		
		System.out.println("Nhap vao ma hoc sinh: ");
		String maSV=sc.nextLine();
		
		for (HocSinhKHTN hocSinhKHTN : danhSachHSKHTN) {
			if(hocSinhKHTN.getMaHocSinh().equals(maSV)) {
				danhSachHSKHTN.remove(hocSinhKHTN);
			}
		}
		System.out.println("Da xoa");
	}
    public void xoaHSKHXHTheoMa() {
		
		System.out.println("Nhap vao ma hoc sinh: ");
		String maSV=sc.nextLine();
		
		for (HocSinhKHXH hocSinhKHXH : danhSachHSKHXH) {
			if(hocSinhKHXH.getMaHocSinh().equals(maSV)) {
				danhSachHSKHXH.remove(hocSinhKHXH);
			}
		}
		System.out.println("Da xoa");
	}
    public void timKiemHSKHTNTheoMa() {
    	System.out.println("Nhap vao ma hoc sinh: ");
		String maSV=sc.nextLine();
		for (HocSinhKHTN hocSinhKHTN : danhSachHSKHTN) {
			if(hocSinhKHTN.getMaHocSinh().equals(maSV)) {
				hocSinhKHTN.hienThi();
				System.out.println();
			}
		}
    }
    public void timKiemHSKHXHTheoMa() {
    	System.out.println("Nhap vao ma hoc sinh: ");
		String maSV=sc.nextLine();
		for (HocSinhKHXH hocSinhKHXH : danhSachHSKHXH) {
			if(hocSinhKHXH.getMaHocSinh().equals(maSV)) {
				hocSinhKHXH.hienThi();
				System.out.println();
			}
		}
    }
    
    public void suaHSKHTNTheoMa() {
    	System.out.println("Nhap vao ma hoc sinh: ");
		String maSV=sc.nextLine();
		for (HocSinhKHTN hocSinhKHTN : danhSachHSKHTN) {
			if(hocSinhKHTN.getMaHocSinh().equals(maSV)) {
				System.out.println("Nhap thong tin moi: ");
				System.out.println("Nhap ma hoc sinh: ");
				String maHocSinh=sc.nextLine(); 
				System.out.println("Nhap ho va ten: ");
				String hoVaTen=sc.nextLine(); 
				System.out.println("Nhap lop: ");
				String lop=sc.nextLine(); 
				System.out.println("Nhap ngay sinh: ");
				String ngaySinh=sc.nextLine();
				System.out.println("Nhap gioi tinh: ");
				String gioiTinh=sc.nextLine(); 
				System.out.println("Nhap hanh kiem: ");
				String hanhKiem=sc.nextLine(); 
				System.out.println("Nhap diem toan: ");
				Double diemToan=Double.parseDouble(sc.nextLine());
				System.out.println("Nhap diem van: ");
				Double diemVan=Double.parseDouble(sc.nextLine()); 
				System.out.println("Nhap diem anh: ");
				Double diemAnh=Double.parseDouble(sc.nextLine());
				System.out.println("Nhap diem ly: ");
				Double diemLy=Double.parseDouble(sc.nextLine());
				System.out.println("Nhap diem hoa: ");
				Double diemHoa=Double.parseDouble(sc.nextLine());
				System.out.println("Nhap diem sinh: ");
				Double diemSinh=Double.parseDouble(sc.nextLine());
				Double diemTrungBinh=(diemToan+diemVan+diemAnh+diemLy+diemHoa+diemSinh)/6;
				hocSinhKHTN.setMaHocSinh(maHocSinh);
				hocSinhKHTN.setHoVaTen(hoVaTen);
				hocSinhKHTN.setLop(lop);
				hocSinhKHTN.setNgaySinh(ngaySinh);
				hocSinhKHTN.setGioiTinh(gioiTinh);
				hocSinhKHTN.setDiemToan(diemToan);
				hocSinhKHTN.setDiemVan(diemVan);
				hocSinhKHTN.setDiemAnh(diemAnh);
				hocSinhKHTN.setDiemLy(diemLy);
				hocSinhKHTN.setDiemHoa(diemHoa);
				hocSinhKHTN.setDiemSinh(diemSinh);
				hocSinhKHTN.setDiemTrungBinh(diemTrungBinh);
				System.out.println("Da sua");
			}
		}
    }
	
    public void suaHSKHXHTheoMa() {
    	System.out.println("Nhap vao ma hoc sinh: ");
		String maSV=sc.nextLine();
		for (HocSinhKHXH hocSinhKHXH : danhSachHSKHXH) {
			if(hocSinhKHXH.getMaHocSinh().equals(maSV)) {
				System.out.println("Nhap thong tin moi: ");
				System.out.println("Nhap ma hoc sinh: ");
				String maHocSinh=sc.nextLine(); 
				System.out.println("Nhap ho va ten: ");
				String hoVaTen=sc.nextLine(); 
				System.out.println("Nhap lop: ");
				String lop=sc.nextLine(); 
				System.out.println("Nhap ngay sinh: ");
				String ngaySinh=sc.nextLine();
				System.out.println("Nhap gioi tinh: ");
				String gioiTinh=sc.nextLine(); 
				System.out.println("Nhap hanh kiem: ");
				String hanhKiem=sc.nextLine(); 
				System.out.println("Nhap diem toan: ");
				Double diemToan=Double.parseDouble(sc.nextLine());
				System.out.println("Nhap diem van: ");
				Double diemVan=Double.parseDouble(sc.nextLine()); 
				System.out.println("Nhap diem anh: ");
				Double diemAnh=Double.parseDouble(sc.nextLine());
				System.out.println("Nhap diem su: ");
				Double diemSu=Double.parseDouble(sc.nextLine());
				System.out.println("Nhap diem dia: ");
				Double diemDia=Double.parseDouble(sc.nextLine());
				System.out.println("Nhap diem GDCD: ");
				Double diemGDCD=Double.parseDouble(sc.nextLine());
				Double diemTrungBinh=(diemToan+diemVan+diemAnh+diemSu+diemDia+diemGDCD)/6;
				hocSinhKHXH.setMaHocSinh(maHocSinh);
				hocSinhKHXH.setHoVaTen(hoVaTen);
				hocSinhKHXH.setLop(lop);
				hocSinhKHXH.setNgaySinh(ngaySinh);
				hocSinhKHXH.setGioiTinh(gioiTinh);
				hocSinhKHXH.setDiemToan(diemToan);
				hocSinhKHXH.setDiemVan(diemVan);
				hocSinhKHXH.setDiemAnh(diemAnh);
				hocSinhKHXH.setDiemSu(diemSu);
				hocSinhKHXH.setDiemDia(diemDia);
				hocSinhKHXH.setDiemGDCD(diemGDCD);
				hocSinhKHXH.setDiemTrungBinh(diemTrungBinh);
				System.out.println("Da sua");
			}
		}
    }
	
	

	@Override
	public void ghiHocSinhKHTNXuongFile() throws IOException {
		System.out.println("Nhap ten file: ");
		String tenFile=sc.nextLine();
		File file=new File(tenFile);
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(danhSachHSKHTN);
		fos.close();
		oos.close();
		System.out.println("Da ghi xuong file");
		
	}

	@Override
	public void docHocSinhKHTNtuFile() throws IOException, ClassNotFoundException {
		System.out.println("Nhap ten file: ");
		String tenFile=sc.nextLine();
		File file=new File(tenFile);
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		danhSachHSKHTN=(ArrayList<HocSinhKHTN>) ois.readObject();
		fis.close();
		ois.close();
		hienThiDanhSachHSKHTN();
	}

	@Override
	public void ghiHocSinhKHXHXuongFile() throws IOException {
		System.out.println("Nhap ten file: ");
		String tenFile=sc.nextLine();
		File file=new File(tenFile);
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(danhSachHSKHXH);
		fos.close();
		oos.close();
		System.out.println("Da ghi xuong file");
		
	}

	@Override
	public void docHocSinhKHXHtuFile() throws ClassNotFoundException, IOException {
		System.out.println("Nhap ten file: ");
		String tenFile=sc.nextLine();
		File file=new File(tenFile);
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		danhSachHSKHXH=(ArrayList<HocSinhKHXH>) ois.readObject();
		fis.close();
		ois.close();
		hienThiDanhSachHSKHTN();
		
	}

}

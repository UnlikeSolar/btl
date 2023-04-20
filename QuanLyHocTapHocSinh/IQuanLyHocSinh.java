package QuanLyHocTapHocSinh;

import java.io.File;
import java.io.IOException;

public interface IQuanLyHocSinh {
	public void ghiHocSinhKHTNXuongFile() throws IOException;
	public void docHocSinhKHTNtuFile() throws IOException, ClassNotFoundException;
	public void ghiHocSinhKHXHXuongFile() throws IOException;
	public void docHocSinhKHXHtuFile() throws ClassNotFoundException, IOException;

}

package structural.compisite.binary_tree.Folder;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // Root
        Folder data = new Folder("Data (D:)", today);

        // Các thư mục chính
        Folder taiLieu = new Folder("TaiLieu", today);
        Folder lapTrinhThietBiDiDong = new Folder("LapTrinhThietBiDiDong", today);

        // Các thư mục con trong TaiLieu
        Folder designPattern = new Folder("Design Pattern", today);
        Folder lapTrinhJava = new Folder("Lap Trinh Java", today);

        // Các file trong Design Pattern
        FileItem creationalPattern = new FileItem("CreationalPattern.pptx", today);
        FileItem structuralPattern = new FileItem("StructuralPattern.pptx", today);

        // Các file trong Lap Trinh Java
        FileItem javaCoBan = new FileItem("LapTrinhJavaCoBan.docx", today);
        FileItem javaNangCao = new FileItem("LapTrinhJavaNangCao.pdf", today);

        // File trong TaiLieu
        FileItem ngonNguC = new FileItem("NgonNguLapTrinhC.pdf", today);

        // Các file trong LapTrinhThietBiDiDong
        FileItem coBan = new FileItem("CoBan.pptx", today);
        FileItem nangCao = new FileItem("NangCao.pptx", today);

        // Ghép cây thư mục
        designPattern.addItem(creationalPattern);
        designPattern.addItem(structuralPattern);

        lapTrinhJava.addItem(javaCoBan);
        lapTrinhJava.addItem(javaNangCao);

        taiLieu.addItem(designPattern);
        taiLieu.addItem(lapTrinhJava);
        taiLieu.addItem(ngonNguC);

        lapTrinhThietBiDiDong.addItem(coBan);
        lapTrinhThietBiDiDong.addItem(nangCao);

        data.addItem(taiLieu);
        data.addItem(lapTrinhThietBiDiDong);

        // In cây thư mục
        System.out.println("===== CÂY THƯ MỤC =====");
        System.out.println(data.getStringTreeFolder());

        // In đường dẫn mẫu
        System.out.println("\n===== ĐƯỜNG DẪN =====");
        System.out.println(creationalPattern.getPath());
        System.out.println(javaNangCao.getPath());
        System.out.println(lapTrinhJava.getPath());

        // Demo xóa 1 file
        System.out.println("\n===== XÓA FILE StructuralPattern.pptx =====");
        designPattern.removeItem(structuralPattern);
        System.out.println(data.getStringTreeFolder());
    }
}

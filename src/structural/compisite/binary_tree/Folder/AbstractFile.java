package structural.compisite.binary_tree.Folder;

import java.time.LocalDate;

public abstract class AbstractFile {
    protected String name;
    protected LocalDate createdDate;
    protected Folder parent;

    public AbstractFile(String name, LocalDate createdDate) {
        this.name = name;
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public Folder getParent() {
        return parent;
    }

    public void setParent(Folder parent) {
        this.parent = parent;
    }

    // Trả về chuỗi cây thư mục
    public abstract String getStringTreeFolder();

    // Hàm hỗ trợ để thụt lề khi in cây
    protected abstract String getStringTreeFolder(String prefix);

    // Trả về đường dẫn đầy đủ
    public String getPath() {
        if (parent == null) {
            return name;
        }
        return parent.getPath() + "/" + name;
    }

    // Chỉ Folder mới thực sự hỗ trợ add/remove
    public void addItem(AbstractFile item) {
        throw new UnsupportedOperationException("Không thể thêm vào file.");
    }

    public void removeItem(AbstractFile item) {
        throw new UnsupportedOperationException("Không thể xóa khỏi file.");
    }
}
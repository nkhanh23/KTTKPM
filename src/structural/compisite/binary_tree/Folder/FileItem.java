package structural.compisite.binary_tree.Folder;

import java.time.LocalDate;

public class FileItem extends AbstractFile {

    public FileItem(String name, LocalDate createdDate) {
        super(name, createdDate);
    }

    @Override
    public String getStringTreeFolder() {
        return getStringTreeFolder("");
    }

    @Override
    protected String getStringTreeFolder(String prefix) {
        return prefix + name;
    }
}

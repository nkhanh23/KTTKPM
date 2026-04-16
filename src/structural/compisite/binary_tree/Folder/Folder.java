package structural.compisite.binary_tree.Folder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile {
    private List<AbstractFile> children = new ArrayList<>();

    public Folder(String name, LocalDate createdDate) {
        super(name, createdDate);
    }

    @Override
    public void addItem(AbstractFile item) {
        if (item == null) return;

        children.add(item);
        item.setParent(this);
    }

    @Override
    public void removeItem(AbstractFile item) {
        if (item == null) return;

        if (children.remove(item)) {
            item.setParent(null);
        }
    }

    public List<AbstractFile> getChildren() {
        return children;
    }

    @Override
    public String getStringTreeFolder() {
        return getStringTreeFolder("");
    }

    @Override
    protected String getStringTreeFolder(String prefix) {
        StringBuilder builder = new StringBuilder();
        builder.append(prefix).append(name);

        for (AbstractFile child : children) {
            builder.append("\n")
                    .append(child.getStringTreeFolder(prefix + "   "));
        }

        return builder.toString();
    }
}

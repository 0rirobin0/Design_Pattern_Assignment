import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private int totalSize;
    private List<FileSystemComponent> children;

    public Directory() {
        this.totalSize = 0;
        children = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent component){
        children.add(component);
    }

    @Override
    public int size() {
        int size = 0;
        for (FileSystemComponent component : children) {
            size += component.size();
        }
        totalSize = size;
        return totalSize;
    }
}

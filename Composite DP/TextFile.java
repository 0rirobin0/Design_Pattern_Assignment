public class TextFile implements FileSystemComponent {
    private int fileSize;

    public TextFile(int fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public int size() {
        return fileSize;
    }
}

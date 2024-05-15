public class ImageFile implements FileSystemComponent {
    private int fileSize;

    public ImageFile(int fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public int size() {
        return fileSize;
    }
}

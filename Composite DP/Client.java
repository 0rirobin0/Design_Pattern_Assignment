public class Client {
    public static void main(String[] args) {
        TextFile file1 = new TextFile(18);
        ImageFile file2 = new ImageFile(76);
        TextFile file3 = new TextFile(78);

        Directory directory1 = new Directory();
        Directory rootDirectory = new Directory();

        rootDirectory.addComponent(directory1);
        rootDirectory.addComponent(file1);
        rootDirectory.addComponent(file2);
        directory1.addComponent(file3);

        System.out.println("Total size of the root directory: " + rootDirectory.size() + " KB");
    }
}

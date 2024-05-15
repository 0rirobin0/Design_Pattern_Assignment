public class Powershell implements Terminal {

    @Override
    public void runCommand(String command, String user) {
        System.out.println(command + " run as " + user + " successfully");
    }
}

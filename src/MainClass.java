public class MainClass {

    public static void main(String args[]) {
        ClientSideClass clientSide = new ClientSideClass();
        ServerSideClass serverSide = new ServerSideClass();
        serverSide.go();
        clientSide.setupNetworking();
        }
}

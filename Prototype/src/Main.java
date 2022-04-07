public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("GRSGS","Dorel");
        Tramvai tramvai = new Tramvai("GAFHAD","Marcel");
        try {
            MijlocTransport autobuz1 = autobuz.copiaza();
            MijlocTransport tramvai1 = tramvai.copiaza();
            System.out.println("Original: "+autobuz);
            System.out.println("Original: "+tramvai);

            System.out.println("Original: "+autobuz1);
            System.out.println("Original: "+tramvai1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}

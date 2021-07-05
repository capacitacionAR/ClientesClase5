public class Programa {
    public static void main(String[] args) {
        Cliente cl1 = null;
        Cliente cl2 = new ClienteLocal(1,"juan", "36637373",22);
        Cliente cl3 = new ClienteInternet(2,"Santiago", "83992773", "sant@asdf.com");

        //System.out.println(cl1.toString());
        System.out.println(cl2.toString());
        System.out.println(cl3.toString());

        Cliente[]v = new Cliente[2];
        //v[0] = cl1;
        v[0] = cl2;
        v[1] = cl3;

        System.out.println("Desde el vector");

        for (Cliente c: v) {
            if (c instanceof ClienteInternet){
                System.out.println("Este es de internet: ");
                ClienteInternet ci = (ClienteInternet) c;
                System.out.println(ci.getEmail());
            }
            else {
                System.out.println("Este no: ");
            }
            c.mostrar();
            System.out.println(c.toString());
        }

    }
}

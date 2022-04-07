package Main;

import Builder.Autobuz;
import Builder.AutobuzBuilder;
import Builder.AutobuzBuilderV2;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz;
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder()
                .setNew(true).setNumeSofer("GIGEL").setOpresteCapatLinie(false)
                .setNrInmatriculare("RGSAGRASG").setTextAfisat("iesi");
        autobuz = autobuzBuilder.build();
        Autobuz autobuz1 = new AutobuzBuilder().setNew(true).setNumeSofer("NU").build();
        System.out.println(autobuz1.toString());
        System.out.println(autobuz.toString());
        Autobuz a1 = new AutobuzBuilder().setOpresteCapatLinie(true)
                .setDeschideUsile(true).setTextAfisat("La multi ani").build();
        AutobuzBuilderV2 autobuzBuilderV2 = new AutobuzBuilderV2();
        Autobuz autobuz2 = autobuzBuilderV2.setModel("salut").setNrLinie(132).build();
        Autobuz autobuz3 = autobuzBuilderV2.build();
        System.out.println(autobuz2);
        System.out.println(autobuz3);
    }
}

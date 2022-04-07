package Main;

import Facade.Autbouz;
import Facade.AutobuzFacade;

public class Main {
    public static void main(String[] args) {
        AutobuzFacade autobuzFacade = new AutobuzFacade(new Autbouz());
        autobuzFacade.deschideUsa();
        autobuzFacade.liberUsa();
    }
}

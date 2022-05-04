package mementoClasses;

import java.util.ArrayList;
import java.util.List;

public class MementoManager {
    List<AutobuzMemento> list;

    public MementoManager() {
        list = new ArrayList<>();
    }

    public void addMemento(AutobuzMemento autobuzMemento){
        list.add(autobuzMemento);
    }
    public AutobuzMemento getMemento(int index){
        return list.get(index);
    }
}
//Map pe data cel mai folosit
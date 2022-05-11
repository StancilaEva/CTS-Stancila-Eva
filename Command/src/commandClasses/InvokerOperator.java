package commandClasses;

import java.util.ArrayList;
import java.util.List;

public class InvokerOperator {
    private List<Comanda> listaComenzi;

    public InvokerOperator() {
        listaComenzi = new ArrayList<>();
    }

    public void addComanda(Comanda comanda){
        listaComenzi.add(comanda);
    }

    public void executaComanda(){
        if(listaComenzi.size()==0){
            System.out.println("Nu ai voie");
        }
        else
        {
            Comanda comanda = listaComenzi.remove(0);
            comanda.executa();
        }
    }

}

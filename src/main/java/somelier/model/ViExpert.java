package somelier.model;

import java.util.ArrayList;
import java.util.List;

public class ViExpert {

    ArrayList<Vins> llistaVins = new ArrayList<>();

    public void afegirVins (Vins vins) {
        llistaVins.add(vins);
    }
    //Miguel Urdaneta

    public List<String> obtenerMarcas (String tipoVinos){
        List <String> marca = new ArrayList<>();
        for (Vins v: llistaVins){
            if(v.getTipus().equals(tipoVinos)){
                marca.add(v.getMarca());
            }
        }
        return marca;
    }


}

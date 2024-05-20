package dao;

import java.util.ArrayList;


public class OdontologoH2DAO implements IDAO<Odontologo> {

    @Override
    public ArrayList<Odontologo> listar() {
        // Connector DB & logic
        ArrayList<Odontologo> lista = new ArrayList<>();
        return lista;
    }

    @Override
    public String guardar(Odontologo _item) {
        // Connector DB & logic
        return "Odontologo guardado en H2";
    }
}

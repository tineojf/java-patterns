package dao;

import java.util.ArrayList;

public class OdontologoEnMemoriaDAO implements IDAO<Odontologo> {
    private final ArrayList<Odontologo> odontologos;

    public OdontologoEnMemoriaDAO() {
        this.odontologos = new ArrayList<>();
    }

    @Override
    public String guardar(Odontologo odontologo) {
        odontologos.add(odontologo);
        return "Odontologo guardado en memoria";
    }

    @Override
    public ArrayList<Odontologo> listar() {
        return odontologos;
    }
}

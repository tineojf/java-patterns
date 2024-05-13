package flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private final HashMap<String, FlyweightArbol> cache;

    public FlyweightFactory() {
        this.cache = new HashMap<>();
    }

    public FlyweightArbol getArbol(String key) {
        FlyweightArbol result = cache.get(key);

        if (result == null) {
            switch (key) {
                case "verde":
                    result = new FlyweightArbol("Ornamental", 200, 400, "verde");
                    this.cache.put(key, result);
                    System.out.println("Creando nuevo");
                case "rojo":
                    result = new FlyweightArbol("Frutales", 500, 300, "rojo");
                    this.cache.put(key, result);
                    System.out.println("Creando nuevo");
                    break;
                case "celeste":
                    result = new FlyweightArbol("Florales", 100, 200, "celeste");
                    this.cache.put(key, result);
                    System.out.println("Creando nuevo");
                    break;
                default:
                    System.out.println("Key not defined. (rojo, verde, celeste)");
                    return null;
            }
        }
        return result;
    }
}

package co.com.accenture.despegar.models;

import java.util.Map;

public class DatosPrueba {
    private static Map<String, Object> map;

    private DatosPrueba() {
    }

    public static Map<String, Object> getMap() {
        return map;
    }

    public static void setMap(Map<String, Object> datosPrueba) {
        map = datosPrueba;
    }

    public static String obtener(String datoObtener) {
        return (String) getMap().get(datoObtener);
    }
}

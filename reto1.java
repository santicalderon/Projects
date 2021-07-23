public class reto1 {
    public static String compararFranquicia(int pTiempo, int pCapital, double pInteres){
        double interesSimple = pCapital*pInteres*pTiempo;
        double interesCompuesto = pCapital*(Math.pow(1+pInteres, pTiempo)-1); 
        double diferencia = interesCompuesto - interesSimple;
        String texto = ("La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + diferencia);        
        String faltanDatos = ("Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.");
        if (diferencia == 0) {
            return faltanDatos;
        }
        return texto;
    }
}
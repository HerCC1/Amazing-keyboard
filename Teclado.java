public class Teclado
{
    private int tamanoEnPorcentaje;
    private String idioma;
    private Switch tipoSwitch;
    
    
    public Teclado(int tamanoTeclado, String lenguaje, String switchTeclado){
        tamanoEnPorcentaje = tamanoTeclado;
        idioma = lenguaje;
        tipoSwitch = new Switch(switchTeclado);
    }
    
    public int getTamanoTeclado() {
        return tamanoEnPorcentaje;
    }
    
    public String getIdioma() {
        return idioma;
    }
    
    public Switch getTipoSwitch() {
        return tipoSwitch;
    }
    
    public void setTamano(int nuevoTamano){
        tamanoEnPorcentaje = nuevoTamano;
    }
    
    public void setIdioma(String cambioIdioma){
        idioma = cambioIdioma;
    }
    
    public void setTipoSwitch(String nuevoSwitch){
        tipoSwitch = new Switch(nuevoSwitch);
    }
}

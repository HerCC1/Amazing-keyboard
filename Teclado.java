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
    
    public void setTamano(int nuevo_tamano){
        tamanoEnPorcentaje = nuevo_tamano;
    }
    
    public void setIdioma(String cambio_idioma){
        idioma = cambio_idioma;
    }
    
    public void setTipoSwitch(String nuevo_Switch){
        tipoSwitch = new Switch(nuevo_Switch);
    }
}

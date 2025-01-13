public class Switch {
    private int pulsaciones;
    private String tipoSwitch;
    
    public Switch(String switchTeclado){
        pulsaciones = 7000000;
        tipoSwitch = switchTeclado;        
    }
    
    public void setPulsaciones(int maxPulsaciones){
        pulsaciones = maxPulsaciones;
    }
    
    public void setTipoSwitch(String nuevoTipoSwitch){
        tipoSwitch = nuevoTipoSwitch;
    }
    
    public String getSwitch(){
        return tipoSwitch;
    }
    
    public int getNumeroPulsaciones() {
        return pulsaciones;
    }
}

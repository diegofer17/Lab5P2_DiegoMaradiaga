package lab5p2_diegomaradiaga;

public class Personaje {
    String Nombre, Debilidad, Universo, Poder;
    int AgilidadF, Fuerza, AgilidadM, HP;

    public Personaje() {
    }

    public Personaje(String Nombre, String Debilidad, String Universo, String Poder, int AgilidadF, int Fuerza, int AgilidadM, int HP) {
        this.Nombre = Nombre;
        this.Debilidad = Debilidad;
        this.Universo = Universo;
        this.Poder = Poder;
        this.AgilidadF = AgilidadF;
        this.Fuerza = Fuerza;
        this.AgilidadM = AgilidadM;
        this.HP = HP;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDebilidad() {
        return Debilidad;
    }

    public void setDebilidad(String Debilidad) {
        this.Debilidad = Debilidad;
    }

    public String getUniverso() {
        return Universo;
    }

    public void setUniverso(String Universo) {
        this.Universo = Universo;
    }

    public String getPoder() {
        return Poder;
    }

    public void setPoder(String Poder) {
        this.Poder = Poder;
    }

    public int getAgilidadF() {
        return AgilidadF;
    }

    public void setAgilidadF(int AgilidadF) {
        this.AgilidadF = AgilidadF;
    }

    public int getFuerza() {
        return Fuerza;
    }

    public void setFuerza(int Fuerza) {
        this.Fuerza = Fuerza;
    }

    public int getAgilidadM() {
        return AgilidadM;
    }

    public void setAgilidadM(int AgilidadM) {
        this.AgilidadM = AgilidadM;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    

    @Override
    
    public String toString() {
        return Nombre;
    }
    
    public String toStringN() {
        return "Poder -> "+Poder+"\n"
                + " Fuerza -> "+Fuerza+"\n"
                + " Habilidad -> "+AgilidadF+"\n"
                + " Mental -> "+AgilidadM+"\n"
                + " Puntos de vida -> "+HP;
    }
}

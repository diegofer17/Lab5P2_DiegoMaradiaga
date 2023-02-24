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
        return "Poder -> "+Poder+"\n"
                + "Fuerza -> "+Fuerza+"\n"
                + "Habilidad -> "+AgilidadF+"\n"
                + "Mental -> "+AgilidadM+"\n"
                + "Puntos de vida -> "+HP;
    }
    
    public String toStringN() {
        return Nombre;
    }
}

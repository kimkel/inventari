package inventari2;

/**
 *
 * @author DAW
 */
public class Maquina {
    public static final int MAQUINA_REAL = 1;
    public static final int MAQUINA_VIRTUAL = 2;
    
    private String nom;
    private String ip;
    private int tipus;

    /**
     * Constructor
     * @param nom
     * @param tipus 
     */
    public Maquina(String nom, int tipus) {
        this.nom = nom;
        this.tipus = tipus;
    }

    public Maquina(String nom, String ip, int tipus) {
        this.nom = nom;
        this.ip = ip;
        this.tipus = tipus;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getTipus() {
        return tipus;
    }

    public void setTipus(int tipus) {
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Maquina{" + "nom=" + nom + ", ip=" + ip + ", tipus=" + tipus + '}';
    }
    
    
}

package Pb1;

/**
 * Clasa derivata Copiator din clasa de baza Echipament
 */
public class Copiator extends Echipament {

    private int p_ton;
    private Format format;

    /**
     * Constructor cu urmatorii parametrii
     * @param nume
     * @param nr_inv
     * @param pret
     * @param zona_mag
     * @param situatie
     * @param p_ton
     * @param format
     */
    public Copiator(String nume, int nr_inv, int pret, String zona_mag,
                    Situatii situatie, int p_ton, Format format) {
        super(nume, nr_inv, pret, zona_mag, situatie);
        this.p_ton = p_ton;
        this.format = format;
    }

    public int getP_ton() {
        return p_ton;
    }

    public void setP_ton(int p_ton) {
        this.p_ton = p_ton;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = Format.valueOf(format);
    }

    @Override
    public String toString() {
        return super.toString()+"Copiator, " +
                "p_ton=" + p_ton +
                ", format=" + format +
                ' ';
    }
}

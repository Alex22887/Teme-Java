    package Pb1;


    import java.io.Serializable;

    /**
     * Clasa de baza in programul nostru care include Serializable
     */
    public class Echipament implements Serializable {

        private String nume;
        private int nr_inv;
        private int pret;
        private String zona_mag;
        private Situatii situatie;

        /**
         * Constructor cu urm parametrii
         * @param nume
         * @param nr_inv
         * @param pret
         * @param zona_mag
         * @param situatie
         */
        public Echipament(String nume, int nr_inv, int pret, String zona_mag, Situatii situatie) {
            this.nume = nume;
            this.nr_inv = nr_inv;
            this.pret = pret;
            this.zona_mag = zona_mag;
            this.situatie = situatie;
        }



        public String getNume() {
            return nume;
        }

        public void setNume(String nume) {
            this.nume = nume;
        }

        public int getNr_inv() {
            return nr_inv;
        }

        public void setNr_inv(int nr_inv) {
            this.nr_inv = nr_inv;
        }

        public int getPret() {
            return pret;
        }

        public void setPret(int pret) {
            this.pret = pret;
        }

        public String getZona_mag() {
            return zona_mag;
        }

        public void setZona_mag(String zona_mag) {
            this.zona_mag = zona_mag;
        }

        public Situatii getSituatie() {
            return situatie;
        }

        public void setSituatie(String situatie) {
            this.situatie = Situatii.valueOf(situatie);
        }


        @Override
        public String toString() {
            return "nume='" + nume + '\'' +
                    ", nr_inv=" + nr_inv +
                    ", pret=" + pret +
                    ", zona_mag='" + zona_mag + '\'' +
                    ", situatie=" + situatie +
                    ", ";
        }
    }

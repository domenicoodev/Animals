package Animali;

public class Criceto {
    private String nome;
    private int anniUmani;
    private int mesiUmani;

    public Criceto(String nome, int anniUmani, int mesiUmani) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Il criceto deve avere un nome!");
        }
        // Un criceto vive raramente oltre i 3-4 anni
        if (anniUmani < 0 || anniUmani > 5 || mesiUmani < 0 || mesiUmani > 11
                || (anniUmani == 0 && mesiUmani == 0)) {
            throw new IllegalArgumentException("Età del criceto non corretta!");
        }
        this.nome = nome;
        this.anniUmani = anniUmani;
        this.mesiUmani = mesiUmani;
    }

    public String getNome() {
        return nome;
    }

    public int[] calcoloEtà() {
        int anniRis = 0;
        int mesiRis = 0;

        // Trasformiamo tutto in mesi totali del criceto per facilitare il calcolo
        int mesiTotaliCriceto = (anniUmani * 12) + mesiUmani;

        if (mesiTotaliCriceto <= 1) {
            // Un criceto di un mese è già un adolescente (circa 12 anni umani)
            anniRis = 12 * mesiTotaliCriceto;
        } else {
            // Base di 12 anni per il primo mese + 4 anni umani per ogni mese successivo
            int mesiExtra = mesiTotaliCriceto - 1;
            anniRis = 12 + (mesiExtra * 4);
        }

        // In questo caso mesiRis rimarrà quasi sempre 0 perché il calcolo 
        // del criceto è talmente veloce che si conta direttamente in anni umani.
        // Ma per coerenza con la classe Età, lo gestiamo così.

        return new int[]{anniRis, mesiRis};
    }
}
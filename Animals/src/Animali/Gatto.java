package Animali;

public class Gatto extends AnimaleAstratto {

    private String nome;
    private int anniUmani;
    private int mesiUmani;

    public Gatto(String nome, int anniUmani, int mesiUmani) {
        super(nome);
        if (anniUmani < 0 || anniUmani > 25 || mesiUmani < 0 || mesiUmani > 11
                || (anniUmani == 0 && mesiUmani == 0)) {
            throw new IllegalArgumentException("Inserisci un'età valida per il gatto!");
        }

        this.nome = nome;
        this.anniUmani = anniUmani;
        this.mesiUmani = mesiUmani;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public Età etàAnimale() {
        int anniRis = 0;
        int mesiRis = 0;

        if (anniUmani < 1) {
            // Primo anno: ogni mese "vale" 15/12 di anno (ovvero 15 mesi umani)
            mesiRis = mesiUmani * 15;
        } else if (anniUmani == 1) {
            // Secondo anno: base 15 anni + 9 mesi umani per ogni mese gatto
            anniRis = 15;
            mesiRis = mesiUmani * 9;
        } else {
            // Dai 2 anni in su: base 24 anni + 4 mesi umani per ogni mese gatto
            anniRis = 24 + ((anniUmani - 2) * 4);
            mesiRis = mesiUmani * 4;
        }

        // Normalizzazione (trasformiamo i mesi in eccesso in anni)
        anniRis += mesiRis / 12;
        mesiRis = mesiRis % 12;

        return new Età(anniRis, mesiRis);
    }

    @Override
    public Gatto clone() {
        Gatto g = (Gatto) super.clone();
        g.nome = new String(nome); //IMPORTANTE PER NON CREARE ALIASING
        return g;
    }
}
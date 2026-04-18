package Animali;

public class Cane implements Animale {
    private String nome;
    private int anniUmani;
    private int mesiUmani;
    private String taglia;

    public Cane(String nome, int anniUmani, int mesiUmani, String taglia) {
        if (nome == null || nome.isEmpty() || anniUmani < 0 || anniUmani > 40
                || anniUmani == 0 && mesiUmani == 0 || mesiUmani < 0 || mesiUmani > 12
                || taglia == null || taglia.isEmpty() ||
                !taglia.equals("piccola") && !taglia.equals("media") && !taglia.equals("grande")) {
            throw new IllegalArgumentException("Dati del cane inseriti non corretti!");
        }
        this.nome = nome;
        this.anniUmani = anniUmani;
        this.mesiUmani = mesiUmani;
        this.taglia = taglia;
    }

    public String getTaglia() {return taglia;}

    @Override
    public String getNome() {return nome;}

    @Override
        public Età etàAnimale() {
        int anniRis = 0;
        int mesiRis = 0;
        int moltiplicatore;

        // Determiniamo il moltiplicatore
        switch (taglia.toLowerCase()) {
            case "piccola": moltiplicatore = 4; break;
            case "media":   moltiplicatore = 5; break;
            case "grande":  moltiplicatore = 7; break;
            default:        moltiplicatore = 5;
        }

        if (anniUmani < 1) {
            mesiRis = mesiUmani * 15;
        } else if (anniUmani == 1) {
            anniRis = 15;
            mesiRis = mesiUmani * 9;
        } else {
            anniRis = 24 + ((anniUmani - 2) * moltiplicatore);
            mesiRis = mesiUmani * moltiplicatore;
        }

        // Normalizzazione
        anniRis += mesiRis / 12;
        mesiRis = mesiRis % 12;

        return new Età(anniRis, mesiRis);
    }
}
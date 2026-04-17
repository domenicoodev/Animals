package Animali;

public class Cane implements Animale {
    private String nome;
    private int anni;
    private String taglia;

    public Cane(String nome, int anni, String taglia) {
        if (nome == null || nome.isEmpty() || anni <= 0 || anni > 40
                || taglia == null || taglia.isEmpty() ||
                !taglia.equals("piccola") && !taglia.equals("media") && !taglia.equals("grande")) {
            throw new IllegalArgumentException("Dati del cane inseriti non corretti!");
        }
        this.nome = nome;
        this.anni = anni;
        this.taglia = taglia;
    }


    public int getAnni() {return anni;}
    public String getTaglia() {return taglia;}

    @Override
    public String getNome() {return nome;}

    @Override
    public int anniAnimale() {
        int età = 0;
        if(anni == 1) {età = 15;}
        else if(anni == 2){età = 24;}
        else{
            if(taglia.equals("piccola")){età = 24 + ((anni - 2)*4);}
            else if(taglia.equals("media")){età = 24 + ((anni - 2)*5);}
            else if(taglia.equals("grande")){età = 24 + ((anni - 2)*7);}
        }
        return età;
    }
}

package Animali;

public class Gatto implements Animale{

    private String nome;
    private int anni;

    public Gatto(String nome, int anni){
        if(nome == null || nome.isEmpty()){
            System.out.println("Inserisci un nome valido per il gatto!");
        }
        if(anni <= 0 || anni > 25){
            System.out.println("Inserisci un'età valida per il gatto!");
        }
        this.nome = nome;
        this.anni = anni;
    }

    public int getAnni(){ return anni; }
    @Override
    public String getNome(){ return nome; }

    /*
    Il primo anno di vita di un gatto equivale a circa 15 anni umani.

    Il secondo anno di vita equivale a altri 9 anni umani (un gatto di 2 anni ne ha quindi circa 24).

    Dal terzo anno in poi ogni anno felino aggiunge circa 4 anni umani.
     */

    @Override
    public int anniAnimale() {
        if(anni == 1){return 15;}
        else if(anni == 2){return 24;}
        else{
            return 24 + ((anni - 2) * 4);
        }
    }
}

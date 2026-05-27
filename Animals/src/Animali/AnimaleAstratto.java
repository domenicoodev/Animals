package Animali;

public class AnimaleAstratto implements Animale, Cloneable {
    private String nome;

    public AnimaleAstratto(String nome){
        if(nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome non valido!");
        }
        this.nome=nome;
    }

    @Override
    public String getNome(){return nome;}

    @Override
    public Età etàAnimale(){
        return null;
    }

    @Override
    public AnimaleAstratto clone() {

        try {
            return (AnimaleAstratto) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new Error(e);
        }
    }
}

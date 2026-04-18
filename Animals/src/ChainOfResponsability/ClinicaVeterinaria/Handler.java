package ChainOfResponsability.ClinicaVeterinaria;

public interface Handler {
    boolean handle(Infortunato animale);
    Handler setNext(Handler next);
}
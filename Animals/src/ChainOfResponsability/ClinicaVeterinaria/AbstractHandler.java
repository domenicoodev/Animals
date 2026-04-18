package ChainOfResponsability.ClinicaVeterinaria;

public abstract class AbstractHandler implements Handler {
    private Handler next;

    @Override
    public Handler setNext(Handler next)
    {
        this.next = next;
        return next;
    }

    @Override
    public boolean handle(Infortunato animale)
    {
        if(next != null) return next.handle(animale);
        return false;
    }
}

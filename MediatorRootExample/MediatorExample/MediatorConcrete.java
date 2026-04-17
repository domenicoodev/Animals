package MediatorExample;
import MediatorExample.Interface.Mediator;
import javax.swing.*;
import java.text.MessageFormat;

public class MediatorConcrete implements Mediator{

private JTextField nome;
private JTextField cognome;
private JButton salva;

public void setNome(JTextField c){
this.nome = c;
}

public void setCognome(JTextField c){
this.cognome = c;
}

public void setSave(JButton c){
this.salva = c;
}


@Override
public void notify(JComponent c){
if(c == nome || c == cognome){
salva.setEnabled(controlla());
}

else if(c == salva)
{
String msg = MessageFormat.format("Nome: {0} \n Cognome: {1}",nome.getText(),cognome.getText());
JOptionPane.showMessageDialog(null,msg);
}

}



private boolean controlla(){
return !nome.getText().strip().isEmpty()  && !cognome.getText().strip().isEmpty();
}

}

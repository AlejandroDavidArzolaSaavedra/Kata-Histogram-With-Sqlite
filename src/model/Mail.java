package model;

public class Mail {
    private final String mail;
    public Mail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "mail=" + mail;
    }
    
    public String getDomain() {
        String resultado = "";
        boolean bandera = false;
        for(int i = 0;i<mail.length();i++){
            Character caracter = mail.charAt(i);
            if (bandera)
                resultado += caracter;
            if(caracter.compareTo('@') == 0)
                bandera = true;
        }
        return resultado;
    }
}

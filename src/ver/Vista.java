package ver;

import model.Entrada;

public class Vista {
    public static void main(String[] args) {
        Entrada entrada1=new Entrada(true);
        Entrada entrada2=new Entrada(false);
        
        entrada1.putSaldo(6000);
        System.out.println(entrada1.getSaldo());
        entrada2.putSaldo(6000);        
        System.out.println(entrada2.getSaldo());
    }
    
}

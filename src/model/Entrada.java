package model;

public class Entrada {
  private int saldo ;
  public static final int LIMITE=5000;
  private boolean tiene_limite;

  public Entrada(boolean limite ) {
      super();
      saldo=0;
      tiene_limite=limite;


  }

  public int getSaldo(){///Traer dato 
   return saldo;

  }
  
  public String putSaldo (int valor){
    
    if (saldo + valor > LIMITE && tiene_limite){
        return "no se puede guardar";
    }
    saldo += valor;
    return "se guardo "+saldo;

  }

}

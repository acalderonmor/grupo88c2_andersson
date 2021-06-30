public class App {
    

    public static void main(String[] args) {
        int MAX_I =20 , MAX_J=10 ;
        loops:
        for (int i = 0; i < MAX_I; i++) {
            System.out.print(MAX_I);
            for (int j = 0; j < MAX_J; j++) {
                
                break loops;
            }
        }
           
          
    }
}

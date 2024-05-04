
package functionsmethods1;
//A function returns something and a method returns nothing

public class FunctionsMethods1 {
  
    public static void main(String[] args) {
     /*
       Create a function that returns the sum of one to the number passed by the included parameter.
        Ex.: 5 --> 1 + 2 + 3 + 4 + 5
     */
        //Ejercicio 1 main
        int n1 = 5;
        sumaIN (n1);
        
        int res = sumaIN (n1);//definir una llamada llamada (paso el valor)
        System.out.println(res);
        System.out.println("---------------------------");
        
        //Ejercicio 2 main.
        {for (int i = 0; i < 10; i++) {
            System.out.println(generateRandomNumber(1,10)); }
        System.out.println("---------------------------");
        //Ejercicio 3 main
        {
               pairsBetween (1,10);}
        System.out.println("---------------------------");

        System.out.println(generatePassword(8));
        
        
        
        System.out.println("---------------------------");
    
        }
        
        
        
    }
    
    public static int sumaIN (int n){//definir un método (paso el tipo)
    int suma = 0;
    for (int i = 1; i <= n; i++) {
            suma += i;//i porque n es siempre el mismo valor, i es la que toma la suma
            
        }
    return suma;
    }
    /*
    Create a function that generates a random number between two
    numbers passed by parameter.
    */
    
       public static int generateRandomNumber (int minimo, int maximo) {
        return (int) (Math.random()* (maximo - minimo + 1)+ (minimo));
    }
    /*
    Create a function that shows all pairs between those two numbers after passing two numbers.
    */
    public static void pairsBetween (int init, int fin){//mostrame esto = void
        if (init > fin) {
            int aux = init;
            init = fin;
            fin = aux;// Por si ponen un inicial mayor al final
        }
        
        
        for (int b = init; b <= fin; b++) {
            if (b % 2 == 0) {
                System.out.println(b);
            }
            
        }
    
    }
    /*
    Create a function that generates a random password with uppercase and lowercase letters and numbers.
    Pass the length of the password as a parameter.
  
    */
    public static int generateRandomNumber2 (int min, int max) {
        return (int) (Math.random()* (max - min + 1)+ (min));
    }
    public static char generateRandomCapitalLetter () {
        return (char) generateRandomNumber2 (65,90);
    } 
 public static char generateRandomLowercaseLetter () {
     return (char) generateRandomNumber2 (97,122);
    }
 public static String generatePassword (int lenght) {
     String password = "";
     
     int choose;
     for (int i = 0; i < lenght; i++) {
     
            choose = generateRandomNumber2 (1,3);
            switch (choose) {
                case 1://number
                    password += generateRandomNumber2 (0,9);
                    break;
                case 2://capital letter
                    password += generateRandomCapitalLetter ();
                    break;
                case 3://lowercase letter
                    password += generateRandomLowercaseLetter();
                    break;
                
            }
            
     }
     return password;
 
 }  
    
    
}


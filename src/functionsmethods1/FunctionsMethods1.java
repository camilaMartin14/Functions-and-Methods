package functionsmethods1;

//A function returns something and a method returns nothing
public class FunctionsMethods1 {
  
    public static void main(String[] args) {
     /*
       Create a function that returns the sum of one to the number passed 
        by the included parameter.
        Ex.: 5 --> 1 + 2 + 3 + 4 + 5
     */
        //Ejercicio 1 main
        int number = 5;
        int resultSum = sumaIN (number);//definir una llamada (paso el valor)
        
        System.out.println(resultSum);
        System.out.println("---------------------------");
        
        //Ejercicio 2 main.
        for (int i = 0; i < 10; i++) {
            System.out.println(generateRandomNumber(1,10)); 
        }
        
        System.out.println("---------------------------");
        
        //Ejercicio 3 main
        pairsBetween (1,10);
        System.out.println("---------------------------");

        //Ejercicio 4 main
        System.out.println(generatePassword(8));
        System.out.println("---------------------------");
    }
    
    public static int sumaIN(int number) { //pasar tipo
        int suma = 0;
        
        for (int i = 1; i <= number; i++) {
            //i porque n es siempre el mismo valor, i es la que toma la suma
            suma += i;
        }
        
        return suma;
    }
    
    /*
    Create a function that generates a random number between 
    two numbers passed by parameter.
    */
    public static int generateRandomNumber(int minimo, int maximo) {
        double number = (Math.random() * (maximo - minimo + 1)) + minimo ;
        int randomNumber = (int)number; // casteo
        
        return randomNumber;
    }
    
    /*
    Create a function that shows all pairs between two 
    numbers after passing two numbers.
    */
    
    // void muestra pero no devuelve con return
    public static void pairsBetween (int start, int end){
        
        // Por si ponen un inicial mayor al final
        if (start > end) {
            start = end;
            end = start;
        }
        
        for (int i = start; i <= end; i++) {
            
            //es par
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    
    /*
    Create a function that generates a random password with 
    uppercase and lowercase letters and numbers.
    Pass the length of the password as a parameter.
    */
    private static char generateRandomCapitalLetter() {
        return (char)generateRandomNumber(65,90);
    } 
    
    private static char generateRandomLowercaseLetter() {
        return (char)generateRandomNumber(97,122);
    }
    
    public static String generatePassword(int lenght) {
        String password = "";
        int choose;
        
        for (int i = 0; i < lenght; i++) {
     
            choose = generateRandomNumber(1,3);
            
            switch(choose) {
                case 1://number
                    password += generateRandomNumber(0,9);
                    break;
                case 2://capital letter
                    password += generateRandomCapitalLetter ();
                    break;
                case 3://lowercase letter
                    password += generateRandomLowercaseLetter();
                    break;
                default:
                    System.out.println("-");
                    break;
            }
        }
        
        return password;
    }
}
// Afficher la liste des arguments Java
public class Main 
{ 
    public static void main(String[] args) 
    { 
        if (args.length > 0) 
        { 
            System.out.println("arguments :"); 
  
            for (String val:args) 
                System.out.println(val); 
        } 
        else
            System.out.println("Pas d'arguments"); 
    } 
} 

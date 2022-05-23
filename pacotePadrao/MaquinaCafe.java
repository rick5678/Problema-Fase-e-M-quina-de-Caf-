package pacotePadrao;

import javax.swing.JOptionPane;

public class MaquinaCafe {
    
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Número de funcionários no primeiro andar"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Número de funcionários no segundo andar"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Número de funcionários no terceiro andar"));

        System.out.println("Primeiro andar: " + a);
        System.out.println("Segundo andar: " + b);
        System.out.println("Terceiro andar: " + c);

        int first = primeiraCombinacao(a, b, c);
        int second = segundaCombinacao(a, b, c);
        int third = terceiraCombinacao(a, b, c);
        
        System.out.println("Melhor tempo é colando no: ");
        
        if(first <= second && first <= third){
            System.out.println("Primeiro andar: " + first);
        } else if(second <= first && second <= third){
            System.out.println("Segundo andar: " + second);
        } else{
            System.out.println("Terceiro andar: " + third);
        }

    }

    public static int primeiraCombinacao(int a, int b, int c){
        a = a * 0;
        c = c * 2;
        System.out.println("Se o café for posto no primeiro andar: " + (a + b + c));
        return (a + b + c)* 2;
    }

    public static int segundaCombinacao(int a, int b, int c){
        b = b* 0;
        System.out.println("Se o café for posto no segundo andar: " + (a + b + c));
        return (a + b + c)* 2;
    }

    public static int terceiraCombinacao(int a, int b, int c){
        a = a * 2;
        c = c * 0;
        System.out.println("Se o café for posto no terceiro andar: " + (a + b + c));
        return (a + b + c)* 2;
    }

}

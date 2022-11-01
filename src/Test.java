import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        double peso = 150.0;

         double altura = 1.75;

         double imc = peso / (altura * altura);
         System.out.printf("%.2f\n" , imc);

         String classificacao1 = "Frango";
         String classificacao2 = "Normal";
         String classificacao3 = "Fordo";
         String classificacao4 = "Obeso ";
         String classificacao5 = "Megablaster";

         String grau1 = "0";
         String grau2 = "0";
         String grau3 = "I";
         String grau4 = "II";
         String grau5 = "III";

         if (imc < 18.5) {
         System.out.println("Classificação:" + classificacao1 + " :" + " Grau " + grau1);
         } else if (imc > 18.5 && imc <= 24.9) {
         System.out.println("Classificação:" + classificacao2 + ":" + " Grau " + grau2);
         } else if (imc >= 25.0 && imc <= 29.9) {
         System.out.println("Classificação:" + classificacao3 + ":" + " Grau " + grau3);
         } else if (imc >= 30.0 && imc <= 39.9) {
         System.out.println("Classificação:" + classificacao4 + ";" + " Grau " + grau4);
         } else {
         System.out.println("Classificação:" + classificacao5 + ":" + " Grau " + grau5);
         }


       Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu peso");
       double pesoUsuario = ler.nextDouble();


    }

}


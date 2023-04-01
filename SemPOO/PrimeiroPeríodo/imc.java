import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double peso, altura, pesoIdeal, genero;
  
        System.out.println("Qual é o seu peso? (em kg)");
        peso = in.nextDouble();
    
        System.out.println("Qual é sua altura? (em metros)");
        altura = in.nextDouble();

        System.out.print("Informe o número correspodente a seu gênero:" +  "\n[1]Masculino\n" + "[2]Feminino\n");
        genero = in.nextDouble();

        // Inseri condicionais máximas caso o usuário insira um valor discrepante de altura e peso.
        if(genero == 1) {
            if(altura < 2.51 && altura > 0 && peso > 0 && peso < 250) {
                pesoIdeal = Math.round(72.7 * altura - 58);
            if (peso == pesoIdeal){
                System.out.println("Você possui um peso ideal para sua altura de " + pesoIdeal + " quilos.");
            }else {
                if(peso < pesoIdeal) {
                    System.out.println("Você está abaixo do peso ideal, o peso recomendado para sua altura é de " 
                    + pesoIdeal + " quilos.");
                }
                else {
                    System.out.println("Você está acima do peso ideal, o peso recomendado para sua altura é de " 
                    + pesoIdeal + " quilos.");
                    }
                } 
            } else {
                System.out.println("Valores inválidos.");
            }
        } else {
            if(genero == 2) {
                if(altura < 2.51 && altura > 0 && peso > 0 && peso < 250) {
                pesoIdeal = Math.round(62.1 * altura - 44.7);
                if (peso == pesoIdeal){
                    System.out.println("Você possui um peso ideal para sua altura de " + pesoIdeal + " quilos.");
                }else {
                    if(peso < pesoIdeal) {
                        System.out.println("Você está abaixo do peso ideal, o peso recomendado para sua altura é de " 
                        + pesoIdeal + " quilos.");
                    }
                    else {
                        System.out.println("Você está acima do peso ideal, o peso recomendado para sua altura é de " 
                        + pesoIdeal + " quilos.");
                    }
                }
                    
            } else{
                System.out.println("Valores inválidos.");
            }
        }
    }
        in.close();
        }
    }
   
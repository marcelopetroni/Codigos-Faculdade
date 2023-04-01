import java.util.Scanner;

public class loopDados {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double quantidade, idade, altura, peso, maior = Double.MIN_VALUE, menor = Double.MAX_VALUE;
        double b = 0, c = 0, media, porcentagem, soma = 0;
        char genero, olhos, cabelo;
        int i = 0, a = 0, d = 0 ;

        System.out.println("Quantas pessoas tem no grupo?");
        quantidade = in.nextDouble();

        while(quantidade < 1) {
            System.out.println("Número de pessoas inviável. Por favor informe um valor igual ou maior que 1");
            quantidade = in.nextDouble();
        }

        while(i < quantidade) {
            i ++;
            System.out.println("Qual é a idade da " + i + "° pessoa?");
            idade = in.nextDouble();

            while(idade < 1 || idade > 120) {
                System.out.println("Idade inválida. Informe uma idade entre 1 e 120.");
                idade = in.nextDouble();
            }

            System.out.println("Qual é a altura da " + i + "° pessoa?" + " (Informe entre 0,5m e 2,5m)");
            altura = in.nextDouble();

            while(altura < 0.5 || altura > 2.5 ) {
                System.out.println("Altura inviável. Informe uma altura entre 0,5 e 2,5m.");
                altura = in.nextDouble();
            }

            System.out.println("Qual é o peso da " + i + "° pessoa?" + "(Informe um valor entre 3kg e 300kg)");
            peso = in.nextDouble();

            while(peso < 3 || peso > 300) {
                System.out.println("Peso inviável. Informe um valor entre 3kg e 300kg.");
                peso = in.nextDouble();
            }

            System.out.println("Qual é o genêro da " + i + "° pessoa?" + "(Informe 'F' para feminino e 'M' para masculino)");
            genero = in.next().charAt(0);

            while(true) {
                if(genero == 'F' || genero == 'f' || genero == 'M' || genero == 'm') {
                    break;
                }
                else {
                    System.out.println("Valor informado inviável. Informe 'F' para feminino e 'M' para masculino.");
                    genero = in.next().charAt(0);
                }
            }

            System.out.println("Qual é a cor dos olhos da " + i + "° pessoa?");
            System.out.println("['A'] para azul. \n['P'] para preto. \n['V'] para verde. \n['C'] para castanho.");
            olhos = in.next().charAt(0);

            while(true) {
                if(olhos == 'A' || olhos == 'P' ||olhos == 'V' || olhos == 'C') {
                    break;
                }
                else {
                    System.out.println("Valor informado inviável. Informe:");
                    System.out.println("['A'] para azul. \n['P'] para preto. \n['V'] para verde. \n['C'] para castanho.");
                    olhos = in.next().charAt(0);
                }
            }
            
            System.out.println("Qual é a cor do cabelo da " + i + "° pessoa?");
            System.out.println("['L'] para loiro. \n['P'] para preto. \n['R'] para ruivo. \n['C'] para castanho.");
            cabelo = in.next().charAt(0);

            while(true) {
                if(cabelo == 'L' || cabelo == 'P' ||cabelo == 'R' || cabelo == 'C') {
                    break;
                }
                else {
                    System.out.println("Valor informado inviável. Informe:");
                    System.out.println("['L'] para loiro. \n['P'] para preto. \n['R'] para ruivo. \n['C'] para castanho.");
                    cabelo = in.next().charAt(0);
                }
            }

            if((genero == 'F' || genero == 'f') && (idade > 50 && peso < 60)) {
                a ++;
            }
            if((genero == 'M'|| genero == 'm') && altura < 1.5) {
                soma = soma + idade;
                b ++;
            }
            if(olhos == 'A' || olhos == 'a') {
                c ++;
            }
            if((cabelo == 'R' || cabelo == 'r') && (olhos != 'A' && olhos != 'a')) {
                d ++;
            }
            if((genero == 'F' || genero == 'f') && peso < menor) {
                menor = peso;
            }
            if((genero == 'M' || genero == 'm') && altura > maior) {
                maior = altura;
            }
        }
        media = soma/b;
        porcentagem = (c/quantidade) * 100;

        System.out.println("Nesse grupo tem " + a + " mulheres acima de 50 anos e com peso inferior a 60kg.");
        System.out.println("A média das idades dos homens com altura inferior a 1.5m é de " + media + " anos.");
        System.out.println("A porcentagem de pessoas com olhos azuis nesse grupo é de " + porcentagem + "%");
        System.out.println("Nesse grupo tem " + d + " pessoas ruivas e que não possuem olhos azuis.");
        System.out.println("A mulher mais magra desse grupo tem " + menor + " quilos.");
        System.out.println("O homem mais alto desse grupo tem " + maior + "m de altura.");

        in.close();
    }
}
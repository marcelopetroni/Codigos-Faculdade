import java.util.Scanner;

public class diaMesAno {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y, z;
        boolean dias = true;
        boolean mes = true;
        boolean anos = true;
        boolean bissexto = true;

        System.out.println("Informe 3 números que represente um dia, um mês e um ano (d.C) para formar uma data.");
        System.out.print("Informe o dia: ");
        x = in.nextInt();
        System.out.print("Informe o mês: ");
        y = in.nextInt();
        System.out.print("Informe o ano: ");
        z = in.nextInt();
    
        // ANO:
        if(z < 0 || z > 2022) {
            anos = false;
        }
        if(z % 4 != 0 ) {
            bissexto = false;
        }
        // MÊS:
        if(y < 1 || y > 12){
           mes = false;
        }

        // DIA:
        if(y == 1 || y == 3 || y == 5 || y == 7 || y == 8 || y == 10 || y == 12) {
            if(x < 1 || x > 31) {
                dias = false;
            }
        }
        else {
            if(y == 2 && bissexto == true) {
                if(x < 1 || x > 29) {
                    dias = false;
                }
            }
            else {
                if(y == 2 && bissexto == false) {
                    if(x < 1 || x > 28){
                        dias = false;
                    }
                }
                else {
                    if(y == 2 && y == 4 && y == 6 && y == 9 && y == 11) {
                        if(x < 1 || x > 30) {
                            dias = false;
                        }
                    }
                }
            }
        }
        
        if(!dias || !mes|| !anos ) {
                    System.out.println("Data inválida.");
                }
                else {
                    System.out.println("Essa data é válida.");
                }
          
        in.close();
        }
    }
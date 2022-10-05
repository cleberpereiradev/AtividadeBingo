import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int cartelaBingo[][] = new int[5][5];
        int cont = 0;
        do{
            boolean repetido = false;
            Random aleatorio = new Random();

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    int gerado = aleatorio.nextInt(1,15);
                    if (gerado == cartelaBingo[i][j]){
                        repetido = true;
                    }
                    if(repetido){
                        continue;
                    }else{
                        if (cartelaBingo[j] == cartelaBingo[1]){
                            gerado += 15;
                        }if (cartelaBingo[j] == cartelaBingo[2]){
                            gerado += 30;
                        }if (cartelaBingo[j] == cartelaBingo[3]){
                            gerado += 45;
                        }if (cartelaBingo[j] == cartelaBingo[4]) {
                            gerado += 60;
                        }
                    }
                    cartelaBingo[i][j] = gerado;
                    cont++;

                }
            }
        }while (cont < 25);
        cartelaBingo[2][2] = 99;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.printf("[%d] ", cartelaBingo[i][j]);
            }
            System.out.println("");
        }
    }

}


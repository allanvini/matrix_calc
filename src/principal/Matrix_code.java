package principal;
import java.util.Scanner;

public class Matrix_code {

	public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int LinhasMTA, ColunasMTA, LinhasMTB, ColunasMTB;
        
        System.out.print("Informe a quantidade de linhas da Matriz A: ");
        LinhasMTA = in.nextInt();
        
        System.out.print("Informe a quantidade de colunas da Matriz A: ");
        ColunasMTA = in.nextInt();
        
        System.out.println("");
        
        System.out.print("Informe a quantidade de linhas da Matriz B: ");
        LinhasMTB = in.nextInt();
        
        System.out.print("Informe a quantidade de colunas da Matriz B: ");
        ColunasMTB = in.nextInt();
        
        System.out.println("");
        
        double MatrizA [][] = new double [LinhasMTA][ColunasMTA];
        double MatrizB [][] = new double [LinhasMTB][ColunasMTB];
        double MatrizAUX [][] = new double [LinhasMTB][ColunasMTB];
        
        for (int i = 0; i<MatrizA.length;i++){
            for (int j = 0; j<MatrizA.length;j++){
                System.out.print("Informe o valor do índice "+(i+1)+"-"+(j+1)+" da matriz A: ");
                MatrizA[i][j] = in.nextInt();
            }
            System.out.println("");
        }
        
        for (int i = 0; i<MatrizB.length;i++){
            for (int j = 0; j<MatrizB.length;j++){
                System.out.print("Informe o valor do índice "+(i+1)+"-"+(j+1)+" da matriz B: ");
                MatrizB[i][j] = in.nextInt();
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Sua matriz A ficou: ");
        System.out.println("");
        for (int i = 0; i<MatrizA.length;i++){
            for (int j = 0; j<MatrizA.length;j++){
                if (j == 0){
                    System.out.print("||");
                }
                System.out.print(" "+MatrizA[i][j]+" ");
                if(j == ((MatrizA.length)-1)){
                    System.out.print("||");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Sua matriz B ficou: ");
        System.out.println("");
        for (int i = 0; i<MatrizB.length;i++){
            for (int j = 0; j<MatrizB.length;j++){
                if (j == 0){
                    System.out.print("||");
                }
                System.out.print(" "+MatrizB[i][j]+" ");
                if(j == ((MatrizB.length)-1)){
                    System.out.print("||");
                }
            }
            System.out.println("");
        }
        
        for (int i = 0; i<MatrizAUX.length;i++){
            for (int j = 0; j<MatrizAUX.length;j++){
                MatrizAUX[i][j] = MatrizA[i][j]+MatrizB[i][j];
            }
        }
        System.out.println("");
        System.out.println("A soma das matrizes é: ");
        System.out.println("");
        for (int i = 0; i<MatrizAUX.length;i++){
            for (int j = 0; j<MatrizAUX.length;j++){
                if (j == 0){
                    System.out.print("||");
                }
                System.out.print(MatrizAUX[i][j]+" ");
                if(j == ((MatrizAUX.length)-1)){
                    System.out.print("||");
                }
                 
            }
            System.out.println("");
        }
        
        for (int i = 0; i<MatrizAUX.length;i++){
            for (int j = 0; j<MatrizAUX.length;j++){
            	if (i < MatrizA.length-1 && j < MatrizB.length-1) {
            		MatrizAUX[i][j] = MatrizA[i][j]*MatrizB[j][i]+MatrizA[i][j+1]*MatrizB[j+1][i];
            	}
            	else {
            		MatrizAUX[i][j] = MatrizA[i][j]*MatrizB[j][i]+MatrizA[i][j]*MatrizB[j][i];
            	}
            }
        }
        
        System.out.println("");
        System.out.println("A multiplicação das matrizes: ");
        System.out.println("");
        for (int i = 0; i<MatrizAUX.length;i++){
            for (int j = 0; j<MatrizAUX.length;j++){
                if (j == 0){
                    System.out.print("||");
                }
                System.out.print(MatrizAUX[i][j]+" ");
                if(j == ((MatrizAUX.length)-1)){
                    System.out.print("||");
                }
                 
            }
            System.out.println("");
        }
        System.out.println("");
        in.close();
	}
}
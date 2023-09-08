import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner parametro = new Scanner(System.in); 
            System.out.println("Digite o primeiro parâmetro: ");
            int p1 = parametro.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            int p2 = parametro.nextInt();

            try {
                contar(p1,p2);
            } catch (ParametrosInvalidosException e){
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }
        }

    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm>parametroDois){
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;
            for (int x=1; x<=contagem; x++){
                System.out.println("Imprimindo o número " + x);
            }
        }
    }
}

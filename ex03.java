import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcool = 0, gasolina = 0, diesel = 0, codigo = sc.nextInt();

        while (codigo != 4){
            if (codigo == 1){
                alcool += 1;
            }
            else if ( codigo == 2){
                gasolina += 1;
            } else if (codigo == 3) {
                diesel += 1;
            }
            else {
                System.out.println("Código Inválido.");
            }
            codigo = sc.nextInt();
        }
        System.out.printf("Muito Obrigado!\nÁlcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina, diesel);
        sc.close();
    }
}

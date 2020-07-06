import java.util.Scanner;

public class TasaIrpf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuanto cobras al año");
        int salario = sc.nextInt();
        int sobrante;
        float porcentaje;
        float sumatorio = 0;

        if (salario > 60000) {
            sobrante=salario-60000;
            sumatorio=(20000*0.1f)+(20000*0.2f)+(sobrante*0.3f);
        }else if (salario > 40000) {
            sobrante=salario-40000;
            sumatorio=(20000*0.1f)+(sobrante*0.2f);

        } else if(salario > 20000){
            sobrante=salario-20000;
            sumatorio=sobrante*0.1f;

        }else{
            System.out.println("No debes pagas impuestos añadidos");
        }


        porcentaje = (sumatorio / salario) * 100f;

        System.out.println("Tu salario es:" + salario + "\n El porcentaje de irpf sobre tu sueldo es:" + porcentaje
                + "\n Y debes pagar de irpf al año: " + sumatorio);

    }
}

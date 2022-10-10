import java.util.Scanner;
public class lt1_at5 {
    public static void main(String[] args) throws Exception {

        //Req_1: Peça uma medida em centímetros.
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma medida em metros: ");
        double metros = sc.nextDouble();
        sc.close();

        //Req_2: Converter em centímetros e imprimir. 

        double centimetros = metros * 100;
        System.out.println(metros + "metros, corresponde à: " + centimetros + "centimetros");
        
    }
}

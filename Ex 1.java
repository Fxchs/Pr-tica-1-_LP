import java.util.Scanner;

public class Exercicio {

 public static void main(String[] args) {
  
   Scanner entrada = new Scanner(System.in);
  
   double TempGasto, VelocidadeMedia, ValorConsumo = 12; //Velocidade média em Km/h, Tempo gasto em horas e Valor do consumo em Km/L
  double Distancia, LitrosUsados;

   System.out.println("Hello Word");

   System.out.println("Programa de cálculo da quantidade de litros de combustível gasta em sua viagem\n\n");
   
   System.out.println("Digite o tempo que você gastou em sua viagem (horas):");
   TempGasto = entrada.nextDouble();

   System.out.println("Agora, digite a velocidade média do seu veículo durante a viagem (Km/h):");
   VelocidadeMedia = entrada.nextDouble();

   Distancia = VelocidadeMedia * TempGasto;
   LitrosUsados = Distancia / ValorConsumo;

   System.out.println("\n\n\nResultados:\n\n");
   System.out.println("Velocidade média = " + VelocidadeMedia + " Km/h\n");
   System.out.println("Tempo gasto = " + TempGasto + " horas\n");
   System.out.println("Distância percorrida = " + Distancia + "Km\n");
   System.out.println("Quantidade de Combustível utilizado: " + LitrosUsados + " litros\n");
    }
}  
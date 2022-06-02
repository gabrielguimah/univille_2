import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String original = "(1) => Subir";
    original += System.lineSeparator() + "(2) => Descer";
    System.out.println(original);
    int direcao = scan.nextInt();

    System.out.println("Capacidade máxima no elevador: ");
    int capacidade = scan.nextInt();

    System.out.println("Andar máximo: ");
    int andar_max = scan.nextInt();

    System.out.println("Andar mínimo: ");
    int andar_min = scan.nextInt();

    Info info = new Info(direcao, capacidade);

    int andar = 0;

    if (direcao == 1) {
      System.out.print("O elevador está no térreo.");
      System.out.print(System.lineSeparator());
      if (andar == andar_max) {
        System.out.print("O elevador chegou ao seu destino.");
      }
      while (andar < andar_max) {
        System.out.print("O elevador está no " + info.mudar() + "º andar | capacidade máxima: " + capacidade);
        System.out.print(System.lineSeparator());
        andar = andar + 1;
      }
    }
    if (direcao == 2) {
      while (andar > andar_min) {
        System.out.print("O elevador está no " + info.mudar() + "º andar | capacidade máxima: " + capacidade);
        System.out.print(System.lineSeparator());
        andar = andar - 1;
      }
    }
    System.out.print("O elevador chegou ao seu destino.");
  }
}
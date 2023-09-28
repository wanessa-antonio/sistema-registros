import java.util.Scanner;

public class SistemaInformativo {
    
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String entrada = scanner.nextLine();
      String[] partes = entrada.split(",");

      // Obtenção dos valores da entrada
      String data = partes[0];
      String hora = partes[1];
      String descricao = partes[2];
      double valor = Double.parseDouble(partes[3]);

      // Criando uma instância de Transação com os valores da entrada.
      Transacao transacao = new Transacao(data, hora, descricao, valor);
      
      // Chamando o método imprimir para exibir as informações formatadas.
      transacao.imprimir();
    } catch (NumberFormatException e) {
     
      e.printStackTrace();
    }
  }
}

class Transacao {
  private String data;
  private String hora;
  private String descricao;
  private double valor;

  public Transacao(String data, String hora, String descricao, double valor) {
    this.data = data;
    this.hora = hora;
    this.descricao = descricao;
    this.valor = valor;
  }
  
  public void imprimir() {
    System.out.println(this.descricao);
    System.out.println(this.data);
    System.out.println(this.hora);
    System.out.printf("%.2f", this.valor);
  }
}
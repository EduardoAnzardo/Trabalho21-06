import java.util.ArrayList;
import java.util.Scanner;

public class PessoaDAO {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    ArrayList<String> lista = new ArrayList();

    System.out.println("Lista de pessoas no sistema");

    lista.add("José");
    lista.add("Carlos");
    lista.add("Antônio");
    lista.add("Maria");

    int i;
    int n = lista.size();
    for (i=0; i<n; i++) {
      System.out.printf("Número %d- %s\n", i, lista.get(i));    
    }
    
    System.out.println("Deseja excluir um usuário do sistema? Se sim, digite o número da pessoa, se não, digite 99");
    i = ler.nextInt();

    if (i == 99) {
      System.out.println("Nenhum usuário foi deletado");
    } 
    else
      try {
        lista.remove(i);
    } catch (IndexOutOfBoundsException e) {
        System.out.printf("\nNúmero Não Detectado (%s).",
          e.getMessage());
    }
    System.out.printf("\nLista de pessoas atualizada: ");
    i = 0;
    for (String pessoa: lista) {
      System.out.printf("\nNúmero %d- %s\n", i, pessoa);
      i++;
    }
  }
}

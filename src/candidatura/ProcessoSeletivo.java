package candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    System.out.println("Processo Seletivo");
    /* selecaoCandidatos();
    imprimirSelecionados(); */

    String [] candidatos = {"Fernanda", "Ricardo", "Pedro", "Ana", "Leandro"};
    for(String candidato : candidatos) {
      entrandoEmContato(candidato);
    }
  }

  static void entrandoEmContato(String candidato){
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;
    do{
      atendeu = atender();
      continuarTentando = !atendeu;

      if(continuarTentando) {
        tentativasRealizadas++;
      }
      else {
        System.out.println("Contato realizado com sucesso");
      }
    }while(continuarTentando && tentativasRealizadas <3);
    if(atendeu){
      System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " tentativa ");
    }
    else{
      System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NUMERO MAXIMO DE TENTATIVAS EXCEDIDO.");
    }
  }


  //metodo auxiliar
  static boolean atender(){
   return new Random().nextInt(3)==1;
  }


  static void imprimirSelecionados(){
    String [] candidatos = {"Fernanda", "Ricardo", "Pedro", "Ana", "Leandro"};
    System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

    for(int indice = 0; indice < candidatos.length; indice++){
      System.out.println("O candidato selecionado de nº " + (indice + 1) + " é o " + candidatos[indice]);
    }


  }

  static void selecaoCandidatos(){
    String candidatos [] = {"Fernanda", "Ricardo", "Pedro", "Ana", "Leandro", "Gabriel", "Mariana", "Mateus", "Thiago", "Larissa"};
    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;

    while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();

      System.out.println("O candidato " + candidato + " solicitou este valor de salario: " + salarioPretendido);
     
      if(salarioBase >= salarioPretendido){
        System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
        candidatosSelecionados = candidatosSelecionados + 1;
    }
      candidatoAtual++;
  }
}

  static double valorPretendido(){
    return ThreadLocalRandom.current().nextDouble(1800,2200);
  }

  static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;
    if(salarioBase > salarioPretendido) {
    System.out.println("Ligar para o candidato");
    }
    else if(salarioBase == salarioPretendido) {
      System.out.println(" Ligar para o candidato com contraproposta ");
    }

    else {
      System.out.println("Aguardando demais candidatos");
    }
  }


}

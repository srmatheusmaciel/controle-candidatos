package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    System.out.println("Processo Seletivo");
    selecaoCandidatos();

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

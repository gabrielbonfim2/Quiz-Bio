import java.util.Scanner;


public class Questao {
    String pergunta;
    String opcaoA;
    String opcaoB;
    String opcaoC;
    String opcaoD;
    String opcaoE;
    String correta;


    public boolean isCorreta(String resposta) {
        if (resposta.equalsIgnoreCase(this.correta)) {
            System.out.println("Parabéns, resposta correta! - Letra: " + this.correta);
            System.out.println();
            return true;
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            System.out.println();
            return false;
        }
    }


    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.print("Digite a resposta (A, B, C, D ou E): ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }


    private boolean respostaValida(String resp) {
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
            return true;
        }
        System.out.println("Resposta inválida! Digite opção A, B, C, D ou E.");
        System.out.println();
        return false;
    }


    public void escrevaQuestao() {
        System.out.println(this.pergunta);
        System.out.println("A) " + this.opcaoA);
        System.out.println("B) " + this.opcaoB);
        System.out.println("C) " + this.opcaoC);
        System.out.println("D) " + this.opcaoD);
        System.out.println("E) " + this.opcaoE);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;


        Questao[] questoes = new Questao[15];


        questoes[1]= new Questao();
        questoes[1].pergunta = "1. Qual é a principal função das mitocôndrias?";
        questoes[1].opcaoA = "Realizar fotossíntese";
        questoes[1].opcaoB = "Armazenar energia";
        questoes[1].opcaoC = "Produzir ATP por meio da respiração celular";
        questoes[1].opcaoD = "Produzir proteínas";
        questoes[1].opcaoE = "Armazenar cálcio";
        questoes[1].correta = "C";

        questoes[2] = new Questao();
        questoes[2].pergunta = "2. O que é a fotossíntese?";
        questoes[2].opcaoA = "Processo de respiração das plantas";
        questoes[2].opcaoB = "Conversão de energia luminosa em energia química";
        questoes[2].opcaoC = "Produção de energia nas mitocôndrias";
        questoes[2].opcaoD = "Absorção de nutrientes pelas raízes";
        questoes[2].opcaoE = "Transpiração das folhas";
        questoes[2].correta = "B";

        questoes[3] = new Questao();
        questoes[3].pergunta = "3. O que e considerado ó segundo coração do ser humano?"
        questoes[3].opcaoA = "Pulmão";
        questoes[3].opcaoB = "Mão";
        questoes[3].opcaoC = "Rins";
        questoes[3].opcaoD = "Panturrilha";
        questoes[3].opcaoE = "Intestino Delgado";
        questoes[3].correta = "D";

        questoes[4] = new Questao();
        questoes[4].pergunta = "4. Analise as alternativas abaixo e marque o momento em que é determinado o sexo de uma criança:";
        questoes[4].opcaoA = "Ovulação";
        questoes[4].opcaoB = "Espermatogênese";
        questoes[4].opcaoC = "Fecundação";
        questoes[4].opcaoD = "Nidação";
        questoes[4].opcaoE = "Neurulação";
        questoes[4].correta = "D";

        questoes[5] = new Questao();
        questoes[5].pergunta = "5.              "
        questoes[5]
        questoes[5]
        questoes[5].pergunta = desk.
        questoes[5]

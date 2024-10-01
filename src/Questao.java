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
            return true;
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            return false;
        }
    }

    public String leiaResposta(Scanner ler) {
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

        // Mensagem de boas-vindas
        System.out.println("Unifan - Centro Universitário Alfredo Nasser");
        System.out.println("Nome do aluno: Gabriel Gomes de Oliveira Bonfim");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Seja bem-vindo! Você responderá 15 perguntas envolvendo biologia.\n");

        Questao[] questoes = new Questao[15];

        // Questões
        questoes[0] = new Questao();
        questoes[0].pergunta = "1. Qual é a principal função das mitocôndrias?";
        questoes[0].opcaoA = "Realizar fotossíntese";
        questoes[0].opcaoB = "Armazenar energia";
        questoes[0].opcaoC = "Produzir ATP por meio da respiração celular";
        questoes[0].opcaoD = "Produzir proteínas";
        questoes[0].opcaoE = "Armazenar cálcio";
        questoes[0].correta = "C";

        questoes[1] = new Questao();
        questoes[1].pergunta = "2. O que é a fotossíntese?";
        questoes[1].opcaoA = "Processo de respiração das plantas";
        questoes[1].opcaoB = "Conversão de energia luminosa em energia química";
        questoes[1].opcaoC = "Produção de energia nas mitocôndrias";
        questoes[1].opcaoD = "Absorção de nutrientes pelas raízes";
        questoes[1].opcaoE = "Transpiração das folhas";
        questoes[1].correta = "B";

        questoes[2] = new Questao();
        questoes[2].pergunta = "3. O que é considerado o segundo coração do ser humano?";
        questoes[2].opcaoA = "Pulmão";
        questoes[2].opcaoB = "Mão";
        questoes[2].opcaoC = "Rins";
        questoes[2].opcaoD = "Panturrilha";
        questoes[2].opcaoE = "Intestino Delgado";
        questoes[2].correta = "D";

        questoes[3] = new Questao();
        questoes[3].pergunta = "4. Analise as alternativas abaixo e marque o momento em que é determinado o sexo de uma criança:";
        questoes[3].opcaoA = "Ovulação";
        questoes[3].opcaoB = "Espermatogênese";
        questoes[3].opcaoC = "Fecundação";
        questoes[3].opcaoD = "Nidação";
        questoes[3].opcaoE = "Neurulação";
        questoes[3].correta = "C";

        questoes[4] = new Questao();
        questoes[4].pergunta = "5. O que é o ecossistema?";
        questoes[4].opcaoA = "Conjunto de todos os seres vivos de uma região";
        questoes[4].opcaoB = "Relação entre predadores e presas";
        questoes[4].opcaoC = "Conjunto de organismos e o meio ambiente interagindo";
        questoes[4].opcaoD = "Clima de uma determinada área";
        questoes[4].opcaoE = "Cadeia alimentar de uma região específica";
        questoes[4].correta = "C";

        questoes[5] = new Questao();
        questoes[5].pergunta = "6. Qual é a unidade fundamental da vida?";
        questoes[5].opcaoA = "Mitocôndria";
        questoes[5].opcaoB = "Núcleo";
        questoes[5].opcaoC = "Célula";
        questoes[5].opcaoD = "Tecidos";
        questoes[5].opcaoE = "Átomos";
        questoes[5].correta = "C";

        questoes[6] = new Questao();
        questoes[6].pergunta = "7. Qual é a função dos leucócitos?";
        questoes[6].opcaoA = "Transportar oxigênio";
        questoes[6].opcaoB = "Regular o metabolismo";
        questoes[6].opcaoC = "Atacar e destruir patógenos";
        questoes[6].opcaoD = "Produzir anticorpos";
        questoes[6].opcaoE = "Coagulação do sangue";
        questoes[6].correta = "C";

        questoes[7] = new Questao();
        questoes[7].pergunta = "8. Qual é o nome do processo em que as plantas perdem água?";
        questoes[7].opcaoA = "Osmose";
        questoes[7].opcaoB = "Evaporação";
        questoes[7].opcaoC = "Fotossíntese";
        questoes[7].opcaoD = "Transpiração";
        questoes[7].opcaoE = "Respiração";
        questoes[7].correta = "D";

        questoes[8] = new Questao();
        questoes[8].pergunta = "9. Qual parte da célula é responsável pela produção de energia?";
        questoes[8].opcaoA = "Núcleo";
        questoes[8].opcaoB = "Ribossomos";
        questoes[8].opcaoC = "Lisossomos";
        questoes[8].opcaoD = "Mitocôndrias";
        questoes[8].opcaoE = "Retículo endoplasmático";
        questoes[8].correta = "D";

        questoes[9] = new Questao();
        questoes[9].pergunta = "10. Qual é a molécula responsável pelo armazenamento de informações genéticas?";
        questoes[9].opcaoA = "RNA";
        questoes[9].opcaoB = "Proteínas";
        questoes[9].opcaoC = "Carboidratos";
        questoes[9].opcaoD = "Lipídios";
        questoes[9].opcaoE = "DNA";
        questoes[9].correta = "E";

        questoes[10] = new Questao();
        questoes[10].pergunta = "11. Qual é o órgão responsável pela filtragem do sangue no corpo humano?";
        questoes[10].opcaoA = "Coração";
        questoes[10].opcaoB = "Fígado";
        questoes[10].opcaoC = "Pulmões";
        questoes[10].opcaoD = "Rins";
        questoes[10].opcaoE = "Intestinos";
        questoes[10].correta = "D";

        questoes[11] = new Questao();
        questoes[11].pergunta = "12. O que é a homeostase?";
        questoes[11].opcaoA = "Processo de digestão";
        questoes[11].opcaoB = "Regulação do ambiente interno do organismo";
        questoes[11].opcaoC = "Reprodução celular";
        questoes[11].opcaoD = "Transporte de nutrientes";
        questoes[11].opcaoE = "Resposta a estímulos externos";
        questoes[11].correta = "B";

        questoes[12] = new Questao();
        questoes[12].pergunta = "13. O que são os hormônios?";
        questoes[12].opcaoA = "Moléculas de DNA";
        questoes[12].opcaoB = "Moléculas de RNA";
        questoes[12].opcaoC = "Mensageiros químicos no corpo";
        questoes[12].opcaoD = "Estruturas celulares";
        questoes[12].opcaoE = "Nutrientes essenciais";
        questoes[12].correta = "C";

        questoes[13] = new Questao();
        questoes[13].pergunta = "14. Qual é a função dos cloroplastos nas células vegetais?";
        questoes[13].opcaoA = "Respiração celular";
        questoes[13].opcaoB = "Produção de energia";
        questoes[13].opcaoC = "Fotossíntese";
        questoes[13].opcaoD = "Armazenamento de água";
        questoes[13].opcaoE = "Síntese de proteínas";
        questoes[13].correta = "C";

        questoes[14] = new Questao();
        questoes[14].pergunta = "15. O que é a biodiversidade?";
        questoes[14].opcaoA = "Quantidade de espécies em um ecossistema";
        questoes[14].opcaoB = "Diversidade genética";
        questoes[14].opcaoC = "Interações entre organismos";
        questoes[14].opcaoD = "Riqueza de habitats";
        questoes[14].opcaoE = "Todos os anteriores";
        questoes[14].correta = "E";

        // Laço para percorrer as questões
        for (Questao questao : questoes) {
            questao.escrevaQuestao();
            String resposta = questao.leiaResposta(scanner);
            if (questao.isCorreta(resposta)) {
                score++;
            }
        }

        System.out.println("Você acertou " + score + " de " + questoes.length + " questões.");
        scanner.close();
    }
}

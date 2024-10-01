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
        questoes[5].pergunta = "6. O que é o ecossistema?";
        questoes[5].opcaoA = "Conjunto de todos os seres vivos de uma região";
        questoes[5].opcaoB = "Relação entre predadores e presas";
        questoes[5].opcaoC = "Conjunto de organismos e o meio ambiente interagindo";
        questoes[5].opcaoD = "Clima de uma determinada área";
        questoes[5].opcaoE = "Cadeia alimentar de uma região específica";
        questoes[5].correta = "C";

        questoes[6] = new Questao();
        questoes[6].pergunta = "7. Qual é a unidade fundamental da vida?";
        questoes[6].opcaoA = "Mitocôndria";
        questoes[6].opcaoB = "Núcleo";
        questoes[6].opcaoC = "Célula";
        questoes[6].opcaoD = "Tecidos";
        questoes[6].opcaoE = "Átomos";
        questoes[6].correta = "C";

        questoes[7] = new Questao();
        questoes[7].pergunta = "8. Qual é a função dos leucócitos?";
        questoes[7].opcaoA = "Transportar oxigênio";
        questoes[7].opcaoB = "Regular o metabolismo";
        questoes[7].opcaoC = "Atacar e destruir patógenos";
        questoes[7].opcaoD = "Produzir anticorpos";
        questoes[7].opcaoE = "Coagulação do sangue";
        questoes[7].correta = "C";

        questoes[8] = new Questao();
        questoes[8].pergunta = "9. Qual é o nome do processo em que as plantas perdem água?";
        questoes[8].opcaoA = "Osmose";
        questoes[8].opcaoB = "Evaporação";
        questoes[8].opcaoC = "Fotossíntese";
        questoes[8].opcaoD = "Transpiração";
        questoes[8].opcaoE = "Respiração";
        questoes[8].correta = "D";

        questoes[9] = new Questao();
        questoes[9].pergunta = "10. Qual parte da célula é responsável pela produção de energia?";
        questoes[9].opcaoA = "Núcleo";
        questoes[9].opcaoB = "Ribossomos";
        questoes[9].opcaoC = "Lisossomos";
        questoes[9].opcaoD = "Mitocôndrias";
        questoes[9].opcaoE = "Retículo endoplasmático";
        questoes[9].correta = "D";

        questoes[10] = new Questao();
        questoes[10].pergunta = "11. Qual é a molécula responsável pelo armazenamento de informações genéticas?";
        questoes[10].opcaoA = "RNA";
        questoes[10].opcaoB = "Proteínas";
        questoes[10].opcaoC = "Carboidratos";
        questoes[10].opcaoD = "Lipídios";
        questoes[10].opcaoE = "DNA";
        questoes[10].correta = "E";

        questoes[11] = new Questao();
        questoes[11].pergunta = "12. Qual é o órgão responsável pela filtragem do sangue no corpo humano?";
        questoes[11].opcaoA = "Coração";
        questoes[11].opcaoB = "Fígado";
        questoes[11].opcaoC = "Pulmões";
        questoes[11].opcaoD = "Rins";
        questoes[11].opcaoE = "Intestinos";
        questoes[11].correta = "D";

        questoes[12] = new Questao();
        questoes[12].pergunta = "13. O que é a homeostase?";
        questoes[12].opcaoA = "Processo de digestão";
        questoes[12].opcaoB = "Regulação do ambiente interno do organismo";
        questoes[12].opcaoC = "Reprodução celular";
        questoes[12].opcaoD = "Transporte de nutrientes";
        questoes[12].opcaoE = "Resposta a estímulos externos";
        questoes[12].correta = "B";

        questoes[13] = new Questao();
        questoes[13].pergunta = "14. O que são os hormônios?";
        questoes[13].opcaoA = "Moléculas de DNA";
        questoes[13].opcaoB = "Moléculas de RNA";
        questoes[13].opcaoC = "Mensageiros químicos no corpo";
        questoes[13].opcaoD = "Estruturas celulares";
        questoes[13].opcaoE = "Nutrientes essenciais";
        questoes[13].correta = "C";

        questoes[14] = new Questao();
        questoes[14].pergunta = "15. Qual é a função dos cloroplastos nas células vegetais?";
        questoes[14].opcaoA = "Respiração celular";
        questoes[14].opcaoB = "Produção de energia";
        questoes[14].opcaoC = "Fotossíntese";
        questoes[14].opcaoD = "Armazenamento de água";
        questoes[14].opcaoE = "Síntese de proteínas";
        questoes[14].correta = "C";


        for (Questao questao : questoes) {
            questao.escrevaQuestao();
            String resposta = questao.leiaResposta();
            if (questao.isCorreta(resposta)) {
                score++;
            }
        }


        System.out.println("Você acertou " + score + " de " + questoes.length + " questões.");
        scanner.close();
    }
}

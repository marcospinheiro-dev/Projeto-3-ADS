package quizEducacional.historiaDoBrasil;

import java.util.Scanner;

public class Aplicacao extends Questoes {

    public Aplicacao(int primeiroQuest) {
        super(primeiroQuest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("DAMOS AS BOAS VINDAS AO NOSSO TESTE DE CONHECIMENTO DA HISTÓRIA DO BRASIL.");
        System.out.println("--------------------------------------------------------------------------");

        Questoes questao1 = new Questoes();
        Questoes questao2 = new Questoes();
        Questoes questao3 = new Questoes();
        Questoes questao4 = new Questoes();
        Questoes questao5 = new Questoes();


        System.out.println("1) - A ordem baixada pelo governador de Minas Gerais, Visconde de Barbacena, " +
                "para que se realizasse a Derrama, ou seja, a cobrança dos tributos devidos à coroa " +
                "portuguesa foi a causa imediata da: ");
        System.out.println("[1]Revolta dos Alfaiates.");
        System.out.println("[2]Revolta de Vila Rica.");
        System.out.println("[3]Guerra dos Mascates.");
        System.out.println("[4]Guerra do Contestado.");
        System.out.println("[5]Inconfidência Mineira.");
        System.out.println(" ");
        System.out.print("Escolha a resposta correta: ");

        questao1.setPrimeiraQuest(sc.nextInt());
        while(questao1.getPrimeiraQuest() < 1 || questao1.getPrimeiraQuest() > 5){
            System.out.println("Número incorreto, tente novamente!");
            System.out.print("Escolha a resposta correta: ");
            questao1.setPrimeiraQuest(sc.nextInt());
        }
        switch (questao1.getPrimeiraQuest()) {
            case 1:{
                System.out.println("Resposta incorreta!");
                break;
            }
            case 2:
                System.out.println("Resposta incorreta!");
                break;
            case 3:
                System.out.println("Resposta incorreta!");
                break;
            case 4:
                System.out.println("Resposta incorreta!");
                break;
            case 5:
                System.out.println("Resposta correta!");
                break;
            default:
                break;
        }

        System.out.println("--------------------------------------------");
        System.out.println("2) - A primeira “relação de trabalho” entre portugueses e índios brasileiros foi: ");
        System.out.println("[1]O escambo.");
        System.out.println("[2]A escravidão.");
        System.out.println("[3]A servidão.");
        System.out.println("[4]O colonato.");
        System.out.println("[5]A mita.");
        System.out.println(" ");
        System.out.print("Escolha a resposta correta: ");

        questao2.setSegundaQuest(sc.nextInt());
        while(questao2.getSegundaQuest() < 1 || questao2.getSegundaQuest() > 5) {
            System.out.println("Número incorreto, tente novamente!");
            System.out.print("Escolha a resposta correta: ");
            questao2.setSegundaQuest(sc.nextInt());
        }
        switch (questao2.getSegundaQuest()) {
            case 1:
                System.out.println("Resposta correta!");
                break;
            case 2:
                System.out.println("Resposta incorreta!");
                break;
            case 3:
                System.out.println("Resposta incorreta!");
                break;
            case 4:
                System.out.println("Resposta incorreta!");
                break;
            case 5:
                System.out.println("Resposta incorreta!");
                break;
        }

        System.out.println("--------------------------------------------");
        System.out.println("3) - Quem foi o primeiro governador-geral do Brasil? ");
        System.out.println("[1]Mem de Sá.");
        System.out.println("[2]Tomé de Sousa.");
        System.out.println("[3]Duarte da Costa.");
        System.out.println("[4]Duarte Coelho.");
        System.out.println("[5]Martim Afonso de Sousa.");
        System.out.println(" ");
        System.out.print("Escolha a resposta correta: ");

        questao3.setTerceiraQuest(sc.nextInt());
        while(questao3.getTerceiraQuest() < 1 || questao3.getTerceiraQuest() > 5) {
            System.out.println("Número incorreto, tente novamente!");
            System.out.print("Escolha a resposta correta: ");
            questao3.setTerceiraQuest(sc.nextInt());
        }
        switch (questao3.getTerceiraQuest()) {
            case 1:
                System.out.println("Resposta incorreta!");
                break;
            case 2:
                System.out.println("Resposta correta!");
                break;
            case 3:
                System.out.println("Resposta incorreta!");
                break;
            case 4:
                System.out.println("Resposta incorreta!");
                break;
            case 5:
                System.out.println("Resposta incorreta!");
                break;
        }
        System.out.println("--------------------------------------------");
        System.out.println("4) - Qual era o nome da principal estrada que ligava as Minas Gerais com o Rio de " +
                "Janeiro durante o auge do período da mineração? ");
        System.out.println("[1]Caminho Novo.");
        System.out.println("[2]Estrada Lusitana.");
        System.out.println("[3]Caminho do Ouro.");
        System.out.println("[4]Estrada das Minas.");
        System.out.println("[5]Caminho de Paraty.");
        System.out.println(" ");
        System.out.print("Escolha a resposta correta: ");

        questao4.setQuartaQuest(sc.nextInt());
        while(questao4.getQuartaQuest() < 1 || questao4.getQuartaQuest() > 5) {
            System.out.println("Número incorreto, tente novamente!");
            System.out.print("Escolha a resposta correta: ");
            questao4.setQuartaQuest(sc.nextInt());
        }
        switch (questao4.getQuartaQuest()) {
            case 1:
                System.out.println("Resposta correta!");
                break;
            case 2:
                System.out.println("Resposta incorreta!");
                break;
            case 3:
                System.out.println("Resposta incorreta!");
                break;
            case 4:
                System.out.println("Resposta incorreta!");
                break;
            case 5:
                System.out.println("Resposta incorreta!");
                break;
        }
        System.out.println("--------------------------------------------");
        System.out.println("5) - Os bandeirantes eram os responsáveis por expedições que ficaram conhecidas como: ");
        System.out.println("[1]Derramas.");
        System.out.println("[2]Capitulações.");
        System.out.println("[3]Processos.");
        System.out.println("[4]Bandeiras.");
        System.out.println("[5]Delegações.");
        System.out.println(" ");
        System.out.print("Escolha a resposta correta: ");

        questao5.setQuintaQuest(sc.nextInt());
        while(questao5.getQuintaQuest() < 1 || questao5.getQuintaQuest() > 5) {
            System.out.println("Número incorreto, tente novamente!");
            System.out.print("Escolha a resposta correta: ");
            questao5.setQuintaQuest(sc.nextInt());
        }
        switch (questao5.getQuintaQuest()) {
            case 1:
                System.out.println("Resposta incorreta!");
                break;
            case 2:
                System.out.println("Resposta incorreta!");
                break;
            case 3:
                System.out.println("Resposta incorreta!");
                break;
            case 4:
                System.out.println("Resposta correta!");
                break;
            case 5:
                System.out.println("Resposta incorreta!");
                break;
        }
        System.out.println("--------------------------------------------");
        int totalDeAcertos = 0;
        int totalDeErros = 0;

        if (questao1.getPrimeiraQuest() == 5) {
            totalDeAcertos = totalDeAcertos + 1;
        } else {
            totalDeErros = totalDeErros + 1;
        }
        if (questao2.getSegundaQuest() == 1) {
            totalDeAcertos = totalDeAcertos + 1;
        } else {
            totalDeErros = totalDeErros + 1;
        }
        if (questao3.getTerceiraQuest() == 2) {
            totalDeAcertos = totalDeAcertos + 1;
        } else {
            totalDeErros = totalDeErros + 1;
        }
        if (questao4.getQuartaQuest() == 1) {
            totalDeAcertos = totalDeAcertos + 1;
        } else {
            totalDeErros = totalDeErros + 1;
        }
        if (questao5.getQuintaQuest() == 4) {
            totalDeAcertos = totalDeAcertos + 1;
        } else {
            totalDeErros = totalDeErros + 1;
        }
        double soma =totalDeAcertos + totalDeErros;
        double totalPercent = totalDeAcertos / soma * 100.0;
        System.out.println("\nTotal de acertos: " + totalDeAcertos);
        System.out.println("Total de erros: " + totalDeErros);
        System.out.println("Percentual de acertos: " + totalPercent + "%");

        sc.close();
    }
}

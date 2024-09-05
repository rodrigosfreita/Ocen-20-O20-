package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados para o Coral
        Coral coral = new Coral();
        System.out.println("Insira os dados do Coral:");
        System.out.print("Taxa de Crescimento: ");
        coral.setTaxaCrescimento(scanner.nextDouble());
        System.out.print("Densidade de Pólipos: ");
        coral.setDensidadePolipos(scanner.nextInt());
        scanner.nextLine();  // Consumir nova linha
        System.out.print("Resposta ao Estresse: ");
        coral.setRespostaEstresse(scanner.nextLine());
        System.out.print("Cor: ");
        coral.setCor(scanner.nextLine());
        System.out.print("Temperatura da Água: ");
        coral.setTemperaturaAgua(scanner.nextDouble());
        System.out.print("Nível de PH: ");
        coral.setNivelPH(scanner.nextDouble());
        System.out.print("Luminosidade: ");
        coral.setLuminosidade(scanner.nextDouble());

        // Entrada de dados para Sensores
        System.out.println("Insira os dados dos Sensores:");
        System.out.print("Número de Sensores: ");
        int numSensores = scanner.nextInt();
        scanner.nextLine();  // Consumir nova linha

        for (int i = 0; i < numSensores; i++) {
            System.out.println("Sensor " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha
            System.out.print("Tipo: ");
            String tipo = scanner.nextLine();
            System.out.print("Localização: ");
            String localizacao = scanner.nextLine();

            Sensor sensor = new Sensor(id, tipo, localizacao);
            coral.adicionarSensor(sensor);
        }

        // Coleta de dados e exibição de informações do coral
        System.out.println("Coletando dados do coral...");
        coral.coletarDados();
        System.out.println("Calculando taxa de crescimento: " + coral.calcularTaxaCrescimento());
        System.out.println("Medindo densidade de pólipos: " + coral.medirDensidadePolipos());
        System.out.println("Detectando resposta ao estresse: " + coral.detectarRespostaEstresse());

        // Envio de dados dos sensores
        System.out.println("Enviando dados dos sensores...");
        for (Sensor sensor : coral.getSensores()) {
            sensor.enviarDados();
        }

        // Entrada de dados para o Comportamento
        Comportamento comportamento = new Comportamento();
        System.out.println("Insira os dados do Comportamento:");
        System.out.print("Frequência de Movimento: ");
        comportamento.setFrequenciaDeMovimento(scanner.nextDouble());
        scanner.nextLine();  // Consumir nova linha
        System.out.print("Interação com Fauna: ");
        comportamento.setInteracaoComFauna(scanner.nextLine());

        // Análise do comportamento
        comportamento.analisar();

        // Entrada de dados para a Ameaça
        Ameaca ameaca = new Ameaca();
        System.out.println("Insira os dados da Ameaça:");
        System.out.print("Tipo: ");
        ameaca.setTipo(scanner.nextLine());
        System.out.print("Severidade (1 a 10): ");
        ameaca.setSeveridade(scanner.nextInt());
        System.out.print("Probabilidade (0.0 a 1.0): ");
        ameaca.setProbabilidade(scanner.nextDouble());
        scanner.nextLine();  // Consumir nova linha
        System.out.print("Origem: ");
        ameaca.setOrigem(scanner.nextLine());

        // Previsão da ameaça
        ameaca.prever();

        // Entrada de dados para o Cientista
        Cientista cientista = new Cientista();
        System.out.println("Insira os dados do Cientista:");
        System.out.print("Nome: ");
        cientista.setNome(scanner.nextLine());
        System.out.print("Especialização: ");
        cientista.setEspecializacao(scanner.nextLine());
        System.out.print("Afiliacao: ");
        cientista.setAfiliacao(scanner.nextLine());

        // Coleta de dados pelo cientista
        cientista.coletarDados(coral);

        // Análise de comportamento pelo cientista
        cientista.analisarComportamento(comportamento);

        // Previsão de ameaças pelo cientista
        cientista.preverAmeacas(ameaca);

        // Publicação de resultados pelo cientista
        cientista.publicarResultados();

        // Entrada de dados para a Comunidade Local
        ComunidadeLocal comunidade = new ComunidadeLocal();
        System.out.println("Insira os dados da Comunidade Local:");
        System.out.print("Nome: ");
        comunidade.setNome(scanner.nextLine());
        System.out.print("Região: ");
        comunidade.setRegiao(scanner.nextLine());
        System.out.print("Número de Membros: ");
        comunidade.setNumeroDeMembros(scanner.nextInt());
        scanner.nextLine();  // Consumir nova linha

        // Colaboração da comunidade local
        comunidade.colaborar("Projeto de Preservação dos Corais");

        // Organização de eventos pela comunidade local
        comunidade.organizarEventos("Limpeza da Praia");
        comunidade.organizarEventos("Workshop de Biologia Marinha");

        // Exibição dos eventos organizados
        System.out.println("Eventos organizados: " + comunidade.getEventos());

        // Entrada de dados para o Turista
        Turista turista = new Turista();
        System.out.println("Insira os dados do Turista:");
        System.out.print("Nome: ");
        turista.setNome(scanner.nextLine());
        System.out.print("País de Origem: ");
        turista.setPaisOrigem(scanner.nextLine());

        // Adicionando interesses ao turista
        System.out.println("Insira os interesses do Turista (separados por vírgulas): ");
        String[] interessesArray = scanner.nextLine().split(",");
        List<String> interesses = new ArrayList<>();
        for (String interesse : interessesArray) {
            interesses.add(interesse.trim());
        }
        turista.setInteresses(interesses);

        // Colaboração do turista
        turista.colaborar("Projeto de Preservação dos Corais");

        // Participação em atividades pelo turista
        turista.participarAtividades("Limpeza da Praia");
        turista.participarAtividades("Workshop de Biologia Marinha");

        // Exibição das atividades que o turista participou
        System.out.println("Atividades em que " + turista.getNome() + " participou: " + turista.getAtividades());

        // Entrada de dados para a Colaboração
        Colaboracao colaboracao = new Colaboracao();
        System.out.println("Insira os dados da Colaboração:");
        System.out.print("Tipo: ");
        colaboracao.setTipo(scanner.nextLine());
        System.out.print("Data (YYYY-MM-DD): ");
        colaboracao.setData(scanner.nextLine());
        System.out.print("Local: ");
        colaboracao.setLocal(scanner.nextLine());

        // Facilitação da colaboração
        colaboracao.facilitar();

        // Registro de participantes na colaboração
        colaboracao.registrarParticipantes("Dr. Silva");
        colaboracao.registrarParticipantes("Comunidade Costeira");
        colaboracao.registrarParticipantes("Turista João");

        // Exibição dos participantes registrados
        System.out.println("Participantes registrados: " + colaboracao.getParticipantes());
    }
}
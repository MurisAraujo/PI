package trabalhoPI;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class ProjetoPI_4 {
	static int points = 5;

	public static int sorteio() {
		Random sorteio = new Random();
		int questIndex = sorteio.nextInt(10); // metodo que sorteia as perguntas de acordo com os indices dos arrays
												// criados.
		return questIndex;
	}

	public static void instructions() {
		System.out.println("\n");
		System.out.println("       _____           _                   /\\/|           ");
		System.out.println("      |_   _|         | |                 |/\\/            ");
		System.out.println("        | |  _ __  ___| |_ _ __ _   _  ___ ___   ___  ___ ");
		System.out.println("        | | | '_ \\/ __| __| '__| | | |/ __/ _ \\ / _ \\/ __|");
		System.out.println("       _| |_| | | \\__ \\ |_| |  | |_| | (_| (_) |  __/\\__ \\");
		System.out.println("      |_____|_| |_|___/\\__|_|   \\__,_|\\___\\___/ \\___||___/");
		System.out.println("                                       )_)                ");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("* Uma entidade decide usar um aluno que não se dedicava as suas aulas* \n"
				+ "* só tirava notas medianas e não estudava em casa e caçoava da facilidade*\n"
				+ "* de suas provas. A fim de diversão a entidade criou uma mansão* \n"
				+ "* com varios desafios de algoritmos para esse aluno solucionar, enquanto* \n"
				+ "* não solucionasse pelo menos 60% dos desafios com respostas corretas, ele* \n"
				+ "* não poderá sair da mansão assim divertindo a entidade por muito tempo.*\n");
		System.out.println("------------------------------------------------------------------------------------\n");
	}

	public static void sair() {
		System.err.println("------------------------------------------------------------------------------------");
		System.err.println("                   _      ");
		System.err.println("                  (_)     ");
		System.err.println("         ___  __ _ _ _ __ ");
		System.err.println("        / __|/ _` | | '__|");
		System.err.println("        \\__ \\ (_| | | |   ");
		System.err.println("        |___/\\__,_|_|_|   ");
		System.err.println("  *_______________________________*");
		System.err.println("  |  * Você escolheu desistir *   |");
		System.err.println("  |   * da torre dos desafios *   |");
		System.err.println("  | * Estude até conseguir sair * |");
		System.err.println("  *_______________________________*");
		System.err.println("------------------------------------------------------------------------------------");
	}

	public static void credits() {
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("   _____       __     _ _ _            ");
		System.out.println("  / ____|     /_/    | (_) |           ");
		System.out.println(" | |     _ __ ___  __| |_| |_ ___  ___ ");
		System.out.println(" | |    | '__/ _ \\/ _` | | __/ _ \\/ __|");
		System.out.println(" | |____| | |  __/ (_| | | || (_) \\__ \\");
		System.out.println("  \\_____|_|  \\___|\\__,_|_|\\__\\___/|___/");
		System.out.println("\n");
		System.out.println("        *________________________________*");
		System.out.println("        |                                |");
		System.out.println("        |  * -  Murilo A. de Araujo - *  |");
		System.out.println("        |                                |");
		System.out.println("        *________________________________*");
		System.out.println("------------------------------------------------------------------------------------");
	}

	public static void menu(String name) {
		System.out.println("   *________ Menu ________*");
		System.out.println("   |                      |");
		System.out.println("   |  1 - Instruções - 1  |");
		System.out.println("   |  2 -  Créditos  - 2  |");
		System.out.println("   |  3 -    Jogar   - 3  |");
		System.out.println("   |  4 -     Sair   - 4  |");
		System.out.println("   |                      |");
		System.out.println("   *______________________*");
		System.out.println("Escolha uma das opções acima, " + name);
	}

	public static void verify(int questIndex, String quest[], String explanation[], String indiceResposta,String answer[]) {
		if (indiceResposta.equalsIgnoreCase(answer[questIndex])) {
			System.out.println("Resposta Certa");
			ProjetoPI_4.right();
			System.out.println();
		} else {
			System.out.println("Resposta Errada");
			System.out.println(explanation[questIndex]);
			ProjetoPI_4.wrong();
			System.out.println();
		}
	}

	public static void right() {
		ProjetoPI_4.points += 1;
		System.out.println("Você está com : " + ProjetoPI_4.points + " Pontos.");
		ProjetoPI_4.gameover();
	}

	public static void wrong() {
		if (ProjetoPI_4.points >= 1) {
			ProjetoPI_4.points -= 1;
			System.out.println("Você está com : " + ProjetoPI_4.points + " Pontos.");
			ProjetoPI_4.gameover();
		}
	}

	public static void gameover() {
		if (ProjetoPI_4.points == 0) {
			System.err.println("  ____   ____  ___ ___    ___       ___   __ __    ___  ____  \r\n"
					+ " /    | /    ||   |   |  /  _]     /   \\ |  |  |  /  _]|    \\ \r\n"
					+ "|   __||  o  || _   _ | /  [_     |     ||  |  | /  [_ |  D  )\r\n"
					+ "|  |  ||     ||  \\_/  ||    _]    |  O  ||  |  ||    _]|    / \r\n"
					+ "|  |_ ||  _  ||   |   ||   [_     |     ||  :  ||   [_ |    \\ \r\n"
					+ "|     ||  |  ||   |   ||     |    |     | \\   / |     ||  .  \\\r\n"
					+ "|___,_||__|__||___|___||_____|     \\___/   \\_/  |_____||__|\\_|\r\n"
					+ "                                                              ");
		} else if (ProjetoPI_4.points <= 1) {
			System.out.println("Essa á sua ultima chance, pensa direito na resposta!");
		} else if (ProjetoPI_4.points <= 2) {
			System.out.println("Infelizmente você não está indo bem, mas não desista continue tentando!");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int questIndex;
		String indiceResposta = "";

		String quest[] = new String[11]; // Array de perguntas
		String answer[] = new String[11]; // Array de respostas
		String explanation[] = new String[11]; // Array com a explicação da resposta
		Boolean used[] = new Boolean[11]; // Utilizada no metodo de sorteio para saber qual pergunta foi usada ou n�o

		quest[0] = "Como podemos escrever no console do navegador usando JavaScript , marque qual comando devemos usar: \n\n"

				+ "a - console.log();\n" + "b - System.out.println();\n" + "c - write.log();\n" + "d - echo();\n"
				+ "e - Nenhuma das alternativas anteriores est�o corretas.";

		answer[0] = "a";

		explanation[0] = "FEEDBACK: A maneira correta de imprimir uma mensagem no console do navegador é usando codigo console.log() \n";

		quest[1] = "Em relação a criar uma variavel do tipo inteiro em linguagens com tipagem estatica, marque a alternativa CORRETA: \n\n"

				+ "a - double nomeDaVariavel = 3;\n" + "b - int nomeDaVariavel = 3;\n"
				+ "c - float nomeDaVariavel = 3;\n" + "d - final int nomeDaVariavel = 3;\n"
				+ "e - Nenhuma das alternativas anteriores est�o corretas.";

		answer[1] = "b";

		explanation[1] = "FEEDBACK: O tipo primitivo utilizado para criar uma variavel inteira é o tipo INT ou em alguns casos Integer dependendo da linguagem,\n"
				+ "caso seja uma linguagem de tipagem dinamica n precisamos definir seu tipo. \n";

		quest[2] = "JAVA é uma linguagem de programação que pode ser usada para que meios"
				+ ", marque a alternativa CORRETA: \n\n"

				+ "a - Para Desktop;\n" + "b - Para Mobile;\n" + "c - Todas as Alternativas estão corretas;\n"
				+ "d - Para Web;\n";

		answer[2] = "c";

		explanation[2] = "FEEDBACK: JAVA é uma linguagem bem versatil assim podendo ser usada em varios meios tendo tanto sua parte desktop, mobile e web";

		quest[3] = "Em relação ao tipo primitivo boolean, marque a alternativa CORRETA: \n\n"

				+ "a - Armazena uma variavel de qualquer tipo.\n" + "b - Esse tipo primitivo não existe em JAVA.\n"
				+ "c - Armazena um numero, porêm apenas numero inteiros.\n" + "d - Só pode armazenar true ou false.\n"
				+ "e - Pode conter tanto palavras quanto numeros.";

		answer[3] = "d";

		explanation[3] = "FEEDBACK: O tipo boolean é um tipo primitivo que armazana true ou false.\n";

		quest[4] = "Qual dos exemplos a seguir mostra a maneira mais CORRETA de se criar uma Constante na especificação ecma do javascript: \n\n"

				+ "a - final NOMEDACONSTANTE = 3;\n" + "b - let nomeDaConstante = 3;\n"
				+ "c - const nomeDaConstante = 3;\n" + "d - var NOMEDACONSTANTE = 3;\n"
				+ "e - não é possivel criar constantes em JavaScript.";

		answer[4] = "c";

		explanation[4] = "FEEDBACK: Uma constante deve ser criada utilizando utilizando a palavra reservada const, que se torna uma variavel que não podeser alterada \n"
				+ "ou retribuída mas isso não significa que o valor é imutavel.";

		quest[5] = "Qual das alternativas a seguir NÃO é uma Estrutura de Decisão: \n\n"

				+ "a - Estrutura if() e else.\n" + "b - Estrutura switch-case.\n" + "c - Estrutura do-while().\n"
				+ "d - Estrutura if().\n" + "e - Todas as Alternativas estão corretas.";

		answer[5] = "c";

		explanation[5] = "FEEDBACK: Apenas a Estrutura do-while não é uma estrutura de decisão, já que a estrutura do-while é uma estrutura de repetição,"
				+ "ou seja, executa um trecho de codigo por uma quantidade de vezes determinada ou indeterminada, ou até que uma codição especifica"
				+ "ocorra.\n";

		quest[6] = "As estruturas de controle de fluxo WHILE e DO...WHILE possuem a mesma finalidade e seus respectivos blocos de\n"
				+ " comandos são executados pelo menos uma vez em cada uma delas.\n\n"

				+ "a - Sim, tanto WHILE quanto DO...WHILE executam pelo menos uma vez o codigo.\n"
				+ "b - Sim, o tanto o WHILE quanto DO...WHILE tem a finalidade exatamente igual.\n"
				+ "c - Não, Somente no caso do DO...WHILE o codigo será executado pelo menos uma vez.\n"
				+ "d - Não, tanto no caso do WHILE quanto no caso do DO...WHILE o codigo pode não ser executado nenhuma vez.\n"
				+ "e - Nenhuma das alternativas anteriores estão corretas.";

		answer[6] = "c";

		explanation[6] = "FEEDBACK: A diferença da estrutura de repetição DO...WHILE para outras estruturas como o WHILE ou FOR,"
				+ " é que o codigo será executado no mínimo uma única vez.\n";

		quest[7] = "Como mostramos um alerta no navegador do usuario usando JavaScript \n\n"

				+ "a - alert().\n" + "b - Alerta().\n" + "c - Danger().\n" + "d - Console.log().\n"
				+ "e - Todas as Alternativas estão incorretas.";

		answer[7] = "a";

		explanation[7] = "FEEDBACK: O alert() exibe um alerta na tela do usuario mostrando uma mensagem da escolha do programador podendo ser um erro ou alguma mensagem.\n";

		quest[8] = "Em relação a estruturas de decisão, marque a alternativa CORRETA: \n\n"

				+ "a - São utilizadas para executar, repetidamente, uma instrução ou bloco de instrução "
				+ "enquanto determinada condição estiver sendo satisfeita.\n"
				+ "b - As estruturas de decisão são utilizadas para controlar o fluxo de execução do codigo.\n"
				+ "c - Tanto a Alternativa A quanto a alternativa B estão corretas.\n"
				+ "d - Existem somente 2 tipos de estruturas de decisão IF e IF-ELSE.\n"
				+ "e - Todas as Alternativas estão incorretas.";

		answer[8] = "b";

		explanation[8] = "FEEDBACK: As estruturas de decisão são utilizadas para controlar o fluxo de um codigo, para isso devemos criar condiçães que caso\n"
				+ "ocorra fará com que o codigo siga um caminho, caso não ocorra o codigo seguirá outro caminho.\n";

		quest[9] = "Em relação a estruturas de repetição, marque a alternativa CORRETA \n\n"

				+ "a - São utilizadas para executar, repetidamente, uma instrução ou bloco de instrução "
				+ "enquanto determinada condição estiver sendo satisfeita.\n"
				+ "b - As estruturas de repetição são utilizadas para controlar o fluxo de execução dos aplicativos.\n"
				+ "c - Tanto a Alternativa A quanto a alternativa B estão corretas.\n"
				+ "d - Existem somente 2 tipos de estruturas de repetição FOR e WHILE.\n"
				+ "e - Todas as Alternativas estão incorretas.";

		answer[9] = "a";

		explanation[9] = "FEEDBACK: As estruturas de repetição são utilizadas quando queremos repetir mais de uma vez um mesmo trecho de codigo, essa repetição\n"
				+ "ocorre até que uma condição pré-estipulada estiver sendo satisfeita.\n";

		quest[10] = "O que são Arrays e Matrizes? \n\n"

				+ "a - São objetos de recipientes que contêm um número fixo de valores de um único tipo.\n"
				+ "b - São objetos de recipientes que contêm um número fixo de valores de varios tipos diferentes.\n"
				+ "c - São sinonimos de funcões ou metodos.\n"
				+ "d - São objetos de recipientes que contêm um número variavel de valores de um único tipo.\n"
				+ "e - Todas as Alternativas estão incorretas.";

		answer[10] = "a";

		explanation[10] = "FEEDBACK: Arrays ou Matrizes são recipientes de um unico tipo (ex: int / double / String...) que armazena um numero\n"
				+ "pré determinado de valor, ou seja, o seu comprimento é fixo.\n";

		for (int i = 0; i <= 10; i++) {
			used[i] = false;
		}
		System.out.println(
				"*____________________________ BEM VINDO A MANSÂO DOS DESAFIOS __________________________________*");
		System.out.println("Você acaba de entrar na Mansão dos Desafios, boa sorte!");
		System.out.println(
				"Essa será uma aventura perigosa e eu vou acompanha-lo, mas antes de começar vou fazer algumas perguntas...\n");
		System.out.println("Qual o seu nome jogador?");
		String name = sc.next();
		System.out.println("\n" + name + "? Ok, não é lá essas coisas né?! mas paciência, cada um tem o nome que merece.\n");
		System.out.println("E de qualquer forma, prazer em te conhecer " + name + "!");
		System.out.println("O meu nome Ribeirin, e sim, eu sei que meu nome é muito bom.\n");
		System.out.println(
				"Essa aventura consiste em testar o seus conhecimentos, e de acordo com o seu desempenho você poderá escapar e ir para casa. \n");
		System.out.println(
				"Por outro lado, caso você não tenha estudado o suficiente e não passe pelos desafios tentarei te dar uma maozinha, na medida do possivel.\n");
		System.out.println(
				"Mas caso nem com minha ajuda você não consiga passar pelos desafios ficara preso aqui com a entidade como eu fiquei.\n");
		System.out.println("A cada resposta que você não souber e errar, te ajudarei com o feedback da questão.");
		System.out.println("Bom, chega de blá-blá-blá, vamos começar, " + name + "?\n");
		String querComecar = sc.next();

		if (querComecar.equalsIgnoreCase("Sim") || querComecar.equalsIgnoreCase("Vamos")
				|| querComecar.equalsIgnoreCase("Claro") || querComecar.equalsIgnoreCase("Bora")) {
			System.out.println("Otimo, vamos começar " + name + "\n");

			int digitacao;
			String digitacaoresposta = "";

			do {
				ProjetoPI_4.menu(name);
				digitacao = sc.nextInt();

				switch (digitacao) {
					case (1):
						ProjetoPI_4.instructions();
						break;
					case (2):
						ProjetoPI_4.credits();
						break;
					case (3):
						System.out.println("       _                        ");
						System.out.println("      | |                       ");
						System.out.println("      | | ___   __ _  __ _ _ __ ");
						System.out.println("  _   | |/ _ \\ / _` |/ _` | '__|");
						System.out.println(" | |__| | (_) | (_| | (_| | |   ");
						System.out.println("  \\____/ \\___/ \\__, |\\__,_|_|");
						System.out.println("                __/ |           ");
						System.out.println("               |___/            ");
						System.out.println("\n");

						for (int i = 0; i <= 10;) {
							questIndex = sorteio();
							if (ProjetoPI_4.points <= 0) {
								break;
							}
							if (used[questIndex] == false) {
								used[questIndex] = true; // Insere "true" no indice da pergunta sorteada, para que
															// ela não seja sorteada novamente
								do {

									System.out.println(quest[questIndex]); // escreve no console a questão
																			// sorteada através do indice
									System.out.println("Resposta: ");
									indiceResposta = sc.next();

									digitacaoresposta = indiceResposta;
									switch (digitacaoresposta.toUpperCase()) { // chama um switch que para cada letra
																				// resposta verifica de acordo com a
																				// pergunta se esta correta
																				// ou errada

										case ("A"):
											i++;

											ProjetoPI_4.verify(questIndex, quest, explanation, indiceResposta, answer);

											break;

										case ("B"):

											i++;

											ProjetoPI_4.verify(questIndex, quest, explanation, indiceResposta, answer);

											break;

										case ("C"):
											i++;

											ProjetoPI_4.verify(questIndex, quest, explanation, indiceResposta, answer);

											break;

										case ("D"):
											i++;

											ProjetoPI_4.verify(questIndex, quest, explanation, indiceResposta, answer);

											break;
										case ("E"):
											i++;

											ProjetoPI_4.verify(questIndex, quest, explanation, indiceResposta, answer);

											break;
										default:
											while (!(indiceResposta.equalsIgnoreCase("A")
													|| indiceResposta.equalsIgnoreCase("B")
													|| indiceResposta.equalsIgnoreCase("C")
													|| indiceResposta.equalsIgnoreCase("D")
													|| indiceResposta.equalsIgnoreCase("E"))) {

												System.out.println("Digite uma alternativa valida."); // caso o jogador
																										// responda uma
																										// alternativa
																										// invalida
												indiceResposta = sc.next(); // ficará no loop até que dê uma
																			// resposta valida

											}
											ProjetoPI_4.verify(questIndex, quest, explanation, indiceResposta, answer);
											break;
									}
									break;

								} while (digitacaoresposta.equalsIgnoreCase("A")
										|| digitacaoresposta.equalsIgnoreCase("B")
										|| digitacaoresposta.equalsIgnoreCase("C")
										|| digitacaoresposta.equalsIgnoreCase("D")
										|| digitacaoresposta.equalsIgnoreCase("E"));
							}
						}
						System.out.println("Voc terminou com o placar final de: " + ProjetoPI_4.points + " Pontos.\n");
						if (points >= 8) {
							System.out.println("Estou impressionado com seu conhecimento " + name
									+ ", você é o maior NERD de todos!\n");
							System.out.println(
									"Brincadeiras a parte, você foi muito bem e agora poderá fugir da mansão e ir para a sua casa.\n");
							System.out.println(
									"Mas cuidado a entidade pode ficar entediada de novo e te trazer de volta, Adeus hahahaha. "
											+ name + "!");
						} else if (points >= 6) {
							System.out.println("Parabens " + name
									+ ", você conseguiu responder as minhas perguntas e atingiu a pontuação necessaria!\n");
							System.out.println(
									"Eu sou um cara de palavra, e como combinado a entidade deixara você sair da mansão e ir para sua casa agora.\n");
							System.out.println(
									"Mas cuidado a entidade pode ficar entediada de novo e te trazer de volta então trate de estudar mais, Adeus hahahaha. "
											+ name + "!");
						} else if (points >= 4) {
							System.out.println("Bom " + name
									+ ", você nâo foi tão bem nos testes de conhecimento, talvez por falta de estudo \n");
							System.out.println(
									"Mas de qualquer forma você respondeu todas as questões e aprendeu com os feedbacks das questões que errou, certo?!\n");
							System.out.println(
									"Conversei com a Entidade e concordamos que você poderia sair dessa torre hoje com uma condição, a qualquer momento você voltara pra ca!");
							System.out.println(
									"Então trate de estudar mais pois na proxima caso vc falhe não saira daqui nunca! Adeus");
						} else {
							System.out.println("Bom " + name
									+ ", você foi bem ruim nos testes de conhecimento, talvez por falta de estudo, talvez pela falta de atenção \n");
							System.out.println(
									"Mas de qualquer forma você aprendeu com os feedbacks das questões que errou, certo?!\n");
							System.out.println("E infelizmente você ficara preso aqui comigo por mais tempo!\n");
							System.out.println(
									"Ficará estudando e treinando pra talvez no futuro tentar novamente sair desta mansão.!\n");
							System.out.println("Então chega de papo e vá estudar mais, " + name + "!");
						}
						break;
					case (4):
						ProjetoPI_4.sair();
						points = 0;
						break;
					default:
						System.out.println("Digite uma opção valida, " + name);
						break;
				}
			} while (digitacao != 1 ^ digitacao != 3);

			sc.close();

		} else if (querComecar.equalsIgnoreCase("Não") || querComecar.equalsIgnoreCase("nao")) {
			System.out.println("Então deixamos para uma outra vez, Obrigado " + name);
		} else {
			System.out.println("Não entendi a sua resposta, pelo jeito não quer jogar, FIM DE JOGO!");
		}

	}

}

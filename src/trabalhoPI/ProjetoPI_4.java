/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoPI;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Murilo
 */
public class ProjetoPI_4 {
    static int placarDePontuacao = 5;

	public static int sorteio() {
		Random sorteio = new Random();
		int indicePergunta = sorteio.nextInt(14); // metodo que  sorteia as perguntas de acordo com os indices dos arrays criados.

		return indicePergunta;
	}
        
	public static void instrucoes() {
		System.out.println("\n");
		System.out.println("       _____           _                   /\\/|           ");
		System.out.println("      |_   _|         | |                 |/\\/            ");
		System.out.println("        | |  _ __  ___| |_ _ __ _   _  ___ ___   ___  ___ ");
		System.out.println("        | | | '_ \\/ __| __| '__| | | |/ __/ _ \\ / _ \\/ __|");
		System.out.println("       _| |_| | | \\__ \\ |_| |  | |_| | (_| (_) |  __/\\__ \\");
		System.out.println("      |_____|_| |_|___/\\__|_|   \\__,_|\\___\\___/ \\___||___/");
		System.out.println("                                       )_)                ");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("* Um professor decide pumir um aluno que n�o se dedicava as suas aulas* \n"
				         + "* s� tirava notas medianas e n�o estudava em casa, debochava da facilidade* \n"
				         + "* das provas. Revoltado com essa atitude o professor criou uma torre tecnologica* \n"
				         + "* com varios desafios de algoritmos para seus alunos solucionarem e enquanto* \n"
				         + "* n�o solucionasse pelo menos 60% dos desafios com respostas corretas, eles* \n"
				         + "* n�o poder� sair da torre.*\n");
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
		System.err.println("  -----------------------------");
		System.err.println("  | * Voc� escolheu desistir *|");
		System.err.println("  |  * da torre Algoritmica * |");
		System.err.println("  |     * At� a proxima! *    |");
		System.err.println("  -----------------------------");
		System.err.println("------------------------------------------------------------------------------------");
	}
	
	public static void creditos() {
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("   _____       __     _ _ _            ");
		System.out.println("  / ____|     /_/    | (_) |           ");
		System.out.println(" | |     _ __ ___  __| |_| |_ ___  ___ ");
		System.out.println(" | |    | '__/ _ \\/ _` | | __/ _ \\/ __|");
		System.out.println(" | |____| | |  __/ (_| | | || (_) \\__ \\");
		System.out.println("  \\_____|_|  \\___|\\__,_|_|\\__\\___/|___/");
		System.out.println("\n");
		System.out.println("        |                                |");
		System.out.println("        |  * -  Murilo A. de Araujo - *  |");
		System.out.println("        |                                |");
		System.out.println("                  ------------------------");
		System.out.println("------------------------------------------------------------------------------------");
	}
        
	public static void menu(String nome) {
		System.out.println("   +-------- Menu --------+");
		System.out.println("   |                      |");
		System.out.println("   |  1 - Instru��es - 1  |");
		System.out.println("   |  2 -    Jogar   - 2  |");
		System.out.println("   |  3 -  Cr�ditos  - 3  |");
		System.out.println("   |  4 -    Sair    - 4  |");
		System.out.println("   |                      |");
		System.out.println("   +----------------------+");
		System.out.println("Escolha uma das Op��es, Jogador " + nome);
	}

	public static void verificar(int indicePergunta, String perguntas[], String explicacao[], String indiceResposta, String respostas[]) {
            if (indiceResposta.equalsIgnoreCase(respostas[indicePergunta])) {
		System.out.println("Resposta Certa");
		ProjetoPI_4.acertar();
		System.out.println();
            } else {
		System.out.println("Resposta Errada");
		System.out.println(explicacao[indicePergunta]);
		ProjetoPI_4.errar();
		System.out.println();
            }
	}

	public static void acertar() {
		if (ProjetoPI_4.placarDePontuacao <= 9) {
			ProjetoPI_4.placarDePontuacao += 1;
			System.out.println("Voc� est� com : " + ProjetoPI_4.placarDePontuacao + " Pontos.");
			ProjetoPI_4.gameover();
		}
	}

	public static void errar() {
		if (ProjetoPI_4.placarDePontuacao >= 1) {
			ProjetoPI_4.placarDePontuacao -= 1;
			System.out.println("Voc� est� com : " + ProjetoPI_4.placarDePontuacao + " Pontos.");
			ProjetoPI_4.gameover();
		}
	}

	public static void gameover() {
		if (ProjetoPI_4.placarDePontuacao == 0) {
		System.err.println("  ____   ____  ___ ___    ___       ___   __ __    ___  ____  \r\n" + 
				" /    | /    ||   |   |  /  _]     /   \\ |  |  |  /  _]|    \\ \r\n" + 
				"|   __||  o  || _   _ | /  [_     |     ||  |  | /  [_ |  D  )\r\n" + 
				"|  |  ||     ||  \\_/  ||    _]    |  O  ||  |  ||    _]|    / \r\n" + 
				"|  |_ ||  _  ||   |   ||   [_     |     ||  :  ||   [_ |    \\ \r\n" + 
				"|     ||  |  ||   |   ||     |    |     | \\   / |     ||  .  \\\r\n" + 
				"|___,_||__|__||___|___||_____|     \\___/   \\_/  |_____||__|\\_|\r\n" + 
				"                                                              ");

		} else if (ProjetoPI_4.placarDePontuacao <= 1) {
			System.out.println("Essa � sua ultima chance, pensa direito na resposta!");
		} else if (ProjetoPI_4.placarDePontuacao <= 2) {
			System.out.println("Infelizmente voc� n�o est� indo bem, mas n�o desista continue tentando!");
		}

	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int indicePergunta;
		String indiceResposta = "";

		String perguntas[] = new String[15]; // Armazena todas as perguntas
		String respostas[] = new String[15]; // Armazena todas as respostas corretas
		String explicacao[] = new String[15]; // Armazena os FeedBacks caso o jogador erre a quest�o
		Boolean usada[] = new Boolean[15]; // Utilizada no metodo de sorteio para saber qual pergunta foi usada ou n�o

		perguntas[0] = "Em rela��o a imprimir algo no console em JAVA , marque qual comando devemos usar: \n\n"
				
				+ "a - System.out.print();\n"
				+ "b - System.in.print();\n"
				+ "c - System.print();\n"
				+ "d - System.out.escreval();\n"
				+ "e - Nenhuma das alternativas anteriores est�o corretas.";

		respostas[0] = "a";

		explicacao[0] = "FEEDBACK: A maneira correta de imprimir uma mensagem no console � atrav�s do codigo System.out.print() "
				+ "/ System.out.println() ou System.out.printf(), cada melhor utilizado dependendo da finalidade. \n";

		perguntas[1] = "Em rela��o a criar uma variavel do tipo inteiro, marque a alternativa CORRETA: \n\n"

				+ "a - double nomeDaVariavel = 3;\n"
				+ "b - int nomeDaVariavel = 3;\n"
				+ "c - float nomeDaVariavel = 3;\n"
				+ "d - final int nomeDaVariavel = 3;\n"
				+ "e - Nenhuma das alternativas anteriores est�o corretas.";

		respostas[1] = "b";

		explicacao[1] = "FEEDBACK: O tipo primitivo utilizado para criar uma variavel inteira � o tipo INT.\n";

		perguntas[2] = "Em rela��o a criar uma variavel do tipo ponto flutuante com o MAIOR numero de casas decimais"
				+ ", marque a alternativa CORRETA: \n\n"

				+ "a - int nomeDaVariavel = 3;\n"
				+ "b - float nomeDaVariavel = 3;\n"
				+ "c - double nomeDaVariavel = 3;\n"
				+ "d - final int nomeDaVariavel = 3;\n"
				+ "e - Nenhuma das alternativas anteriores est�o corretas.";

		respostas[2] = "c";

		explicacao[2] = "FEEDBACK: O tipo primitivo utilizado para criar uma variavel ponto flutuante pode ser tanto FLOAT, quanto"
				+ "double, dependendo da precis�o requerida,\n ou seja, com o double conseguimos um maior numero de casas decimais"
				+ "e assim uma maior precis�o.\n";

		perguntas[3] = "Em rela��o ao tipo primitivo boolean, marque a alternativa CORRETA: \n\n"

				+ "a - Armazena uma variavel de qualquer tipo.\n"
				+ "b - Esse tipo primitivo n�o existe em JAVA.\n"
				+ "c - Armazena um numero, por�m apenas numero inteiros.\n"
				+ "d - S� pode armazenar true ou false.\n"
				+ "e - Pode conter tanto palavras quanto numeros.";

		respostas[3] = "d";

		explicacao[3] = "FEEDBACK: O tipo boolean � um tipo primitivo que armazana true ou false.\n";

		perguntas[4] = "Qual dos exemplos a seguir mostra a maneira mais CORRETA de se criar uma Constante: \n\n"

				+ "a - const nomeDaConstante = 3;\n"
				+ "b - final nomeDaConstante = 3;\n"
				+ "c - final NOMEDACONSTANTE = 3;\n"
				+ "d - const NOMEDACONSTANTE = 3;\n"
				+ "e - n�o � possivel criar constantes em JAVA.";

		respostas[4] = "c";

		explicacao[4] = "FEEDBACK: Uma constante deve ser criada utilizando utilizando a palavra reservada final, por conven��o usamos letras mai�sculas\n"
				+ "para declarar constantes e assim distingui-las das variaveis.\n";

		perguntas[5] = "As estruturas de controle de fluxo WHILE e DO...WHILE possuem a mesma finalidade e seus respectivos blocos de\n"
				+ " comandos s�o executados pelo menos uma vez em cada uma delas.\n\n"

				+ "a - Sim, tanto WHILE quanto DO...WHILE executam pelo menos uma vez o codigo.\n"
				+ "b - Sim, o tanto o WHILE quanto DO...WHILE tem a finalidade exatamente igual.\n"
				+ "c - N�o, Somente no caso do DO...WHILE o codigo ser� executado pelo menos uma vez.\n"
				+ "d - N�o, tanto no caso do WHILE quanto no caso do DO...WHILE o codigo pode n�o ser executado nenhuma vez.\n"
				+ "e - Nenhuma das alternativas anteriores est�o corretas.";
		
		respostas[5] = "c";

		explicacao[5] = "FEEDBACK: A diferen�a da estrutura de repeti��o DO...WHILE para outras estruturas como o WHILE ou FOR,"
				+ " � que o codigo ser� executado no m�nimo uma �nica vez.\n";

		perguntas[6] = "Qual das alternativas a seguir N�O � uma Estrutura de Decis�o: \n\n"

				+ "a - Estrutura if() e else.\n"
				+ "b - Estrutura switch-case.\n"
				+ "c - Estrutura do-while().\n"
				+ "d - Estrutura if().\n"
				+ "e - Todas as Alternativas est�o corretas.";

		respostas[6] = "c";

		explicacao[6] = "FEEDBACK: Apenas a Estrutura do-while n�o � uma estrutura de decis�o, j� que a estrutura do-while � uma estrutura de repeti��o,"
				+ "ou seja, executa um trecho de codigo por uma quantidade de vezes determinada ou indeterminada, ou at� que uma codi��o especifica"
				+ "ocorra.\n";

		perguntas[7] = "Qual das alternativas a seguir � uma Estrutura de Repeti��o: \n\n"

				+ "a - Estrutura do-while().\n"
				+ "b - Estrutura if() e else.\n"
				+ "c - Estrutura switch-case.\n"
				+ "d - Estrutura if().\n"
				+ "e - Todas as Alternativas est�o incorretas.";

		respostas[7] = "a";

		explicacao[7] = "FEEDBACK: Apenas a estrutura do-while � uma estrutura de repeti��o, todas as outras alternativas s�o estruturas de decis�o\n";

		perguntas[8] = "Em rela��o a estruturas de repeti��o, marque a alternativa CORRETA \n\n"

				+ "a - S�o utilizadas para executar, repetidamente, uma instru��o ou bloco de instru��o "
				+ "enquanto determinada condi��o estiver sendo satisfeita.\n"
				+ "b - As estruturas de repeti��o s�o utilizadas para controlar o fluxo de execu��o dos aplicativos.\n"
				+ "c - Tanto a Alternativa A quanto a alternativa B est�o corretas.\n"
				+ "d - Existem somente 2 tipos de estruturas de repeti��o FOR e WHILE.\n"
				+ "e - Todas as Alternativas est�o incorretas.";

		respostas[8] = "a";
		
		explicacao[8] = "FEEDBACK: As estruturas de repeti��o s�o utilizadas quando queremos repetir mais de uma vez um mesmo trecho de codigo, essa repeti��o\n"
				+ "ocorre at� que uma condi��o pr�-estipulada estiver sendo satisfeita.\n";

		perguntas[9] = "Em rela��o a estruturas de decis�o, marque a alternativa CORRETA: \n\n"

				+ "a - S�o utilizadas para executar, repetidamente, uma instru��o ou bloco de instru��o "
				+ "enquanto determinada condi��o estiver sendo satisfeita.\n"
				+ "b - As estruturas de decis�o s�o utilizadas para controlar o fluxo de execu��o do codigo.\n"
				+ "c - Tanto a Alternativa A quanto a alternativa B est�o corretas.\n"
				+ "d - Existem somente 2 tipos de estruturas de decis�o IF e IF-ELSE.\n"
				+ "e - Todas as Alternativas est�o incorretas.";

		respostas[9] = "b";

		explicacao[9] = "FEEDBACK: As estruturas de decis�o s�o utilizadas para controlar o fluxo de um codigo, para isso devemos criar condi��es que caso\n"
				+ "ocorra far� com que o codigo siga um caminho, caso n�o ocorra o codigo seguir� outro caminho.\n";

		perguntas[10] = "O que s�o Arrays e Matrizes? \n\n"

				+ "a - S�o objetos de recipientes que cont�m um n�mero fixo de valores de um �nico tipo.\n"
				+ "b - S�o objetos de recipientes que cont�m um n�mero fixo de valores de varios tipos diferentes.\n"
				+ "c - S�o sinonimos de func�es ou metodos.\n"
				+ "d - S�o objetos de recipientes que cont�m um n�mero variavel de valores de um �nico tipo.\n"
				+ "e - Todas as Alternativas est�o incorretas.";
		
		respostas[10] = "a";

		explicacao[10] = "FEEDBACK: Arrays ou Matrizes s�o recipientes de um unico tipo (ex: int / double / String...) que armazena um numero\n"
				+ "pr� determinado de valor, ou seja, o seu comprimento � fixo.\n";

		perguntas[11] = "Qual sintaxe para se declarar um Array em Java est� incorreta? \n\n"

				+ "a - String nomeDoArray[] = new String[comprimento];. \n"
				+ "b - String[] nomeDoArray = new String[comprimento];.\n"
				+ "c - int nomeDoArray = new String[comprimento].\n"
				+ "d - int nomeDoArray[] = {3,5,8,12,25};.\n"
				+ "e - Todas as Alternativas est�o corretas.";
		
		respostas[11] = "c";
		
		explicacao[11] = "FEEDBACK: Para criarmos um arrays existem dois tipos de sintaxe: String nomeDoArray[] = new String[comprimento] ou int nomeDoArray[] = {3,5,8,12,25}"
				+ "sendo ambas corretas.\n";

		perguntas[12] = "Quais a maneira de percorrer Arrays sem a possibilidade de altera-los? \n\n"

				+ "a - for(par�metro: nomeDoArray) { intru��es} \n"
				+ "b - while(nomeDoArray){instru��es} \n"
				+ "c - for(nomeDoArray){instru��es} \n"
				+ "d - while(par�metro: nomeDoArray){instru��es} \n"
				+ "e - Todas as Alternativas est�o corretas.";

		respostas[12] = "a";

		explicacao[12] = "FEEDBACK: A maneira com a sintaxe mais simples � utilizando o for aprimorado, conhecido tambem como foreach, ele serve para"
				+ "obter elementos de um array sem alter�-los. A sintaxe � simples, primeiro se coloca o tipo com um identificador(par�metro)"
				+ "depois se colocada o nome do array anteriormente criado, ap�s isso coloca-se as instru��es desejadas.\n";

		perguntas[13] = "Qual a sintaxe correta para se criar uma fun��o sem argumento? \n\n"

				+ "a - public static int nomeDaFun��o (int argumento) { c�digo da fun��o } return; \n"
				+ "b - public static int nomeDaFun��o () { c�digo da fun��o } \n"
				+ "c - nomeDaFun��o () { c�digo da fun��o } \n"
				+ "d - public static void nomeDaFun��o () { c�digo da fun��o } \n"
				+ "e - Todas as Alternativas est�o corretas.";

		respostas[13] = "d";
		explicacao[13] = "FEEDBACK: Quando queremos criar uma fun��o que n�o retorna nada, uma fun��o que apenas executa uma rotina, portanto, n�o recebe"
				+ "nenhum argumento, a sintaxe mais correta � : public static void nomeDaFun��o () { c�digo da fun��o };\n";

		perguntas[14] = "Qual a sintaxe correta para se criar uma fun��o que retorna um valor? \n\n"

				+ "a - public static int nomeDaFun��o () { c�digo da fun��o } \n"
				+ "b - public static int nomeDaFun��o (int argumento) { c�digo da fun��o } return; \n"
				+ "c - nomeDaFun��o () { c�digo da fun��o } \n"
				+ "d - public static void nomeDaFun��o () { c�digo da fun��o } \n"
				+ "e - Todas as Alternativas est�o corretas.";

		respostas[14] = "b";
		explicacao[14] = "FEEDBACK: Para criar uma fun��o que retorna valores temos que nos ater ao fato retorno, representado pela palavra reservada return,"
				+ "o comando return finaliza a fun��o e mostra o retorno que � do tipo declarado na fun��o.\n";

		for (int i = 0; i <= 14; i++) {
			usada[i] = false;
		}
		System.out.println(
				"---------------------------- BEM VINDO A TORRE ALGORITMICA ----------------------------------------");
		System.out.println("Voc� acaba de entrar na Torre Algoritmica, boa sorte!");
		System.out.println(
				"Essa ser� a maior aventura da sua vida e eu vou acompanha-lo, mas antes de come�a fazer algumas perguntas...\n");
		System.out.println("Me diga o seu nome jogador misterioso?");
		String nome = entrada.next();
		System.out.println(
				nome + "? credo, n�o � um nome muito bom n�?! mas paci�ncia, cada um tem o nome que merece n�?\n");
		System.out.println("E de qualquer forma, prazer em te conhecer " + nome + "!");
		System.out.println("O meu nome Javacson, e sim, eu sei que n�o � um nome muito bom tambem.\n");
		System.out.println(
				"Essa aventura consiste em testar o seus conhecimentos, e de acordo com o seu desempenho voc� poder� sair e ir para casa. \n");
		System.out.println(
				"Por outro lado, caso voc� n�o tenha estudado o suficiente e n�o passe pelos desafios tentarei te ajudar, na medida do possivel.\n");
		System.out.println("A cada resposta que voc� n�o souber e errar, te ajudarei com o feedback da quest�o.");
		System.out.println("Bom, chega de bl�-bl�-bl�, vamos come�ar, " + nome + "?");
		String querComecar = entrada.next();

		if (querComecar.equalsIgnoreCase("Sim") || querComecar.equalsIgnoreCase("Vamos")
				|| querComecar.equalsIgnoreCase("Claro") || querComecar.equalsIgnoreCase("Bora")) {
			System.out.println("Otimo, vamos come�ar " + nome);

			int digitacao;
			String digitacaoresposta = "";

			do {
				ProjetoPI_4.menu(nome);
				digitacao = entrada.nextInt();

				switch (digitacao) {
				case (1):
					ProjetoPI_4.instrucoes();
					break;
				case (2):
					System.out.println("       _                        ");
					System.out.println("      | |                       ");
					System.out.println("      | | ___   __ _  __ _ _ __ ");
					System.out.println("  _   | |/ _ \\ / _` |/ _` | '__|");
					System.out.println(" | |__| | (_) | (_| | (_| | |   ");
					System.out.println("  \\____/ \\___/ \\__, |\\__,_|_|   ");
					System.out.println("                __/ |           ");
					System.out.println("               |___/            ");
					System.out.println("\n");

					for (int i = 0; i <= 10;) {
						indicePergunta = sorteio();
						if (ProjetoPI_4.placarDePontuacao <= 0) {
							break;
						}
						if (usada[indicePergunta] == false) {
							usada[indicePergunta] = true; // Insere "true" no indice da pergunta sorteada, para que ela n�o seja sorteada novamente
							do {

								System.out.println(perguntas[indicePergunta]); // escreve no console a quest�o sorteada atrav�s do indice
								System.out.println("Resposta: ");
								indiceResposta = entrada.next();

								digitacaoresposta = indiceResposta;
								switch (digitacaoresposta.toUpperCase()) {

								case ("A"):
									i++;

									ProjetoPI_4.verificar(indicePergunta, perguntas, explicacao, indiceResposta,
											respostas);

									break;

								case ("B"):

									i++;

									ProjetoPI_4.verificar(indicePergunta, perguntas, explicacao, indiceResposta,
											respostas);

									break;

								case ("C"):
									i++;

									ProjetoPI_4.verificar(indicePergunta, perguntas, explicacao, indiceResposta,
											respostas);

									break;

								case ("D"):
									i++;

									ProjetoPI_4.verificar(indicePergunta, perguntas, explicacao, indiceResposta,
											respostas);

									break;
								case ("E"):
									i++;

									ProjetoPI_4.verificar(indicePergunta, perguntas, explicacao, indiceResposta,
											respostas);

									break;
								default:
									while (!(indiceResposta.equalsIgnoreCase("A")
											|| indiceResposta.equalsIgnoreCase("B")
											|| indiceResposta.equalsIgnoreCase("C")
											|| indiceResposta.equalsIgnoreCase("D")
											|| indiceResposta.equalsIgnoreCase("E"))) {

										System.out.println("Digite uma alternativa valida.");  // caso o jogador responda uma alternativa invalida
										indiceResposta = entrada.next();                       // ficar� no loop at� que d� uma resposta valida

									}
									ProjetoPI_4.verificar(indicePergunta, perguntas, explicacao, indiceResposta,
											respostas);
									break;
								}
								break;

							} while (digitacaoresposta.equalsIgnoreCase("A") || digitacaoresposta.equalsIgnoreCase("B")
									|| digitacaoresposta.equalsIgnoreCase("C")
									|| digitacaoresposta.equalsIgnoreCase("D")
									|| digitacaoresposta.equalsIgnoreCase("E"));
						}
					}
					System.out.println(
							"Voc� terminou com o placar final de: " + ProjetoPI_4.placarDePontuacao + " Pontos.\n");
					if (placarDePontuacao >= 8) {
						System.out.println("Estou impressionado com a sua pontua��o " + nome
								+ ", depois de mim, voc� � o maior NERD de todos!\n");
						System.out.println(
								"Brincadeiras a parte, voc� foi muito bem e agora poder� sair da torre e ir para a sua casa.\n");
						System.out.println(
								"Mas volte qualquer dia desses para a gente conversar e colocar o papo em dia, Adeus "
										+ nome + "!");
					} else if (placarDePontuacao >= 6) {
						System.out.println("Parabens " + nome
								+ ", voc� conseguiu responder as minhas perguntas e atingiu a pontua��o necessaria!\n");
						System.out.println(
								"Eu sou um cara de palavra, e como combinado deixarei voc� sair da torre e ir para sua casa agora.\n");
						System.out.println(
								"Mas volte qualquer dia desses para a gente testar novamente seus conhecimentos, Adeus "
										+ nome + "!");
					} else if (placarDePontuacao >= 4) {
						System.out.println("Bom " + nome
								+ ", voc� n�o foi t�o bem nos testes de conhecimento, talvez por falta de estudo, talvez pela falta de aten��o \n");
						System.out.println(
								"Mas de qualquer forma voc� respondeu todas as quest�es e aprendeu com os feedbacks das quest�es que errou, certo?!\n");
						System.out.println(
								"Conversei com o Pythocnilson e concordamos que voc� poderia sair dessa torre hoje com uma condi��o, ESTUDAR MAIS!");
						System.out.println(
								"Ent�o volte qualquer dia desses para a gente testar novamente seus conhecimentos, Adeus "
										+ nome + "!");
					} else {
						System.out.println("Bom " + nome
								+ ", voc� foi bem ruim nos testes de conhecimento, talvez por falta de estudo, talvez pela falta de aten��o \n");
						System.out.println(
								"Mas de qualquer forma voc� aprendeu com os feedbacks das quest�es que errou, certo?!\n");
						System.out.println(
								"Conversei com o Pythocnilson e infelizmente voc� n�o poder� sair da torre hoje!\n");
						System.out.println(
								"Ficar� estudando e treinando pra talvez no futuro tentar novamente sair desta torre.!\n");
						System.out.println("Ent�o chega de papo e v� estudar mais, " + nome + "!");
					}
					break;
				case (3):
					ProjetoPI_4.creditos();
					break;
				case (4):
					ProjetoPI_4.sair();
					placarDePontuacao = 0;
					break;
				default:
					System.out.println("Digite uma op��o valida, " + nome);
					break;
				}
			} while (digitacao != 1 ^ digitacao != 3);

			entrada.close();

		} else if (querComecar.equalsIgnoreCase("N�o") || querComecar.equalsIgnoreCase("nao"))

		{
			System.out.println("Ent�o deixamos para uma outra vez, Obrigado " + nome);
		} else {
			System.out.println("N�o entendi a sua resposta, pelo jeito n�o quer jogar, FIM DE JOGO!");
		}

	}

}

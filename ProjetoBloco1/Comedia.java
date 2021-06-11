package ProjetoBloco1;

import java.util.Scanner;

public class Comedia extends Filme{
Scanner read = new Scanner(System.in);
	
	
	public Comedia(String nome, String categoria, int duracao, String classificacaoIndicativa, int momento, String descricao) 
	{
		super(nome, "Comedia", duracao, classificacaoIndicativa, momento, descricao);
		// TODO Auto-generated constructor stub
	}

		@Override
	
		public void efeitoVisual() {
			
			int n = (int) (Math.random()*4.0);
			
			switch(n)
			{
			case 0:
				System.out.println("    ,,,,,,,,,,,,,\r\n"
						+ "    .;;;;;;;;;;;;;;;;;;;,.\r\n"
						+ "  .;;;;;;;;;;;;;;;;;;;;;;;;,\r\n"
						+ ".;;;;;;;;;;;;;;;;;;;;;;;;;;;;.\r\n"
						+ ";;;;;@;;;;;;;;;;;;;;;;;;;;;;;;' .............\r\n"
						+ ";;;;@@;;;;;;;;;;;;;;;;;;;;;;;;'.................\r\n"
						+ ";;;;@@;;;;;;;;;;;;;;;;;;;;;;;;'...................\r\n"
						+ "`;;;;@;;;;;;;;;;;;;;;@;;;;;;;'.....................\r\n"
						+ " `;;;;;;;;;;;;;;;;;;;@@;;;;;'..................;....\r\n"
						+ "   `;;;;;;;;;;;;;;;;@@;;;;'....................;;...\r\n"
						+ "     `;;;;;;;;;;;;;@;;;;'...;.................;;....\r\n"
						+ "        `;;;;;;;;;;;;'   ...;;...............;.....\r\n"
						+ "           `;;;;;;'        ...;;..................\r\n"
						+ "              ;;              ..;...............\r\n"
						+ "              `                  ............\r\n"
						+ "             `                      ......\r\n"
						+ "            `                         ..\r\n"
						+ "           `                           '\r\n"
						+ "          `                           '\r\n"
						+ "         `                           '\r\n"
						+ "        `                           `\r\n"
						+ "        `                           `,\r\n"
						+ "        `\r\n"
						+ "         `\r\n"
						+ "           `.");
			break;
			
			case 1:
				System.out.println(  "a@@@@@@@@a  a@@@@@@a  a@@@@@@@a a@@@@@@@@a a@@a.  .a@@a  a@@a \r\n"
						            + "@@@@  @@@@ @@@@  @@@@ @@@@  @@@ @@@@@@@@@@ @@@@a  a@@@@  @@@@ \r\n"
						            + "@@@@  @@@@ @@@@  @@@@ @@@@  @@@    @@@@    `@@@@  @@@@'  @@@@ \r\n"
						            + "@@@@@@@@@@ @@@@@@@@@@ @@@@@@@@'    @@@@      `@@@@@@'    @@@@ \r\n"
						            + "@@@@@@@@@' @@@@@@@@@@ @@@@@@@@a    @@@@        @@@@      `@@' \r\n"
						            + "@@@@       @@@@  @@@@ @@@@ @@@@    @@@@        @@@@ \r\n"
						            + "@@@@       @@@@  @@@@ @@@@ @@@@    @@@@        @@@@       @@");
				
				break;
			case 2:
				System.out.println("     .---.\r\n"
						+ "           /-====)\r\n"
						+ "           | / '(\r\n"
						+ "          / /  _/\r\n"
						+ "          | |-(    _\r\n"
						+ "          / |  \\  //|\r\n"
						+ "         /  \\   \\/\\/\r\n"
						+ "        |    |\\   /\r\n"
						+ "        `-;./ ;-'\r\n"
						+ "          |    \\\r\n"
						+ "          |     \\\r\n"
						+ "        _/       |\r\n"
						+ "jgs .--/         /\r\n"
						+ "    `''---`-----`");
				
				
				break;
			default:	
				System.out.println("// \"\"--.._\r\n"
						           + "||  (_)  _ \"-._\r\n"
						           + "||    _ (_)    '-.\r\n"
						           + "||   (_)   __..-'\r\n"
						           + " \\\\__..--\"\"");
			}
		}
	
		@Override

		 public void mensagemInicio() {
			
			int n = (int) (Math.random()*4.0);
			
			switch(n)
			{
			case 0:
				System.out.println ("Ah, você está tendo um dia ruim. Por acaso você morreu? Então seu dia está ótimo.");
				break;
				
			case 1:
				System.out.println ("A vida em primeiro lugar é sempre emocionante.");
				break;
				
			case 2:
				System.out.println ("Jesus às vezes se disfarça de mendigo pra testar a bondade dos homens");
				break;
				
			default:	
				System.out.println ("Ambos precisam do que o outro tem. Isso os mantém unidos.");
			}
			
			}

}

package ProjetoBloco1;

public class TestePerfil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Perfil perfil1 = new Perfil ("Zinha ", 19, "zinha07@gmail.com", "Rua São Paulo, Número: 12", 998761235,
				"12345678900", "Master", "1234567891234567", "3 - Família", "zinhafofinha", "zinha12");
		
		perfil1.validarDados();
		
		perfil1.apresentarDados();
		
		perfil1.alterarEmail();
		
		perfil1.apresentarDados();

	}

}


public class Main {

	public static void main(String[] args) {
		
		
		Banco primeiroBanco = new Banco();
		primeiroBanco.setNome(" O primeiro banco");
		
		Cliente venilton = new Cliente(" Venilton", primeiroBanco);
		Conta cc = new ContaCorrente(venilton);
		cc.depositar(100);

		Cliente amanda = new Cliente(" Amanda", primeiroBanco);
		Conta poupanca = new ContaPoupança(amanda);
		// mostrar extrato apos transferir//
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		cc.transferir(75, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		primeiroBanco.mostrarClientes();
		
	}

}
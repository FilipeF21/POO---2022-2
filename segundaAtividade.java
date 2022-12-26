/*===========================================
 Disciplina: Programação Orientada a Objetos
 Professor: Sebastião Emidio Alves filho
 Aluno: Gabriel Filipe da Silva Fernandes
 ===========================================*/

import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class segundaAtividade {
	public static void main(String[] args) throws ParseException {
		String dataInicial = JOptionPane.showInputDialog("Informe a data(formato mês/dia/ano) ");
		
		SimpleDateFormat ordem = new SimpleDateFormat("MM/dd/yyyy"); 
		Date dataFinal = ordem.parse(dataInicial);
		ordem.applyPattern("MMMMM, dd, yyyy");
		
		System.out.println("Data inicial: ");
		System.out.println(dataInicial);
		System.out.println("\n");
		System.out.println("Data convertida: ");
		System.out.println(ordem.format(dataFinal));
	}
}
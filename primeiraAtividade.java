/*===========================================
 Disciplina: Programação Orientada a Objetos
 Professor: Sebastião Emidio Alves filho
 Aluno: Gabriel Filipe da Silva Fernandes
 ===========================================*/

 import javax.swing.JOptionPane;
 import java.util.ArrayList;
 import java.util.List;
 
 public class primeiraAtividade {
     public static void main(String[] args) {
        String Palavra;
         
        // precisamos pegar uma palavra
        Palavra = JOptionPane.showInputDialog("Digite uma palavra de 5 letras: ");
        if(Palavra.length() != 5) {
             JOptionPane.showMessageDialog(null, "A palavra informada não contém 5 letras, tente novamente! ");
        }

        // printar a palavra para o usuário
        System.out.printf("palavra digitada foi: ");
		System.out.printf(Palavra);
        System.out.printf("\n");

        // criar uma array de string
        List<String> palavraFinal = new ArrayList<String>(); 

        novaPalavra(palavraFinal, Palavra, 3, "");

        // agora para printar as palavras geradas de combinação
        for (String total : palavraFinal) {
            System.out.println(total);
        }

     }

    public static void novaPalavra(List<String> palavraFinal, String total, int n, String texto) {
        String aux = texto;
        int i;

        for (i = 0; i < total.length(); i++) {
            aux += total.charAt(i);

            if (aux.length() >= n) {
                palavraFinal.add(aux);
                aux = texto;
            } 
            else {
                novaPalavra(palavraFinal, total, n, aux);
                aux = texto;
            }
        }
    }
 }
import javax.swing.JOptionPane;

public class ExemploString01{

    public static void main(String[] args){

        String nome = "Curso de Java";
        // retorna a quantidade de caracteres da String
        System.out.println(nome);
        System.out.println("Tamanho da String: " 
        + nome.length());
        
        String nick = JOptionPane.showInputDialog(null, 
            "Informe o nick do seu pager");
        if(nick.equals("")){
            JOptionPane.showMessageDialog(null, 
            "Filho eu pedi para você o seu nick, ta dificil?");
        }

        String jogoDoAno = "   Legue of Legends     ";
        // remove espaços do começo e do fim
        jogoDoAno = jogoDoAno.trim();

        String sistemaOperacional = "LINUX";

        // colocar o texto todo em caixa alta
        sistemaOperacional = sistemaOperacional.toUpperCase();
        System.out.println(sistemaOperacional);

        // colocar o texto todo em caixa baixa
        sistemaOperacional = sistemaOperacional.toLowerCase();
        System.out.println(sistemaOperacional);

        // pegar um caracter em determinado índice
        char letra = sistemaOperacional.charAt(2);
        
        String nomeCompleto = "Juan Roberto da Rocha";
        System.out.println(nomeCompleto.substring(5,12));


        String sigla = nomeCompleto.charAt(5) + "" +
        nomeCompleto.charAt(8);
        System.out.println(sigla);
        String nome2 = "casas " .trim();

    }
}
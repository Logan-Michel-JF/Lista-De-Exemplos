import javax.swing.JOptionPane;

public class Exemplowhile03{

    public static void main(String[] args){

        int quantidadeMaxima = 4;
        int atual = 0; 
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;        
        String nome = " ";
        while(atual < quantidadeMaxima){
            nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
            
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua Idade: "));

            if(idade > maiorIdade){
                maiorIdade = idade;
            }

            if(idade < menorIdade){
                menorIdade = idade;
            }

            System.out.println("atual: " + atual);
            atual = atual +  1;
            
            JOptionPane.showMessageDialog(null, "A maior Idade e: " + maiorIdade); 
            
            JOptionPane.showMessageDialog(null, "A menor Idade e: " + menorIdade);
        }
    }
}
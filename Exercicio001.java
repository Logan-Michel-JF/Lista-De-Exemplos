import javax.swing.JOptionPane;

public class Exercicio01{

   public static void main(String[] args){

      //Coloque suas Informações
      String nome = JOptionPane.showInputDialog ("Digite seu Nome");
      String sobrenome = JOptionPane.showInputDialog ("Digite seu Sobrenome");
      int idade = Integer.parseInt(JOptionPane.showInputDialog ("Digite sua Idade"));
      String cor = JOptionPane.showInputDialog ("Digite sua Cor Preferida");
      double peso = Double.parseDouble(JOptionPane.showInputDialog ("Digite Seu Peso.\n OBS Use o . Para Separa As Casas Decimais"));
      double altura = Double.parseDouble(JOptionPane.showInputDialog ("Digite Sua Altura.\n OBS Use o . Para Separa As Casas Decimais"));
      String bairro = JOptionPane.showInputDialog ("Digite Seu Bairro");
      int numero = Integer.parseInt(JOptionPane.showInputDialog ("Digite se Número Para Contato"));
      String cidade = JOptionPane.showInputDialog ("Digite a Cidade Onde Mora");
      int telefone = Integer.parseInt(JOptionPane.showInputDialog ("Digite Um Telefone Fixo"));
      String cep = JOptionPane.showInputDialog ("Digite Seu CEP");
      String estado = JOptionPane.showInputDialog ("Digite o Estado Onde Você Mora");
      String cpf = JOptionPane.showInputDialog ("Digite Seu CPF");
      String pis = JOptionPane.showInputDialog ("Digite Seu PIS");

      JOptionPane.showMessageDialog(null,
      "\nNome: " + nome + "\nSobrenome: " + sobrenome +"\nIdade: " + idade +"\nCor Preferida: " + cor + "\nPeso: " + peso +"\nAltura: " + altura + "\nBairro: " + bairro +
      "\nNumero: " + numero + "\nCidade" + cidade + "\nTelefone" + telefone + "\nCEP" + cep + "\nEstado" + estado + "\nCPF" + cpf + "\nPIS" + pis);
 

   }

}
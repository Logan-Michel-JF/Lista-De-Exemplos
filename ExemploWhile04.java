import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class ExemploWhile04{
    public static void main(String[] args){

        String nome = JOptionPane.showInputDialog("Digite o seu Nome");

        /*
        while( !nome.equalsIgnoreCase("sair") &&
            !nome.equalsIgnoreCase("fim")){
        */
        double somaMedia = 0;
        int quantidadeTotalDeAlunos = 0;
        while( !nome.equalsIgnoreCase("sair")){
            double nota1 = Double.parseDouble(JOptionPane
                .showInputDialog("Digite a sua Nota1"));
            double nota2 = Double.parseDouble(JOptionPane
                .showInputDialog("Digite a sua Nota2"));
            double nota3 = Double.parseDouble(JOptionPane
                .showInputDialog("Digite a sa Nota3"));
            double media = (nota1 + nota2 + nota3) / 3;
            JOptionPane.showMessageDialog(null, 
                "Olá " + nome + " a sua media é " + media);
            somaMedia = somaMedia + media;
            quantidadeTotalDeAlunos = quantidadeTotalDeAlunos + 1;

            if(media < 7){
                JOptionPane.showMessageDialog(null, "Reprovado jovi.");
            }else{
                JOptionPane.showMessageDialog(null, "Jovem padawan");
            }

            nome = JOptionPane.showInputDialog("Digite Seu Nome.\nSe desejar sair \"Sair\",  :) ");

        }
        double mediaDasMedias = somaMedia / quantidadeTotalDeAlunos;
        JOptionPane.showMessageDialog(null, "Média das médias é: " + mediaDasMedias);
    }
}
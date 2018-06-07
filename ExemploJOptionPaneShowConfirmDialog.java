import javax.swing.JOptionPane;

public class ExemploJOptionPaneShowConfirmDialog{

    public static void main(String[] args){
        int opcao = JOptionPane.showConfirmDialog(null,"Deseja Cadastrar",
        "AVISO", JOptionPane.YES_NO_OPTION);
           
        if(opcao == JOptionPane.OK_OPTION){
            JOptionPane.showMessageDialog(null, "Registro Salvo Com Sucesso");

        }else if(opcao == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Negado com Sucesso");

        }else if(opcao == JOptionPane.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null, "Cancelado Com Sucesso");
        
        }else{
            JOptionPane.showMessageDialog(null, "Fechado com Sucesso");

        }
    }
}
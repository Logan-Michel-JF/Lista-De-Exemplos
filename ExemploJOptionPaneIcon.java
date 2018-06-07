import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ExemploJOptionPaneIcon{

    public static void main(String[] args){

        JOptionPane.showMessageDialog (null, "Olá Mundo",
        "Sistema da vovó", JOptionPane.WARNING_MESSAGE,
            new ImageIcon(
                ExemploJOptionPaneIcon.class.getResource
                ("/imagens/death.png")
            )
        );
    }
}
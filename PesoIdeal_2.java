import javax.swing.JOptionPane;

public class PesoIdeal_2 {
  public static void main (String[]args) {
        //altura e sexo do usuário
        double altura, sexo;

        altura =  Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:: "));
        sexo = Double.parseDouble(JOptionPane.showInputDialog("Digite seu sexo, sendo 0 para feminino e 1 para masculino:: "));

        //chamando método 

        double PesoIdeal = calcularpesoideal(altura, sexo);
        JOptionPane.showMessageDialog(null," Seu peso ideal é " +PesoIdeal); //se não der certo tentar mudar as declarações de variáveis

    }//final do main

    //inicio de outro metodo 
    static double calcularpesoideal(double alt, double sx){
        if(sx == 1){
            return (72.7 * alt)-58;
        }
        else{
            return (62.1 * alt) - 44.7;
        }
    }  
}

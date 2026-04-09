import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        String nombre;
        Double salario;
        

        nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");  
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario"));

        JOptionPane.showMessageDialog(null,"El usuario " + nombre +" gana " + salario);


    }
}
import javax.swing.JOptionPane;

public class Calculadora2 {
    
    public static void main(String[]args){
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Digita el número1: "));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Digita un número2: "));
        
            
        Operaciones op=new Operaciones();
        op.sumar(num1, num2);
        op.restar(num1, num2);
        op.multiplicar(num1, num2);
        op.dividir(num1, num2);
        op.mostrarResultados(num2, num2, num1, num2);
    }    
}
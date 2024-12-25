import javax.swing.JOptionPane;
public class Practica_3 {
    public static void main(String[] args) {
        byte x, a = 1, b = 1, c = 1, d = 1;
        x=Byte.parseByte(JOptionPane.showInputDialog("Ingresa longitud del cuadrado"));
        while (a <= x) {
            System.out.print("a    ");
            a ++;
        }
        System.out.println("\n");
        while (b <= x) {
            System.out.println("b");
            while (c <= x) {
                System.out.print("    ");
                c ++;
            }
            System.out.print("c");
            b ++;
        }
        while (d <= x) {
            System.out.print("d    ");
            d ++;
        }
    }
}

import javax.swing.JOptionPane;
public class Practica_1 {
    public static void main(String armu[]) {
        byte a = 1, b, x, r = 1;
        x=Byte.parseByte(JOptionPane.showInputDialog("Ingresa la longitud del triangulo"));
        System.out.println("\n");
        while (a <= x) {
            System.out.println("*");
            b = 1;
            while (b <= a) {
                System.out.print(" ");
                b ++;
            }
            System.out.println("*");
            a ++;
        }
        while (r < x) {
            System.out.print("* ");
            r ++;
        }
    }
}

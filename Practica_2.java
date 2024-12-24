import javax.swing.JOptionPane;
public class Practica_2 {
    public static void main(String[] args) {
        String[] materias = {"Matematicas", "Quimica", "Ingles", "Español", "Historia"};
        double calificaciones = 0, promedio = 0, prom = 0;
        for (int x = 0; x < materias.length; x ++) {
            calificaciones=Double.parseDouble(JOptionPane.showInputDialog("ingrese calificacion de " + materias[x]));
            promedio += calificaciones;
        }
        prom = promedio / 5;
        System.out.println("Calificaion final: " + prom);
        if (prom < 6) {
            System.out.println("Calificacin reprovatoria");
        }
        else {
            System.out.println("Calificacion aprovatoria");
        }
    }
}

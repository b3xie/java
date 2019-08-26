package nomes;
import javax.swing.JOptionPane;
public class Nomes {
    public static void main(String[] args) {
        String[] meses = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        for(int i = 0;i<12; i++){
        System.out.println("Qual funcionario do mes de " + meses[i] + "?");
        String a = JOptionPane.showInputDialog("Qual o nome?");
        meses[i] = i + a;
        
        
    } for(int i =0; i<12; i++){
        System.out.println(meses[i]);
    }
}
}


    


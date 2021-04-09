package tradutorEP;

import javafx.print.PaperSource;

public class PostFix {
    public static void main(String[] args) {

        System.out.println(Separador.FinalArrayList(Leitor.leitorArquivoString()));

        System.out.println(Exp.PostFix(Separador.FinalArrayList(Leitor.leitorArquivoString())));      
    }
}
package tradutorEP;
import java.util.ArrayList;

public class Exp {
 
    public static ArrayList<String> postfix(ArrayList entrada){
        Exp e1 = new Exp(entrada);
        int contador =0;
        
        for(int i=0; e1.entrada.size()>i;i++){
            if (e1.entrada.get(i).charAt(0)=='*'||e1.entrada.get(i).charAt(0)=='/') {
                contador++;
            }
        }
        if (contador==0) { 
                int s=0;
                int f=e1.entrada.size()-1;
                e1.saida.add(e1.entrada.get(0));
                
            for(int i=1; f>i;i=i+2){           
                s=i+1;
                e1.saida.add(e1.entrada.get(s));
                e1.saida.add(e1.entrada.get(i));
                
            }
        }
        
        else if(contador!= 0){           
            e1.saida.add(e1.entrada.get(0));
           
            int f = e1.entrada.size()-1;
            int s=0;
            for(int i=1; f>i;i=i+2){
                s=i+1;
                if(contador==0){
                  e1.saida.add(e1.entrada.get(s));
                  e1.saida.add(e1.entrada.get(i));
                  
                }
                else{
                    if(e1.entrada.get(i).charAt(0)=='/'||e1.entrada.get(i).charAt(0)=='*'){
                        e1.saida.add(e1.entrada.get(s));
                        e1.saida.add(e1.entrada.get(i));
                        contador--;
                        if(contador==0){
                            for (int j = 0; j < e1.espera.size(); j++) {
                               e1.saida.add(e1.espera.get(j));
                            }
                        }
                    }
                    else{
                        e1.espera.add(e1.entrada.get(i));
                        e1.saida.add(e1.entrada.get(s));
                    }
                    
                }
 
            }
        }
        
        return e1.saida;    
    }
}

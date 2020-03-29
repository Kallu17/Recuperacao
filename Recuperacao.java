import java.util.Scanner; 
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class Recuperacao{
    public static void main(String[] args){ 
        DecimalFormat nota = new DecimalFormat("##.00");
        String nome;   
        double media, soma = 0; 
        
        System.out.println("Qual o seu nome? ");
        nome = new Scanner(System.in).next();
        for(int i = 0; i < 3; i++){
            System.out.printf("Insira a %dª nota: ", i+1);
            double aux = new Scanner(System.in).nextDouble();
            
            soma += aux;
        }
 
        media = soma/3;
        
        if(media >= 7) {
            System.out.println(nome + ", você foi aprovado com média " + nota.format(media));
        }else if(media >=5){
            System.out.println(nome +", você ficou de recuperação com média "+nota.format(media));
            System.out.println("Insira a nota de recuperação: ");
            double recuperacao = new Scanner(System.in).nextDouble();
            double mediaRecuperacao = (media + recuperacao)/2; 
            if(mediaRecuperacao >= 5){
                System.out.println(nome + ", você foi aprovado com média " + nota.format(mediaRecuperacao));
            }else{
                System.out.println(nome + ", você foi reprovado com média "+ nota.format(mediaRecuperacao));
            }
        }else{
            System.out.println(nome + ", você foi reprovado com média " + nota.format(media));  
        }  
    } 
} 

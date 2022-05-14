
import java.util.Scanner;

public class media 
{
    public static void main(String[] args)  
    { 
// Declarado quatro variaveis em double (números fracionarios) para os valores das notas e o resultado.
        Scanner ler = new Scanner(System.in); 
        double a,b,c,r; 
// System.out.prinf para exibir a mensagem "Digite a primeira nota:" para o usuario, assim que o usuario digitar o valor, variavel "a" vai passar a valer o mesmo.
        System.out.printf("Digite a primeira nota:"); 
        a = ler.nextDouble(); 
// System.out.prinf para exibir a mensagem "Digite a segunda nota:" para o usuario, assim que o usuario digitar o valor, variavel "b" vai passar a valer o mesmo.
        System.out.printf("Digite a segunda nota:"); 
        b = ler.nextDouble(); 
// System.out.prinf para exibir a mensagem "Digite a terceira nota:" para o usuario, assim que o usuario digitar o valor, variavel "c" vai passar a valer o mesmo.
        System.out.printf("Digite a terceira nota:");
        c = ler.nextDouble();
// Para calcular o valor da media e necessario somar as tres variaveis (a + b + c) e dividir por tres /3 que e o numero de valores. Usado parenteses para fazer primeiro a soma e depois dividir o resultado por tres.        
        r = (a + b + c) /3;  
// Usado comandos if, else if e else. Se o resultado da media for maior ou igual a 8, vai aparecer para o usuario a mensagem "Aluno aprovado! =)".
 if (r>=8) 
{
System.out.print ("Aluno aprovado! =)");
// Se nao se(resultado da media menor igual a 8 e maior igual a 6),  vai aparecer a mensagem "Aluno para recuperacao!".
} 
else if (r<=8 && r>=6 ) 
{
System.out.print ("Aluno para recuperacao!");
} 
// Se nao for nenhum desses dois resultados, vai aparecer a mensagem "Aluno reprovado! =(".
else
System.out.print ("Aluno reprovado! =(");

} 
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package user.aprovacao;

/**
 *
 * @author Joao Victor
 */
public class Aprovacao {

    public static void main(String[] args) {
         double nota1 = 20;
         double nota2 = 10;
         double nota3 = 20;
         double Resultado = nota1 + nota2 + nota3;
         
         if(Resultado >= 70 ) {
           System.out.println("Aluno Aprovado Com a Nota:" + Resultado);
         }else{
           System.out.println("Aluno Reprovado Com Nota:" + Resultado);
           
         }    
    }
}

// Pré e pós incremento e decremento 

/*
    Pré incremento e decremento:
    ++i;
    --i;

    Pós incremento e decremento
    i++;
    i--;

    Existe alguma diferença entre o pós e o pré? SIM.
    Mas em muitos casos, não haverá diferença.
*/

public class Aula_29{
    public static void main(String[] args)
    {
        // ANTES DE TUDO, SAIBA QUE: 
        //sempre que usamos o operador de incremento, independente de onde ele esteja, ele somará +1 a nossa variável. 
        
        int x = 100; 

        // Isto adicionará +1 a nossa variável x. - A partir da linha abaixo, o X terá 101 como valor.
        System.out.println(x++); 

        // Isto não adicionará +1 a nossa variável X. Pois não é operador de incremento.
        System.out.println(x +1);
        

        // ENTENDENDO A DIFERENÇA:

        // Pós incremento.
        int a = 10; 
        int b = a++; 

        System.out.println(a); // 11 
        System.out.println(b); // 10

        // Mas por que o resultado foi: "11" para a variável 'a' & "10" para a variável 'b'?
        /*
            Quando utiliamos o pós-incremento, singifica que:
            -> PRIMEIRO é atribuindo à variável 'a' a nossa variável 'b'. 
            -> Por consequência, a variável 'b' recebe o valor de 'a' (10).  
            -> Logo após essa atribuição, é somado +1 a variável 'a'. Pois é assim que o operador funciona.

            -> Por consquência, a variável 'b' vai manter o valor anteior da variável 'a'.
            -> E a variável 'a' vai receber +1. 

            Podemos ver isso na própria sintaxe:
            int b = a++;

            Observe que, a variável 'a' veio antes do incremento. 
            Então 'b' recebeu o valor original de 'a', e ponto final.

            Após isso, foi somado +1 a variável 'a' pois é isso o que o operador de incremento faz. 
        */
    }
}

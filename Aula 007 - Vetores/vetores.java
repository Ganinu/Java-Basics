import java.util.Arrays;

public class vetores {
    
public static void main(String[] args) {

    
    
    //tambem podemos fazer isso com outras variaveis porém precisamos manter a coerencia dentro do array, int só com int, String só com String

    //podemos também já indicar quais números e letras ficarão no array, ao invés de digitar quantos espaços preciso
    int[] numeros = new int[5];

    numeros[0] = 1;
    numeros[1] = 2;
    numeros[2] = 3;
    numeros[3] = 4;
    numeros[4] = 5;

    for(int i = 0; i < numeros.length; i++){
        System.out.println(i);
        //abaixo temos outra maneira de exibir o conteúdo sem usar o laço de repetição
        System.out.println(Arrays.toString(numeros)); 
    }
}

}

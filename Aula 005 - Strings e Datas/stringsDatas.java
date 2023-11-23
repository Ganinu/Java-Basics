public class stringsDatas {
    
    public static void main(String[] args) {
        

        String nome = "Gabs";
        String nome1 = "gabS";

        //Para deixar tudo em maiusculas
        System.out.println(nome.toUpperCase());
        //Para deixar tudo em minusculas
        System.out.println(nome.toLowerCase());
        //Para contar quantas letras nossa palavra possui
        System.out.println(nome.length());
        //para comparar se os nomes que estão nas Strings são iguais, ignorando maiusculas e minusculas
        System.out.println(nome.equalsIgnoreCase(nome1));
    }

}

public class aula03 {
    
    public static void main(String[] args) {
    
        boolean fimDeSemana = true;
        boolean fazendoSol = false;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        //tabela verdade
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        //só vamos a praia caso ambos os valores forem verdadeiros
        System.out.println(vamosAPraia);

        //operador ternario
        //fim de semana é o termo a ser avaliado (por isso a interrogação)
        //o segundo termo (é fim de semana) é caso seja verdadeiro
        //terceiro termo é caso seja falso (: para falar se não for)

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);

        //operador || (ou / or)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false
}

}

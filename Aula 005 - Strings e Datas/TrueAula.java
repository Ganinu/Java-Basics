import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class TrueAula {
    
    public static void main(String[] args) {
        
        String nome = "Gabs";
        LocalDateTime agora = LocalDateTime.now();
        String saudacao;
        
        // Corrigindo a declaração da variável hoje
        LocalDate hoje = LocalDate.now();
        
        // Obtendo o dia da semana corretamente
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        
        if(agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "Bom dia!";
        }
        else if(agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "Boa tarde!";
        }
        else if(agora.getHour() >= 18 && agora.getHour() < 24){
            saudacao = "Boa noite!";
        }
        else{
            saudacao = "Olá";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaDaSemana, saudacao.toUpperCase());

    }
}

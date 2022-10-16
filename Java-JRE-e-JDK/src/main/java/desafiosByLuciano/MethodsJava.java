package desafiosByLuciano;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class MethodsJava {
    public static void main(String[] args) {
        // Manipulação de Strings e Datas
        // Method class Locale, LocaleDate and TestStyle

        String nome = "Wanessa Santos";

        //  The Locale class provides three constructors:
        //      Locale(String language)
        //      Locale(String language, String country)
        Locale brasil = new Locale("pt", "BR");

        //  LocalDate.now()
        //      Obtains the current date from the system clock in the default time-zone.
        LocalDate dayToday = LocalDate.now();

        System.out.println("Olá "
                + nome
                + ", tudo bem? \n"
                + "Hoje é "
                + dayToday.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil)+ "\n"
                + "A data de hoje é: "
                + dayToday.getDayOfMonth() + "/"+ dayToday.getMonthValue()+ "/" + dayToday.getYear()
        );
        //System.out.println(dayToday.getDayOfMonth());
        //String saudacao;
        //saudacao = new
    }
}

package releases.java11;

import java.util.stream.Collectors;

public class StringLinesExemplo {
    public static void main(String[] args) {
        String html = "<html>\n<head>\n<head>\n<body>\n<body>\n<html> ";
       // System.out.println(html);

        //Abaixo no java 11 usando o Line. fazendo um filtro para printar somente os <head> depois de fazer o filtro coleta e junta tudo
        System.out.println(html.lines().filter(s -> s.equals("<head>")).collect(Collectors.joining()));
    }
}

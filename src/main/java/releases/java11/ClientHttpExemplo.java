package releases.java11;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.stream.Collectors;

public class ClientHttpExemplo {
    static ExecutorService executor = Executors.newFixedThreadPool(6, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);

            System.out.println("Nova thread criada :: " + (thread.isDaemon() ? "daemon " : "") + " thread Group " + thread.getThreadGroup());
            return thread;
        }
    });

    public static void main(String[] args) throws IOException, InterruptedException {
        connectAndPrintURLJavaOracle();

    }

    public static void connectAkanaiHttp11Client(){

        System.out.println("Running HTTP/1.1 exemple ...");

        try{
            HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_1_1)
                    .proxy(ProxySelector.getDefault())
                    .build();

            long star = System.currentTimeMillis();

            HttpRequest mainRequest =  HttpRequest.newBuilder()
                    .uri(URI.create("http://http2.akamai.com/demo/h2_demo_frame_html"))
                    .build();

            HttpResponse<String> response = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status Code :: " + response.statusCode());
            System.out.println("Headrs Response :: " + response.headers());
            String responsebody = response.body();
            System.out.println(responsebody);

            List<Future> future = new ArrayList<>();

            responsebody.lines().filter(line -> line.trim().startsWith("<ing height"))
                    .map(line -> line.substring(line.indexOf("src-'") + 5, line.indexOf("/>")))
                    .forEach(System.out::println);


        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }

    }

    //Usando Http Client API java11 request: minha requisição o que estou pedindo para o servidor.
    private static void connectAndPrintURLJavaOracle() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://docs.oracle.com/javase/10/language/"))
                .build();

        // Agora criar um http Client

        //Vai mandar através do send a requisição e salvar a resposta na variavel response
        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status Code :: " + response.statusCode());
        System.out.println("Headrs Response :: " + response.headers());
        System.out.println(response.body());

    }



//    private static void connectAndPrintURLJavaOracle() {
//        try {
//            var url = new URL("https://docs.oracle.com/javase/10/language/");
//            var urlConnection = url.openConnection();
//
//            try (var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
//                System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

   }

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws Exception {
    String url="https://api.weatherbit.io/v2.0/history/hourly?lat=35.775&lon=-78.638&start_date=2023-01-27&end_date=2023-01-28&tz=local&key=a89157f71fcb4a8dac8efe1da01beffa";

        HttpRequest request=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        HttpClient client=HttpClient.newBuilder().build();
        HttpResponse response=client.send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class monedas {

    public static conversion obtenerConversion() throws IOException, InterruptedException {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/dd8bbb02243a8d06b0faf02f/latest/USD");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
        JsonObject conversion_rates = json.getAsJsonObject("conversion_rates");

        conversion conversion = new conversion();
        conversion.setUsd(1);
        conversion.setArs(conversion_rates.get("ARS").getAsDouble());
        conversion.setBob(conversion_rates.get("BOB").getAsDouble());
        conversion.setBrl(conversion_rates.get("BRL").getAsDouble());
        conversion.setCpl(conversion_rates.get("CLP").getAsDouble());
        conversion.setCop(conversion_rates.get("COP").getAsDouble());

        return conversion;
    }
}

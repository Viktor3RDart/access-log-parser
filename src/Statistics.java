import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Statistics {
    public static HashSet<String> hash = new HashSet<>();
    public HashMap<String, Integer> map;

    public static void main(String[] args) throws IOException {
        ArrayList<String> pages = new ArrayList<>();
        pages.add("https://ria.ru/");
        pages.add("https://ria.ru/defense_safety/");
        pages.add("https://ria.ru/culture/");
        pages.add("https://ria.ru/defense_safety/");
        addEntry("GET", pages);
        System.out.println(hash);
    }

    public ArrayList<String> GiveAll() {
        ArrayList<String> StList = new ArrayList<>();

        return StList;
    }

    public static void addEntry(String metod, ArrayList<String> PageList) throws IOException {
        for (String s : PageList) {
            URL obj = new URL(s);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
            connection.setRequestMethod(metod.toUpperCase());
            int responseCode = connection.getResponseCode();
            String a = connection.getHeaderFieldKey(12);
            if (responseCode == 200) {
                hash.add(s);
            }
            System.out.println(a);
        }
    }
}


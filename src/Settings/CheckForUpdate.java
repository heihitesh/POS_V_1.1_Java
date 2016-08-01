package Settings;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by Nilesh Verma on 01-Aug-16.
 */
public class CheckForUpdate {
    private static OkHttpClient client = new OkHttpClient();
    MyUpdatePojo App1;
    private String releasedDate;
    private String description;
    private String downloadingLink;

    public CheckForUpdate(){
       String Json = null;
       try {
           Json = getJson("https://gist.githubusercontent.com/itshiteshverma/569b44120286fbf29a6ecf7352f59f79/raw/859d31bf131a5604b68e992583101596421c53e7/test.json");

       } catch (Exception e) {
           System.out.println(e);
       }
       Gson gson = new Gson();
       App1 = gson.fromJson(Json, MyUpdatePojo.class);

   }

    public static String getJson(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }


    private Float latestVersion;

    public Float getLatestVersion() {

       latestVersion= Float.valueOf(App1.getHitInventory().getVersion());
        return latestVersion;
    }

    public String getReleasedDate() {
        releasedDate = App1.getHitInventory().getDate();
        return releasedDate;
    }


    public String getDescription() {
        description = App1.getHitInventory().getDescription();
        return description;
    }

    public String getDownloadingLink() {
        downloadingLink = App1.getHitInventory().getDownloading_link();
        return downloadingLink;
    }
}

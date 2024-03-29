package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

public class Network4_KaKao {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://www.googleapis.com/youtube/v3/search?part=snippet&key=AIzaSyCLkoB0Bwiiem7_uVKZX9soG3IFJDqIMrw&q=");
			URLConnection con = url.openConnection();
			
			InputStream in = con.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader reader = new BufferedReader(isr);
			String result = "";
			
			while(true) {
				String data = reader.readLine();
				if (data == null) break;
				result += data;
// 				System.out.println(result);
			}
			System.out.println(result);
			// �߰�ȣ��
			JSONObject obj = new JSONObject(result);
			// documents �� ���ȣ��
			JSONArray items = obj.getJSONArray("items");
			
			for (int i = 0; i < items.length(); i++) {
				JSONObject item = items.getJSONObject(i);
				JSONObject id = item.getJSONObject("id");
				String videoId = id.getString("videoId");
				System.out.println(videoId);
				JSONObject snippet = item.getJSONObject("snippet");
				String title = snippet.getString("title");
				System.out.println(title);
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

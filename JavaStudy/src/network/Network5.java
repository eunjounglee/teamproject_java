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

public class Network5 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://dapi.kakao.com/v2/search/image?query=java");
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
			// 중괄호라서
			JSONObject obj = new JSONObject(result);
			// documents 는 대괄호라서
			JSONArray documents = obj.getJSONArray("documents");
			
			for (int i = 0; i < documents.length(); i++) {
				JSONObject doc = documents.getJSONObject(i);
				String image_url = doc.getString("image_url");
				System.out.println(image_url);
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

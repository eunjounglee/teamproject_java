package ch13;

import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.json.JSONArray;
import org.json.JSONObject;

public class Swing3 {
	
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
				if(data == null) break;
				result += data;
//				System.out.println(data);
			}
//			System.out.println(result);
			JSONObject obj = new JSONObject(result);
			
			JFrame j = new JFrame();
			j.setLayout(new FlowLayout());
			
			JSONArray documents = obj.getJSONArray("documents");
			for(int i = 0; i < documents.length(); i++) {
				JSONObject doc = documents.getJSONObject(i);
				String image_url = doc.getString("image_url");
				System.out.println(image_url);
				JButton b1 = new JButton("버튼 1");
				j.add(b1);
			}
			j.setSize(500, 300);
			j.setVisible(true);

			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

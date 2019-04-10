package ch06;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenBrowser {

	public static void open(String url) {
		// 브라우저를 띄우는 코드를 작성할 것이다.
		// shift + ctrl + o : 필요한 모든 것들을 import 해줌
		try {
			Desktop.getDesktop().browse(new URI(url));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		open("www.google.com");
	}

}

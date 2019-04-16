package network;

import com.ggoreb.kakao_api.TranslateUtil;
import com.ggoreb.kakao_api.VisionUtil;

public class Network6 {

	public static void main(String[] args) {
		TranslateUtil tu = new TranslateUtil("0a7c5408897da72ef62213f279237f86");
		String t = tu.sendText("kr", "en", "지금 뭐하는겁니까?");
		System.out.println(t);
		
		VisionUtil vu = new VisionUtil("0a7c5408897da72ef62213f279237f86");
		String result = vu.sendFile("c:/Dev/image.jpg");
		System.out.println(result);
	}

}

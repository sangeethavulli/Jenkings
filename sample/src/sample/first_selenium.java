package sample;


	import java.io.IOException;
	import java.net.HttpURLConnection;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.security.Security;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import javax.net.ssl.HttpsURLConnection;

	public class first_selenium {
		
		public static void main(String[] args)    {
			
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");	
			
			System.setProperty("java.protocol.handler.pkgs",
					"com.sun.net.ssl.internal.www.protocol");
			
			WebDriver d1=new ChromeDriver ();
			
			d1.get("https://demo-anonymize.trialassure.com/Anonymization/Anonymization/Anonymization/11");
				

}}

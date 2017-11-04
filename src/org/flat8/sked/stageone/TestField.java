package org.flat8.sked.stageone;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestField {

	public static void main(String[] args) throws IOException {
		
		
//		Pattern pattern = Pattern.compile("([\\u0406-\\u0457]+)[\\p{Punct}+\\s+\\n]{1,10}([\\u0406-\\u0457]+)\\s+([\u0406-\u0457]+)(вна)|([\\u0406-\\u0457]+)\\s+([\\u0406-\\u0457]+)\\s+([\\u0406-\\u0457]+)(вич)");
//		String strNames = "На що претендує в\n" + 
//				"період чергової\n" + 
//				"атестації\n" + 
//				"1 Корява\n" + 
//				"Людмила Миколаївна\n" + 
//				"вчитель історії 2012\n" + 
//				"чергова\n" + 
//				"26 2016-2017 відповідає раніше\n" + 
//				"присвоєній\n" + 
//				"кваліфікаційній\n" + 
//				"категорії\n" + 
//				"“спеціаліст вищої\n" + 
//				"категорії”\n" + 
//				"«старший\n" + 
//				"учитель»\n" + 
//				"відповідність\n" + 
//				"раніше присвоєній\n" + 
//				"кваліфікаційній\n" + 
//				"категорії “спеціаліст\n" + 
//				"вищої категорії” та\n" + 
//				"педагогічного\n" + 
//				"звання « старший\n" + 
//				"учитель»\n" + 
//				"2 Прянішніков\n" + 
//				"Сергій Петрович\n" + 
//				"вчитель трудового\n" + 
//				"навчання";
//		Matcher matcher = pattern.matcher(strNames);
//		System.out.println("Mathes all string: "+ matcher.matches());
//		matcher.reset();
//		System.out.println("Find substring: " + matcher.find());
//		matcher.reset();
//		while(matcher.find()) {
//			System.out.println();
//			System.out.print("Founded exactly substring: ");
//			System.out.print(matcher.group());
//		}
		
		
//		Filler filler = new Filler();
//		List<String> content = filler.getContentFromFile("teachersBrovary7.txt");
//		System.out.println("content: ");
//		for(String string : content) {
//			System.out.println(string);
//		}
//		List<String> names = filler.pullOutNames(content);
//		System.out.println("names: ");
//		for(String string : names) {
//			System.out.println(string);
//		}
		
		
//		System.out.println(System.getProperty("user.dir"));
		
//		//RegEx Getting Full Ukr Names
//		Pattern pattern = Pattern.compile("([\\u0406-\\u0457]+)(\\s+)([\\u0406-\\u0457]+)\\s+([\u0406-\u0457]+)(вна)|([\\u0406-\\u0457]+)\\s+([\\u0406-\\u0457]+)\\s+([\\u0406-\\u0457]+)(вич)");
//		String name = "Іванівна";
//		String stringUkrainian = "Шевченко Тарас Григорович. Поет.\n"+
//				"Винниченко Володимир Кирилович. Письменник, драматург.\n"+
//				"Костенко Ліна Василівна. Поетеса. "+
//				"Косач Ольга Петрівна. Письменниця "+
//				"Кобилянська Ольга Юліанівна. Письменниця. ";
////		System.out.println(stringUkrainian);
//		Matcher matcher = pattern.matcher(stringUkrainian);
//		System.out.println("Mathes all string: "+ matcher.matches());
//		matcher.reset();
//		System.out.println("Find substring: " + matcher.find());
//		matcher.reset();
//		while(matcher.find()) {
//			System.out.println();
//			System.out.print("Founded exactly substring: ");
//			System.out.print(matcher.group());
//		}
//		//Credit card checker
//		String cardNumber = "2234567890123456";
//		String date = "03/12";
//		String CVV = "678";
//		
//		Pattern cardNumberPattern = Pattern.compile("([2-6]([0-9]{3}) ?)(([0-9]{4} ?){3})");
//		Pattern datePattern = Pattern.compile("(0[1-9]|1[0-2])/([0-9]{2})");
//		Pattern CVVPattern = Pattern.compile("[0-9]{3}");
//		Matcher cardNumberMatcher = cardNumberPattern.matcher(cardNumber);
//		Matcher dateMatcher = datePattern.matcher(date);
//		Matcher CVVMatcher = CVVPattern.matcher(CVV);
//		if(cardNumberMatcher.matches()&dateMatcher.matches()&CVVMatcher.matches()) {
//			System.out.println("Card data is correct");
//		} else {
//			System.out.println("Card data is incorrect");
//		}
//		//		Credit checker
				
//		Pattern pattern3 = Pattern.compile("(?:Mouse|Keyboard)Listener");
//		Matcher matcher3 = pattern3.matcher("MouseListener KeyboardListener");
//		while(matcher3.find()) {
//			System.out.println(matcher3.group());
//		}
		
	}

}

package org.flat8.sked.stageone;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class is intended for fill figurants of schedule
 * 
 * @author  Oleksandr Maksymenko
 * @version 0.0.1   
 */
public class Filler {
	
	/**
     * Read the text files and get list of strings
     *
     * @param  fileName   the path of text file with extension
     * @return     list of string
     *             <code>-1</code> if there is no more data because the end
     *             of the stream has been reached.
     * @exception  IOException if the first line cannot be read for any reason
     * other than end of file, the stream has been closed and the underlying
     * input stream does not support reading after close, or another I/O
     * error occurs.
     */
	public List<String> getContentFromFile(String fileName) {
		Path path = Paths.get(fileName);
		List<String> lines = new LinkedList<>();
		try {
			lines = Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Something wrong with file opening!");
		}  
		return lines;
	}
	/**
     * Get from string collection Ukrainian full names
     *
     * @param  allText	collection that contains, among 
     * 					other things, full names in format:
     * 					surname, name, patronymic
     * @return     list of full names
     */
	public List<String> pullOutNames(List<String> allText){
		List<String> names = new LinkedList<>();
		Pattern patternUkrFullName = Pattern.compile("([\\u0406-\\u0457]+)[\\p{Punct}+\\s+\\n+]{1,10}([\\u0406-\\u0457]+)[\\p{Punct}+\\s+\\n+]{1,10}([\u0406-\u0457]+)(вна)|([\\u0406-\\u0457]+)[\\p{Punct}+\\s+\\n+]{1,10}([\\u0406-\\u0457]+)[\\p{Punct}+\\s+\\n+]{1,10}([\\u0406-\\u0457]+)(вич)");
		for(String string : allText) {
			Matcher matcher = patternUkrFullName.matcher(string);
			while(matcher.find()) {
				names.add(matcher.group());
			}
		}
		return names;
	}
		
	
}

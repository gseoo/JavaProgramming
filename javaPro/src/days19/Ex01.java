package days19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;

public class Ex01 {
	public static void main(String[] args) {
		String key = "user.dir";
		String userDir = System.getProperty(key);
		System.out.println(userDir);
		String fileName = "1. Java 팀 구성.txt";
		String path = String.format("%s\\src\\days19\\%s", userDir, fileName);
		
		String line = null;
		try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr);) {
			while((line = br.readLine()) != null) {
				if(line.equals("2조")) {
					line = br.readLine();
					System.out.println(line);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String regex = "\\s*,\\s";
		String teamMembers[] = line.split(regex);
		String teamLeader = null;
		String teamMembers2[] = new String[teamMembers.length-1];
		
		for(int i=0, index = 0; i<teamMembers.length; i++) {
			if(teamMembers[i].contains("(팀장)")) {
				teamLeader = teamMembers[i].replace("(팀장)", "");
				continue;
			}
			teamMembers2[index++] = teamMembers[i];
		}
		
		System.out.println("> teamLeader : " + teamLeader);
		System.out.println(Arrays.toString(teamMembers2));
		Arrays.sort(teamMembers2, Collections.reverseOrder());
		System.out.println(Arrays.toString(teamMembers2));
		
//		String output = "<ul>";
//		output += String.format("\t<li class=\"leader\">%s</li>",teamLeader);
//		output += "\r\n\t<li>" + String.join("</li>\r\n\t<li>", teamMembers2);
//		output += "\r\n</ul>";
//		System.out.println(output);
		
		StringBuilder sb = new StringBuilder();
		sb.append("<ul>");
		sb.append(String.format("\t<li class=\"leader\">%s</li>", teamLeader));
		sb.append("\r\n\t<li>" + String.join("</li>\r\n\t<li>", teamMembers2) + "</li>");
		sb.append("\r\n</ul>");
		System.out.println(sb.toString());
		
	}
}

package days24;

/*
 2. days19 패키지 안에 있는 
  "1. Java 팀 구성.txt" 파일을 읽어와서
  
   Map 컬렉션 클래스 사용해서
      key : 1조, 2조, 3조
      value :  직위(급)과 이름을 저장하는 클래스를 선언하고
               그 클래스 객체를 저장하는 컬렉션 클래스 사용   
   저장하고 출력하는 코딩을 하세요.    
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		String fn = ".\\src\\days19\\1. Java 팀 구성.txt";
		
		ArrayList<MemberVO> teamList = null;
		HashMap<String, ArrayList<MemberVO>> teamMap = new LinkedHashMap<String, ArrayList<MemberVO>>();

		String line = null;
		String teamName = null; // key
		MemberVO memberVO = null;
		
		try(FileReader fr = new FileReader(fn); BufferedReader br = new BufferedReader(fr)) {
			while((line = br.readLine()) != null && !line.equals("")) {
				
				teamName = line;
				line = br.readLine();
				String tNames[] = line.split("\\s*,\\s*");
				teamList = new ArrayList<MemberVO>();
				
				for (String tName : tNames) {
					if(tName.contains("(팀장)")) {
						tName = tName.replace("(팀장)", "");
						memberVO = new MemberVO(tName, "팀장");
					} else {
						memberVO = new MemberVO(tName, "팀원");
					}
					teamList.add(memberVO);
				}
				teamMap.put(teamName, teamList);
			}
			dispTeamMember(teamMap);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void dispTeamMember(HashMap<String, ArrayList<MemberVO>> teamMap) {
		Set<Entry<String, ArrayList<MemberVO>>>  eset = teamMap.entrySet();
		Iterator<Entry<String, ArrayList<MemberVO>>> ir = eset.iterator();
		
		String teamName = null;
		ArrayList<MemberVO> teamList = null;
		int teamCount = 0;
		MemberVO teamLeaderVO = null;
		String teamLeaderName = null;
		
		
		while (ir.hasNext()) {
			// 팀원 수, 팀장 출력
			Entry<String, ArrayList<MemberVO>> entry = ir.next();
			teamName = entry.getKey();
			teamList = entry.getValue();
			teamCount = teamList.size();
			teamLeaderVO = teamList.get(0);
			teamLeaderName = teamLeaderVO.getName();
			System.out.printf("[%s(%d명) : %s]\n", teamName, teamCount, teamLeaderName);
			
			// 팀원 출력
			Iterator<MemberVO> ir2 = teamList.iterator();
			int seq = 1;
			
			if(ir2.hasNext()) ir2.next(); // 팀장 읽어와서 버리겠다
			
			while (ir2.hasNext()) {
				MemberVO memberVO = ir2.next();
				System.out.printf("  [%d] %s\n", seq++, memberVO.getName());
			}
		}
	}
}

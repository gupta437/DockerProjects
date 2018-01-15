import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class anagram {
	public static void main(String[] args) {
		String[] str = {"cat","dog","ogd","act","tca","ofg"};
		anagram1(str);
	}
	public static void anagram1(String[] str) {
		ArrayList<List<String>> output = new ArrayList<List<String>>();
		for(int i =0; i<str.length;i++) {
			ArrayList<String> op2 = new ArrayList<String>();
			op2.add(str[i]);
			for(int k=0; k<str.length; k++) {
				//ArrayList<String> op1 = new ArrayList<String>();
				
				if(k!=i) {
				String temp = str[k];
				Map<Character,Integer> map = new HashMap<Character,Integer>();
				for(int j=0;j<temp.length();j++) {
					map.put(temp.charAt(j),1);
				}
				int test =0;
				for(int d=0;d<str[i].length();d++) {
					if(!map.containsKey(str[i].charAt(d))) {
						break;
					}else if(map.containsKey(str[i].charAt(d)) && d == str[i].length()-1) {
						test =1;
					}
				}
				if(test ==1) {
					op2.add(str[k]);
				}
			}
			}
			output.add(op2);
		}
		ArrayList<List<String>> output1 = new ArrayList<List<String>>();
		List<String> op1 = new ArrayList<String>();
		op1 = output.get(0);
		output1.add(op1);
		for(int b=0;b<output.size();b++) {
			Collections.sort(output.get(b));
		}
		Map<List<String>,Integer> map1 = new HashMap<List<String>,Integer>();
		for(int b=0;b<output.size();b++) {
			List<String> op3 = new ArrayList<String>();
			op3 = output.get(b);
			map1.put(op3, 1);
		}
		for (List<String> name: map1.keySet()){
            System.out.println(name);
} 
	}
}

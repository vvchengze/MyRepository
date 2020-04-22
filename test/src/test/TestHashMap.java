package test;

import java.util.HashMap;
import java.util.Map.Entry;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<String, Object> maps = new HashMap<>();
		maps.put("张三", 20);
		maps.put("王五", 50);
		maps.put("李四", 30);
		for (Entry<String, Object> entry: maps.entrySet()) {
			System.out.println(entry.getKey()+"==++==="+entry.getValue());
			
		}
	}
}

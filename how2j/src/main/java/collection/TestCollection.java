package collection;

import java.util.HashMap;
import java.util.Set;

public class TestCollection {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		HashMap<String, String> temp = new HashMap<String, String>();
		map.put("adc", "物理英雄");
		map.put("apc", "魔法英雄");
		map.put("t", "坦克");

		System.out.println("初始化后的Map:");
		System.out.println(map);
		Set<String> keys = map.keySet();

		for (String key : keys) {
			String value = map.get(key);
			temp.put(value, key);
		}
		map.clear();
		map.putAll(temp);

		System.out.println("反转后的Map:");
		System.out.println(map);
	}
}

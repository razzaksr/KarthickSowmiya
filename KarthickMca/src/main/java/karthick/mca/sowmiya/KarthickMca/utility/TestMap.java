package karthick.mca.sowmiya.KarthickMca.utility;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

/*
 * Map:
 * put,putAll
 * get(key)
 * 
 * containsKey
 * containsValue
 * 
 * remove(key)
 * 
 * keySet()>> set
 * values()>> collection
 */

public class TestMap 
{
	public static void main(String[] args) 
	{
		HashMap<Long, String> info=new HashMap<>();
		info.put(544192L, "Razak Mohamed");
		info.put(770635L, "Prakash");
		info.put(909178L, "Parvesh");
		info.put(307681L, "Victor");
		info.put(277563L, "Richard");
		info.put(349877L, "Muthukumarn");
		System.out.println(info);
		TreeMap<Long, String> data=new TreeMap<>();
		data.putAll(info);
		data.put(747878L, "Razak Mohamed");
		System.out.println(data);
		info.remove(544192L);
		System.out.println(data.containsKey(544192L));
		System.out.println(info.containsValue("Razak Mohamed"));
		System.out.println(data.get(544192L));
		Set<Long> number=data.keySet();
		Collection<String> names=info.values();
		System.out.println(number);
		System.out.println(names);
	}
}

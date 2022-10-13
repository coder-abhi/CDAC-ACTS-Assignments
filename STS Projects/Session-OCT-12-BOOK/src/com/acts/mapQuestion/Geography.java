package com.acts.mapQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Geography {

	public static void main(String[] args) {
		Map<String, Map<String, Map<String, ArrayList<String>>>> allData = new HashMap<>() {{
			put("Asia",new HashMap<>() {{
				put("India", new HashMap<>() {{
					put("Maharashtra",new ArrayList<>() {{
						add("Pune");
						add("Mumbai");
						add("Solapur");
					}});
					put("Gujarat", new ArrayList<>() {{
						add("Surat");
						add("Rajkot");
						add("Gandhinagar");
					}});
				}});
				put("Pakistan", new HashMap<>() {{
					put("Balochistan",new ArrayList<>() {{
						add("Quetta");
						add("Turbat");
						add("Khuzdar");
					}});
					put("Punjab", new ArrayList<>() {{
						add("Lahore");
						add("Faisalabad");
						add("Rawalpindi");
					}});
				}});
			}});
			put("Europe",new HashMap<>() {{
				put("Hungary", new HashMap<>() {{
					put("Northern Hungary",new ArrayList<>() {{
						add("Budapest");
						add("Debrecen");
						add("Szeged");
					}});
					put("Northern Great Plain ", new ArrayList<>() {{
						add("Surat");
						add("Rajkot");
						add("Gandhinagar");
					}});
				}});
				put("Austria", new HashMap<>() {{
					put("Vorarlberg ",new ArrayList<>() {{
						add("Dornbirn");
						add("Feldkirch");
						add("Bregenz");
					}});
					put("Tirol ", new ArrayList<>() {{
						add("Innsbruck");
						add("Kufstein");
						add("Telfs");
					}});
				}});
			}});
		}};
		
		System.out.println(allData.get("Asia").get("India").get("Maharashtra"));
	}

}

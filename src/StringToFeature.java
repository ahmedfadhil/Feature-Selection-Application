import java.util.LinkedList;
import java.util.List;


public class StringToFeature {
	public static List<FeatureInstance> stringToFeature(String str) {
		List<FeatureInstance> list = new LinkedList<FeatureInstance>();
		String[] lines =  str.split("\n");
		for (int i = 0; i < lines.length; i++) {
			//-1 3:1 11:1 14:1 19:1 39:1 42:1 55:1 64:1
			String[] tokens =  lines[i].split(" ");
			FeatureInstance instance = new FeatureInstance();
			if (tokens[0].equals("-1")) {
				instance.output =false;
				
			}
			else{
				instance.output=true;
			}
			
			for (int j = 1; j < tokens.length; j++) {
				
				String[] tkn = tokens[j].split(":");
				if (tkn[0].trim().equals("")) {
					continue;
					}
				int index =Integer.parseInt(tkn[0].trim());
				instance.features.put(index,true);
				
			}
			list.add(instance);			
		}
		
		return list;
	}
		  

}

import java.util.HashMap;
import java.util.List;

public class PMI {
	public static HashMap<Integer, Double> PMICheck(List<FeatureInstance> list) {
		// count how may times y==true
		// for each feature x count howmany times x happned whne y was true
		// count probability of y,
		// count the probbility for each y, x

		int yTrueIndex = 0;
		HashMap<Integer, Double> xProbIndex = new HashMap<>();
		HashMap<Integer, Integer> xTrueIndex = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).output) {

				yTrueIndex++;

			}

		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).output) {
				Object[] keys = (Object[]) list.get(i).features.keySet().toArray(new Integer[0]);
				for (int j = 0; j < keys.length; j++) {
					
					if (xTrueIndex.get(keys[j])==null) {
						xTrueIndex.put((Integer) keys[j], 1);
					}else {
						int temp = xTrueIndex.get(keys[j]);
						xTrueIndex.put((Integer) keys[j], temp+1);
					}
					
					
				}
			}

		}
		
		Integer[] keys = (Integer[]) xTrueIndex.keySet().toArray(new Integer[0]);
		for (int i = 0; i < keys.length; i++) {
			xProbIndex.put(keys[i],xTrueIndex.get(keys[i])/(double)yTrueIndex);
			
		}
		return xProbIndex;
		
	}
}
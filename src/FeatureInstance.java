import java.util.HashMap;
import java.util.Map;


public class FeatureInstance {
	boolean output;
	Map<Integer,Boolean> features;
	public FeatureInstance() {
		features =new HashMap<Integer,Boolean>();
		
	}
	public boolean isOutput() {
		return output;
	}
	public void setOutput(boolean output) {
		this.output = output;
	}
	public Map<Integer, Boolean> getFeatures() {
		return features;
	}
	public void setFeatures(Map<Integer, Boolean> features) {
		this.features = features;
	}
	
	public Boolean getFeature(int featureNo) {
		return features.get(featureNo);
	}

}

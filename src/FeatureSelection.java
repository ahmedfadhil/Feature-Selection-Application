import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;


public class FeatureSelection {
	
	public static void main(String[] args) throws IOException {
		String str =  FileIO.readFile("D:\\Lecture Notes\\eclipse\\feature selection application\\src\\dataset.txt",Charset.forName("UTF-8"));
		
	      List<FeatureInstance> lst =  StringToFeature.stringToFeature(str);
	      HashMap<Integer, Double> finalList=PMI.PMICheck(lst);
	 
	}

}

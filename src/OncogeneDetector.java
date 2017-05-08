import java.util.ArrayList;

public class OncogeneDetector {
	
public boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequences, String candidate) {
		double healthy = 0;
		double cancer = 0;
		for (int i = 0; i < healthySequences.size(); i++) {
			if (healthySequences.get(i).contains(candidate)) {
				healthy++;
			}
		}
		for (int i = 0; i < cancerSequences.size(); i++) {
			if (cancerSequences.get(i).contains(candidate)) {
				cancer++;
			}
		}
		System.out.println(healthy/(double)(healthySequences.size()));
		System.out.println(cancer/(double)cancerSequences.size());
		
		return healthy/healthySequences.size() < cancer/cancerSequences.size();
	}

}


//Copyright © 2017 by Delara Aryan
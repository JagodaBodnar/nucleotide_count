import java.util.HashMap;
import java.util.Map;

public class NucleotideCount {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> nucleotideMap = initilizeNucleotideMap();
        Map<String,Integer> countedNucleotides = countNucleotides(nucleotideMap,"AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC");
        System.out.printf("Counted nucleotides: %s%n", countedNucleotides);
    }

    private static Map<String,Integer>countNucleotides(Map<String,Integer> nucleotideMap, String code) throws Exception {
        String[] codeSplit = code.split("");
        for(int i=0; i < code.length(); i++){
            switch(codeSplit[i]){
                case"A" -> nucleotideMap.compute("A", (key,value)-> value +1);
                case"G" -> nucleotideMap.compute("G", (key,value)-> value +1);
                case"T" -> nucleotideMap.compute("T", (key,value)-> value +1);
                case"C" -> nucleotideMap.compute("C", (key,value)-> value +1);
                default -> throw new Exception("INVALID!");
            }
        }
        return nucleotideMap;
    }
    public static Map<String, Integer> initilizeNucleotideMap(){
        Map<String,Integer> nucleotideMap = new HashMap<>();
        nucleotideMap.put("A", 0);
        nucleotideMap.put("G", 0);
        nucleotideMap.put("T", 0);
        nucleotideMap.put("C", 0);
        return nucleotideMap;
    }
}

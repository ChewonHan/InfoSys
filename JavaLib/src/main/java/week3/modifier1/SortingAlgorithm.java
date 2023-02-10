package week3.modifier1;

public class SortingAlgorithm { // default modifier
    public String sort() {
        String result = sortAlgorithm();
        return result;
    }

    public String sortAlgorithm() { // cannot weaken the modifier. but can strengthen
        return "Bubble Sort";
    }
}

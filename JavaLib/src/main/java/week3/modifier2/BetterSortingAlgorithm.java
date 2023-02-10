package week3.modifier2;

import week3.modifier1.SortingAlgorithm;

public class BetterSortingAlgorithm extends SortingAlgorithm { // SortingAlgorithm() should be public constructor so that can call in this file
    public static void main(String[] args) {
        BetterSortingAlgorithm x = new BetterSortingAlgorithm();

        System.out.println(x.sort());
    }

    @Override
    public String sortAlgorithm() {
        return "Merge sort";
    }
}

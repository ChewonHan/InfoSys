package problemset2a;

import java.util.*;

class OctagonComparator implements Comparator<Octagon> {
    @Override
    public int compare(Octagon o1, Octagon o2) {
        if (o1.getSide() > o2.getSide())return 1;
        else if (o1.getSide() < o2.getSide()) return -1;
        else return 0;
    }
}

package MIDTERM.abstractClass;

public class smallClass extends bigClass{  // smallClass (subClass) inherits bigClass (superClass)

    smallClass(){
        super(); // this statement exits -> call yes-arg constructor, if not then no-arg constructor
    }

    private String hi = "HI";
    public String smol = "SMALL";

    @Override
    public String getEh() {
        System.out.println(hi);
        return super.getEh();
    }

    /**
     * Casting: Bigger class = new smaller (); -> implicit casting
     * Down-casting: super to sub: Smaller class = new bigger ();
     *
     * PROTECTED: can be accessed by any class in the same package,
     *      its subclasses, even if SUBclasses (not independent,  referring classes)
     *      are in the different package
     * -> private, default, protected, public
     *
     * subclass can't weaken the accessibility of a method
     * if the method is public in super -> public in sub
     * (CANNOT) method is private in super -> public in sub
     */
}

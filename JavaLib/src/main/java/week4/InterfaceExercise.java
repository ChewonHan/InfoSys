package week4;

// The framework diagram is on the slide

public class InterfaceExercise {
}
class Class1 implements Interface1{ }

class Class2 extends Class1 implements Interface2_1, Interface2_2{ }

interface Interface1 extends Interface1_1, Interface1_2{ }
// interface can have abstract only, but to execute, need something solid
// so can't implement (extends only)

interface Interface1_1{ }

interface Interface1_2{ }

interface Interface2_1{ }

interface Interface2_2{ }
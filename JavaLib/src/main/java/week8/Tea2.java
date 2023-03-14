package week8;

public class Tea2 {

    private boolean sugar;
    private boolean milk;
    private boolean ice;

    Tea2 ( TeaBuilder teaBuilder){
        this.sugar = teaBuilder.sugar;
        this.milk = teaBuilder.milk;
        this.ice = teaBuilder.ice;
    }

//    Tea2( boolean sugar, boolean milk, boolean ice){
//        this.sugar = sugar;
//        this.milk = milk;
//        this.ice = ice;
//    }

    static class TeaBuilder{
        /** has some internal fields as the outside class */
        private boolean sugar;
        private boolean milk;
        private boolean ice;

        TeaBuilder(){} // no-arg constructor

        /** setter for each field
         * returns the same instance of the Builder class
         * so that we can call it again with another setter*/
        public TeaBuilder setSugar(boolean sugar){
            this.sugar = sugar;
            return this;
        }

        public TeaBuilder setMilk(boolean milk){
            this.milk = milk;
            return this; // <-- return yourself
        }

        public TeaBuilder setIce (boolean ice){
            this.ice = ice;
            return this;
        }

        /** Once all setters are called,
         * this build() method creates the object */
        public Tea2 build(){
            return new Tea2(this);
        }
    }
}

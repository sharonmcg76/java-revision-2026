package org.example.sp2pastpaerjan23.q5;
//
//A good solution uses inheritance and makes
//WaterBody abstract, because hasFreshWater()
//cannot be implemented there.

public class Q5 {

    public abstract class WaterBody {
        private String name;

        public WaterBody(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public abstract boolean hasFreshWater();

        @Override
        public String toString() {
            return name;
        }
    }
    public class River extends WaterBody {
        private WaterBody flowsInto;

        public River(String name, WaterBody flowsInto) {
            super(name);
            this.flowsInto = flowsInto;
        }

        @Override
        public boolean hasFreshWater() {
            return true;
        }

        @Override
        public String toString() {
            return getName() + ", which flows into " + flowsInto;
        }
    }
    public class StillWater extends WaterBody {
        private boolean fresh;

        public StillWater(String name, boolean fresh) {
            super(name);
            this.fresh = fresh;
        }

        @Override
        public boolean hasFreshWater() {
            return fresh;
        }

        @Override
        public String toString() {
            if (fresh) {
                return getName() + ", with fresh water";
            } else {
                return getName() + ", with non-fresh water";
            }
        }
    }



//
//    Explanation:
//    WaterBody stores the shared name field and provides getName() and a basic toString().
//    hasFreshWater() is abstract because the superclass cannot determine the answer in general.
//    River always returns true for hasFreshWater().
//    StillWater returns the boolean passed to the constructor.
//    This design is brief, avoids repetition, and uses inheritance properly, which the question explicitly rewards.
//
}

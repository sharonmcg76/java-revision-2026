package org.example.sp2pastpaperjan25.q4MaxStepper;

//Need subclass MaxStepper that
// remembers the largest value reached before a reset.

public class q4 {
    public class MaxStepper extends Stepper {
        private int maxSteps;

        @Override
        public void step() {
            super.step();
            if (getNumSteps() > maxSteps) {
                maxSteps = getNumSteps();
            }
        }

        @Override
        public void reset() {
            super.reset();
        }

        @Override
        public String toString() {
            return super.toString() + " and the maximum was " + maxSteps;
        }
    }
}

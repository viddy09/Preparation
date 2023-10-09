package Builder;

public class Cycle {
    int number_of_tyres;
    CycleType cycleType;
    BrakeType brakeType;

    Cycle(Builder builder){
        if(builder.getCycleType() != CycleType.GEAR && builder.getCycleType() != CycleType.NON_GEAR){
            throw new IllegalArgumentException("Sorry Unsupported cycle type");
        }
        if(builder.getBrakeType() != BrakeType.NORMAL && builder.getBrakeType() != BrakeType.DISC_BRAKE){
            throw new IllegalArgumentException("Sorry Unsupported brake type");
        }
        if(builder.getNumberOfTyres() != 2 ){
            throw new IllegalArgumentException("Sorry Number of tyres should be 2");
        }
        this.number_of_tyres = builder.getNumberOfTyres();
        this.cycleType = builder.getCycleType();
        this.brakeType = builder.getBrakeType();
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    static class Builder{
        private int numberOfTyres;
        private CycleType cycleType;
        private BrakeType brakeType;

        public Builder setNumberOfTyres(int numberOfTyres) {
            this.numberOfTyres = numberOfTyres;
            return this;
        }

        public Builder setCycleType(CycleType cycleType) {
            this.cycleType = cycleType;
            return this;
        }

        public Builder setBrakeType(BrakeType brakeType) {
            this.brakeType = brakeType;
            return this;
        }

        public int getNumberOfTyres() {
            return numberOfTyres;
        }

        public CycleType getCycleType() {
            return cycleType;
        }

        public BrakeType getBrakeType() {
            return brakeType;
        }

        public Cycle build(){
            return new Cycle(this);
        }
    }

}

package Builder;

public class Client {

    public static void main(String[] args) {
        Cycle cycle = Cycle.getBuilder()
                            .setCycleType(CycleType.GEAR)
                            .setBrakeType(BrakeType.INVALID)
                            .setNumberOfTyres(2)
                        .build();

        System.out.println(cycle.number_of_tyres);

    }
}

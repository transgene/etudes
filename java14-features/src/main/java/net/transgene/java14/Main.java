package net.transgene.java14;

public class Main {

    public static final String BLOCK_1 = """
            BLOCK_1""";

    public static final String BLOCK_2 = """
BLOCK_2
            end""";

    public static final String BLOCK_3 = """
            BLOCK_3
                indented!
        indented in opposite direction!
            """;

    public static final String BLOCK_4 = """
                    BLOCK_4 is "neat"
                    But what about \"""?
            """;

    public static final String BLOCK_5 = """
                    BLOCK_5
""";

    public static void main(String[] args) {
        System.out.println(BLOCK_1);
        System.out.println(BLOCK_2);
        System.out.println(BLOCK_3);
        System.out.println(BLOCK_4);
        System.out.println(BLOCK_5);
        System.out.println("---------------------------");
        Day day = Day.WED;
        String result = switch (day) {
            case MON -> "This one is hard";
            case TUE, WED, THU -> "These are not so hard";
            case FRI -> "Finally!";
            case SAT, SUN -> "*sigh*";
            default -> "The heck was that?";
        };
        System.out.println(result);

        System.out.println();

        Object pair = new Pair(1, 2);
        if (pair instanceof Pair p) {
            System.out.println(p.first + "," + p.second);
        }
        System.out.println(pair);

        System.out.println();

        Pair ns = null;
        System.out.println(ns.first);
    }

    private enum Day {
       MON, TUE, WED, THU, FRI, SAT, SUN
    }

    private record Pair(int first, int second) {

        public Pair {
            if (first == second) {
                throw new IllegalArgumentException("You could use a plain variable for that!");
            }
        }
    }
}

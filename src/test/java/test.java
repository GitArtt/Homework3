public class test {

    private static final char HUMAN_DOT = 'X';
    private static final char AI_DOT = 0;
    private static int DOT_TO_WIN = 3;
    private static int SIZE = 4;
    private static char[][] map = new char[][]

            {
                    {0, 'X', 0, 'X'},
                    {0, 'X', 'X', 0},
                    {'X', 0, 'X', 0},
                    {'X', 0, 0, 'X'}
            };

    public static void main(String[] args) {
//        checkHor(HUMAN_DOT);
//        System.out.println("");
//        checkHor(AI_DOT);
//        System.out.println("");
//        checkVer(HUMAN_DOT);
//        System.out.println("");
//        checkVer(AI_DOT);
//        System.out.println("");
        checkDia(HUMAN_DOT);
//        System.out.println("");
//        checkDia(AI_DOT);

    }

    private static boolean checkHor(char DOT) {
        for (int i = 0; i < map.length; i++) {
            int count = 0;
            for (int j = 0; j < map.length; j++) {
                if (DOT == map[i][j]) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == DOT_TO_WIN) {
                    System.out.println("\nПобеда!");
                    return true;
                }
                System.out.print(count + " ");
            }
            System.out.println("");
        }
        return false;
    }

    private static boolean checkVer(char DOT) {
        for (int i = 0; i < map.length; i++) {
            int count = 0;
            for (int j = 0; j < map.length; j++) {
                if (DOT == map[j][i]) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == DOT_TO_WIN) {
                    System.out.println("\nПобеда!");
                    return true;
                }
                System.out.print(count + " ");
            }
            System.out.println("");
        }
        return false;
    }

    private static boolean checkDia(char DOT) {
        for (int i = 0; i < map.length; i++) {
            int count = 0;
            for (int j = 0; j < map.length; j++) {
                if (DOT == map[i][j]) {
                    count++;
                } else {
                    count = 0;
                }
                if (count == DOT_TO_WIN) {
                    System.out.println("\nПобеда!");
                    return true;
                }
                System.out.print(count + " ");
            }
            System.out.println("");
        }
        return false;
    }

}

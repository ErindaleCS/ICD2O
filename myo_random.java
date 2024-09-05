class myo_random {

    static double random(double seed) {
        final int modulus = 65536;
        final int multiplier = 25173;
        final int increment = 13849;

        seed = seed * multiplier + increment;
        seed = (seed % modulus) / modulus;

        return seed;
    }

    public static void main(String[] args) {
        int num = 0;
        int one, two, three, four, five, six, seven, eight, nine, ten;
        one = two = three = four = five = six = seven = eight = nine = ten = 0;
        for (int i = 1; i <= 10000; i++) {
            num = (int) (10 * random(System.nanoTime()/((double)i))) + 1;
            switch (num) {
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
                case 6:
                    six++;
                    break;
                case 7:
                    seven++;
                    break;
                case 8:
                    eight++;
                    break;
                case 9:
                    nine++;
                    break;
                case 10:
                    ten++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Frequency:");
        System.out.println("  1    2   3   4    5    6    7   8   9   10");
        System.out.printf("%d %d %d %d %d ", one, two, three, four, five);
        System.out.printf("%d %d %d %d %d\n", six, seven, eight, nine, ten);
    }
}

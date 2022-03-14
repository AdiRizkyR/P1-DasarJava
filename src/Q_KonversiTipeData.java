public class Q_KonversiTipeData {
    public static void main(String[] args) {
        long varLong = 1000000L;
        int varInt = 23456;
        varInt = (int) varLong;
        varLong = varInt;
        System.out.println("Nilai varlong = " + varLong);
        System.out.println("Nilai varint = " + varInt);
        char varChar = 'a';
        varChar = (char) (varInt+1);
        System.out.println("Nilai varChar = " + varChar);
        byte varByte = 127;
        varInt = varByte;
        System.out.println("Nilai varint (127) = " + varInt);
        short varShort = (short) varInt;
        System.out.println("Nilai varShort = " + varShort);
        double varDouble = 3.145256718992022;
        float varFloat = (float) varDouble;
        System.out.println("Nilai varDouble = " + varDouble);
        System.out.println("Nilai varFloat = " + varFloat);
    }
}

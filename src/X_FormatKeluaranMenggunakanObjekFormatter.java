import java.text.NumberFormat;

public class X_FormatKeluaranMenggunakanObjekFormatter {
    public static void main(String[] args) {
        double doubleVal = 1280.8/2.5;
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        NumberFormat currFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        String numberStr = numberFormat.format(doubleVal);
        String currStr = currFormatter.format(doubleVal);
        String percentStr = percentFormatter.format(doubleVal);
        System.out.println("double 1280.8/2.5 berformat number : " + numberStr);
        System.out.println("double 1280.8/2.5 berformat currency : " + currStr);
        System.out.println("double 1280.8/2.5 berformat percent : " + percentStr);
    }
}

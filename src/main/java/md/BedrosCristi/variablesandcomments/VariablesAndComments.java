package md.BedrosCristi.variablesandcomments;

public class VariablesAndComments {
    public static void main(String[] args) {
//        variabile primitive
        boolean falseBooleanVariable;
        boolean trueBooleanVariable;
        char firstCharFromAscii;
        char lastCharFromAscii;
        byte lowerLimitOfByteDataType;
        byte upperLimitOfByteDataType;
        short lowerLimitOfShortDataType;
        short upperLimitOfShortDataType;
        int lowerLimitOfIntDataType;
        int upperLimitOfIntDataType;
        long lowerLimitOfLongDataType;
        long upperLimitOfLongDataType;
        float lowerLimitOfFloatDataType;
        float upperLimitOfFloatDataType;
        double lowerLimitOfDoubleDataType;
        double upperLimitOfDoubleDataType;

//initializarea variabilelor
        falseBooleanVariable = false;
        trueBooleanVariable = true;
        firstCharFromAscii = 'a';
        lastCharFromAscii = 'Z';
        lowerLimitOfByteDataType = -128;
        upperLimitOfByteDataType = 127;
        lowerLimitOfShortDataType = -32768;
        upperLimitOfShortDataType = 32767;
        lowerLimitOfIntDataType = -2147483648;
        upperLimitOfIntDataType = 2147483647;
        lowerLimitOfLongDataType = -9223372036854775808L;
        upperLimitOfLongDataType = 9223372036854775807L;
        lowerLimitOfFloatDataType = -3.4E+38f;
        upperLimitOfFloatDataType = 3.4E+38f;
        lowerLimitOfDoubleDataType = -1.7E+308d;
        upperLimitOfDoubleDataType = 1.7E+305;

        System.out.println(lowerLimitOfByteDataType);
        System.out.println(firstCharFromAscii);
        System.out.println(upperLimitOfDoubleDataType);
        System.out.println(lowerLimitOfFloatDataType);
        System.out.println(upperLimitOfIntDataType);
        System.out.println(lowerLimitOfShortDataType);
    }

}

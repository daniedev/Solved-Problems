package basicproblems.hackerearth;

public class DigitCube {

    public long calculateCubeOfSumOfDigitsOfaNumberBasedOnRepetitionIndex(long number, long repetitionIndex) {
        long result = number;

        for (long i = 0; i < repetitionIndex; i++) {
            result = findCubeOfSumOfDigits(result);
        }

        return result;
    }

    public long findCubeOfSumOfDigits(long number) {
        long numberAfterRemovingUnitDigit = number;
        long sumOfDigits = 0;
        while (numberAfterRemovingUnitDigit != 0) {
            sumOfDigits += numberAfterRemovingUnitDigit % 10;
            numberAfterRemovingUnitDigit = numberAfterRemovingUnitDigit / 10;
        }
        return sumOfDigits * sumOfDigits * sumOfDigits;
    }
}

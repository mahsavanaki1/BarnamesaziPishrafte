package kareclassi;

public class CalculateDesign
{
    public static void main(String[] args)
    {

        System.out.println(CalculateFactory.buildCalculate(CalType.MINUS));
        System.out.println();
        System.out.println(CalculateFactory.buildCalculate(CalType.PLUS));

    }
}

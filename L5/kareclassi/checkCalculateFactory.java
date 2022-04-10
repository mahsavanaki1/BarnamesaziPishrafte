package kareclassi;

class checkCalculateFactory
{
    public static Calculate buildCalculate(CalType model)
    {
        Calculate cal = null;
        switch (model)
        {


            case MINUS:
                cal = new  clacminus(Location.check);
                break;

            case PLUS:
                cal = new clacplus(Location.check);
                break;

            default:
                break;

        }
        return cal;
    }
}

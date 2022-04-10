package kareclassi;

class CalculateFactory
{
    private CalculateFactory()
    {

    }
    public static Calculate buildCalculate(CalType type)
    {
        Calculate cal = null;
        Location location = Location.check;

        switch(location)
        {
            case check:
                cal = checkCalculateFactory.buildCalculate(type);
                break;

        }

        return cal;

    }
}

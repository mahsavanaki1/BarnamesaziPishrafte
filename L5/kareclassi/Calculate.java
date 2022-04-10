package kareclassi;


enum CalType
{
    MINUS, PLUS
}

abstract class Calculate
{
    Calculate(CalType model, Location location)
    {
        this.model = model;
        this.location = location;
    }

    abstract void construct();

    CalType model = null;
    Location location = null;

    CalType getModel()
    {
        return model;
    }

    void setModel(CalType model)
    {
        this.model = model;
    }

    Location getLocation()
    {
        return location;
    }

    void setLocation(Location location)
    {
        this.location = location;
    }

    @Override
    public String toString()
    {
        return "CalType - "+model + " located in "+location;
    }
}

class clacplus extends Calculate
{
    clacplus(Location location)
    {
        super(CalType.PLUS, location);
        construct();
    }
    @Override
    protected void construct()
    {
        System.out.println("Connecting to PLUS Calculate");
    }
}

class clacminus extends Calculate
{
    clacminus(Location location)
    {
        super(CalType.MINUS,location );
        construct();
    }

    @Override
    void construct()
    {
        System.out.println("Connecting to MINUS Calculate");
    }
}

enum Location
{
    check
}

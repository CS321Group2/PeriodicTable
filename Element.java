
package element;

/**
 *
 * @author Michael Hamilton
 */
public class Element 
{
    private final String discoveredBy;
    private final int discoverDate;
    private final int group;
    private final int period;
    private final char block;
    private final int atomicNumber;
    private final String stateAt20C;
    private final String electronConfig;
    private final double meltingPoint;
    private final double boilingPoint;
    private final double density;
    private final double relativeAtomicMass;
    private final String casNumber;
    
    Element(String discoveredBy, int discoverDate, int group,
            int period, char block, int atomicNumber, String stateAt20C, 
            String electronConfig, double meltingPoint, double boilingPoint, 
            double density, double relativeAtomicMass, String casNumber)
    {
        this.discoveredBy = discoveredBy;
        this.discoverDate = discoverDate;
        this.group = group;
        this.period = period;
        this.block = block;
        this.atomicNumber = atomicNumber;
        this.stateAt20C = stateAt20C;
        this.electronConfig = electronConfig;
        this.meltingPoint = meltingPoint;
        this.boilingPoint = boilingPoint;
        this.density = density;
        this.relativeAtomicMass = relativeAtomicMass;
        this.casNumber = casNumber;
    }
    
    public String getDiscoveredBy()
    {
        return discoveredBy;
    }
    public int getDiscoverDate()
    {
        return discoverDate;
    }
    public int getGroup()
    {
        return group;
    }
    public int getPeriod()
    {
        return period;
    }
    public char getBlock()
    {
        return block;
    }
    public int getAtomicNumber()
    {
        return atomicNumber;
    }
    public String getStateAt20()
    {
        return stateAt20C;
    }
    public String getElectronConfig()
    {
        return electronConfig;
    }
    public double getMeltingPoint()
    {
        return meltingPoint;
    }
    public double getBoilingPoint()
    {
        return boilingPoint;
    }
    public double getDensity()
    {
        return density;
    }
    public double getRelativeAtomicMass()
    {
        return relativeAtomicMass;
    }
    public String getCasNumber()
    {
        return casNumber;
    }
}

package de.unistuttgart.iste.sqa.pse.sheet11.homework.settler;
import java.util.HashSet;
import java.util.Set;

public abstract class Settler {

    public String name;
    public Position position;
    public Set<Resource> consumedResources;
    public Set<Resource> producedResources;

    public Settler(final String name, final Position position) {
        this.name = name;
        this.position = new Position(position.getLongitude(), position.getLatitude());
        this.consumedResources = new HashSet<>();
        this.producedResources = new HashSet<>();
    }
    /**
     * Settle the settler at the current position.
    */
    public abstract void settle();

}

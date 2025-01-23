package de.unistuttgart.iste.sqa.pse.sheet11.homework.settler;

public final class Grain extends Resource {
    final String name;
    final Position position;
    final ResourceType type;

    public Grain(final String name, final Position position, final ResourceType type) {
        this.name = name;
        this.position = new Position(position.getLongitude(), position.getLatitude());
        this.type = new ResourceType(type.getLabel());
    }
    /**
     * Get the name of the resource.
     * @return name of the resource.
     */
    public String getName() {
        return name;
    }
    /**
     * Get the position of the resource.
     * @return position of the resource.
    */
    public Position getPosition() {
        return position;
    }
    /**
     * Get the type of the resource.
     * @return type of the resource.
     */
    public ResourceType getType() {
        return type;
    }
}

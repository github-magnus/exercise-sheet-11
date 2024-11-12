package de.unistuttgart.iste.sqa.pse.sheet11.homework.settler;

/**
 *  Position of a Settler or Resource.
 *
 *  The Position is defined by longitude and latitude.
 */
public final class Position {
	private final long longitude;
	private final long latitude;

	public Position(final long longitude, final long latitude) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public long getLongitude() {
		return longitude;
	}

	public long getLatitude() {
		return latitude;
	}
}

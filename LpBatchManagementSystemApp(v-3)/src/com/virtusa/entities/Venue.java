package com.virtusa.entities;

public class Venue {
 	    private String venueId;
	    private String venueName;
	    private String capacity;
	    private String location;
		public String getVenueId() {
			return venueId;
		}
		public void setVenueId(String venueId) {
			this.venueId = venueId;
		}
		public String getVenueName() {
			return venueName;
		}
		public void setVenueName(String venueName) {
			this.venueName = venueName;
		}
		public String getCapacity() {
			return capacity;
		}
		public void setCapacity(String capacity) {
			this.capacity = capacity;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		@Override
		public String toString() {
			return "Venue [venueId=" + venueId + ", venueName=" + venueName + ", capacity=" + capacity + ", location="
					+ location + "]";
		}
	}

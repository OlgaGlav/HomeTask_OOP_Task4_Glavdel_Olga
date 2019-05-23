package by.htp.oop.train;

public class Train {
	private String destination;
	private int number;
	private int hour;
	private int minute;
	public int getNumber;
	
	public Train() {
		this.destination = "�����";
		this.number = 0;
		this.hour = 0;
		this.minute = 0;
	}

	public Train(int train, String destination, int hour, int minute) {
		this.destination = destination;
		this.number = train;
		this.hour = hour;
		this.minute = minute;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + number;
		result = result * prime + minute;
		result = result * prime + hour;
		result = result * prime + ((destination == null) ? 0 : destination.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (number != other.number)
			return false;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.contentEquals(other.destination))
			return false;
		return true;

	}

}

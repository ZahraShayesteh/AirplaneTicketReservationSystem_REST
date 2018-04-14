package ticketPackage;


public class Ticket {
	private int ticketID;
	private String ownerName;
	private String source;
	private String destination;
	private String flightDate;
	private int flightNumber;

	public int getTicketID() {
		return ticketID;
	}

	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightFDate(String flyDate) {
		this.flightDate = flyDate;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Ticket(int ID, String ownerName, String source, String destination, String flightDate, int flightNumber) {
		setTicketID(ID);
		this.ownerName = ownerName;
		this.source = source;
		this.destination = destination;
		this.flightDate = flightDate;
		this.flightNumber = flightNumber;
	}

	public Ticket(String ownerName, String source, String destination, String flightDate, int flightNumber) {
		this.ownerName = ownerName;
		this.source = source;
		this.destination = destination;
		this.flightDate = flightDate;
		this.flightNumber = flightNumber;
	}

	public Ticket() {

	}

}

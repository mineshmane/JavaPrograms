package commercialDataPro;

public class Customer {

	private String name;
	private int ibmShares;
	private int infosysShares;
	private int wiproShares;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%-15s %-20d %-20d %-20d\n", name, ibmShares, infosysShares, wiproShares));

		return sb.toString();
	}

	public Customer(String name) {
		this.name = name;
	}

	// for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// for share
	public int getIbmShares() {
		return ibmShares;
	}

	public void setIbmShares(int minesh) {
		this.ibmShares = minesh;
	}

	public int getInfosysShares() {
		return infosysShares;
	}

	public void setInfosysShares(int rahulShares) {
		this.infosysShares = rahulShares;
	}

	public int getWiproShares() {
		return wiproShares;
	}

	public void setWiproShares(int shrutiShares) {
		this.wiproShares = shrutiShares;
	}

}

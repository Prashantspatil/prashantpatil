package com.xworkz.access.things;

public class Android {
	
	private String gadget="mobile";
	private String type="smart phone";
	private String version="eleven";
	public double users;
	public int market;
	public String netWork;
	public double units;
	public boolean hang;
	public String nokia;
	public String vivo;
	public String oppo;
	
	public Android(double users, int market, String netWork, double units, boolean hang, String nokia, String vivo,
			String oppo) {
		super();
		this.users = users;
		this.market = market;
		this.netWork = netWork;
		this.units = units;
		this.hang = hang;
		this.nokia = nokia;
		this.vivo = vivo;
		this.oppo = oppo;
	}

	public String getGadget() {
		return gadget;
	}

	public void setGadget(String gadget) {
		this.gadget = gadget;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
}

package com.assignments.collection2;

import java.time.LocalDate;
import java.util.Arrays;

public class ProductionFacility {
	private int pfid;
	private String prod_fac_name;
	private String prod_fac_location;
	private int totalproduction_perday;
	private String itemnames[];
	private LocalDate prod_date;
	public int getPfid() {
		return pfid;
	}
	public void setPfid(int pfid) {
		this.pfid = pfid;
	}
	public String getProd_fac_name() {
		return prod_fac_name;
	}
	public void setProd_fac_name(String prod_fac_name) {
		this.prod_fac_name = prod_fac_name;
	}
	public String getProd_fac_location() {
		return prod_fac_location;
	}
	public void setProd_fac_location(String prod_fac_location) {
		this.prod_fac_location = prod_fac_location;
	}
	public int getTotalproduction_perday() {
		return totalproduction_perday;
	}
	public void setTotalproduction_perday(int totalproduction_perday) {
		this.totalproduction_perday = totalproduction_perday;
	}
	public String[] getItemnames() {
		return itemnames;
	}
	public void setItemnames(String[] itemnames) {
		this.itemnames = itemnames;
	}
	public LocalDate getProd_date() {
		return prod_date;
	}
	public void setProd_date(LocalDate prod_date) {
		this.prod_date = prod_date;
	}
	public ProductionFacility(int pfid, String prod_fac_name, String prod_fac_location, int totalproduction_perday,
			String[] itemnames, LocalDate prod_date) {
		super();
		this.pfid = pfid;
		this.prod_fac_name = prod_fac_name;
		this.prod_fac_location = prod_fac_location;
		this.totalproduction_perday = totalproduction_perday;
		this.itemnames = itemnames;
		this.prod_date = prod_date;
	}
	@Override
	public String toString() {
		return "ProductionFacility [pfid=" + pfid + ", prod_fac_name=" + prod_fac_name + ", prod_fac_location="
				+ prod_fac_location + ", totalproduction_perday=" + totalproduction_perday + ", itemnames="
				+ Arrays.toString(itemnames) + ", prod_date=" + prod_date + "]";
	}
	
}

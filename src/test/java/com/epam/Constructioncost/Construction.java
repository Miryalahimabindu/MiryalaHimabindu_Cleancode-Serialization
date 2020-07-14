package com.epam.Constructioncost;

public class Construction {
	
	public double costForConstruction(String material,double area,boolean automation) {
		if(material.equals("St") && automation==false) {
			return 1200*area;
		}
		else if(material.equals("Ab") && automation==false) {
			return 1500*area;
		}
		else if(material.equals("Hi") && automation==false) {
			return 1800*area;
		}
		else {
			return 2500*area;
		}
	}
}

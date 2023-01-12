package com.xworkz.bean.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {

	@Autowired
	@Qualifier("pencilName")
	private String pencilName;
	@Autowired
	@Qualifier("pencilType")
	private String pencilType;
	@Autowired
	@Qualifier("pencilPrice")
	private int pencilPrice;
	@Autowired
	@Qualifier("pencilColor")
	private String pencilColor;
	@Autowired
	@Qualifier("pencilSharp")
	private boolean pencilSharp;
	@Autowired
	@Qualifier("pencilStolen")
	private boolean pencilStolen;

	public Pencil() {
System.out.println("ppppppppppppppppppppppppppppppppppppp");	}

	@Override
	public String toString() {
		return "Pencil [pencilName=" + pencilName + ", pencilType=" + pencilType + ", pencilPrice=" + pencilPrice
				+ ", pencilColor=" + pencilColor + ", pencilSharp=" + pencilSharp + ", pencilStolen=" + pencilStolen
				+ "]";
	}

}

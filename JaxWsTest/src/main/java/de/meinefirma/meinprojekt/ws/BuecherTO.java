package de.meinefirma.meinprojekt.ws;

import java.util.*;
import javax.xml.bind.annotation.*;

/** Rückgabe Transferobjekt */
@XmlRootElement
public class BuecherTO {

	@XmlElement(nillable = true)
	private List<BuchDO> results = new ArrayList<BuchDO>();
	private String message;
	private Integer returncode;

	public String getMessage() {
		return message;
	}

	public List<BuchDO> getResults() {
		return results;
	}

	public Integer getReturncode() {
		return returncode;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setReturncode(Integer returncode) {
		this.returncode = returncode;
	}

}

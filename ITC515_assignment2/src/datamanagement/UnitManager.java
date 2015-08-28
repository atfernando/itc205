package datamanagement;
/**
 *
 * @author Akila
 */
//import libraries 
import java.util.List;
import org.jdom.*;

public class UnitManager {

	private static UnitManager self = null;

<<<<<<< HEAD
	private final UnitMap UM;
=======
	private UnitMap getUnitManager;
>>>>>>> origin/akila

	public static UnitManager UM() 
        {
		if (self == null) {
                self = new UnitManager();
            } 
            else {
            }
		return self;
	}

	private UnitManager() {
		getUnitManager = new UnitMap();
	}

	public IUnit getUnit(String uc) {
		IUnit iu = getUnitManager.get(uc);
		return iu != null ? iu : createUnit(uc);

	}

	private IUnit createUnit(String unitCode) {

		IUnit iu;

		for (Element el : (List<Element>) XMLManager.getXML().getDocument()
				.getRootElement().getChild("unitTable").getChildren("unit"))
			if (unitCode.equals(el.getAttributeValue("uid"))) {
				StudentUnitRecordList slist;

				slist = null;
				iu = new Unit(el.getAttributeValue("uid"),
						el.getAttributeValue("name"), Float.parseFloat(el.getAttributeValue("ps")), Float
								.parseFloat(el.getAttributeValue("cr")), Float.parseFloat(el.getAttributeValue("di")), Float
								.parseFloat(el.getAttributeValue("hd")), Float.parseFloat(el.getAttributeValue("ae")),
						Integer
								.parseInt(el.getAttributeValue("asg1wgt")), Integer.parseInt(el.getAttributeValue("asg2wgt")),
						Integer
								.parseInt(el.getAttributeValue("examwgt")), StudentUnitRecordManager
								.instance().getRecordsByUnit(unitCode));
				getUnitManager.put(iu.getUnitCode(), iu);
				return iu;
			}

		throw new RuntimeException("DBMD: createUnit : unit not in file");
	}

	public UnitMap getUnits() {

		UnitMap uM;
		IUnit iu;

		uM = new UnitMap();
		for (Element el : (List<Element>) XMLManager.getXML().getDocument()
				.getRootElement().getChild("unitTable").getChildren("unit")) {
			iu = new UnitProxy(el.getAttributeValue("uid"),
					el.getAttributeValue("name"));
			uM.put(iu.getUnitCode(), iu);
		} // unit maps are filled with PROXY units
		return uM;
	}

}

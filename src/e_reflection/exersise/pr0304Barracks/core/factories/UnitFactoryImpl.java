package e_reflection.exersise.pr0304Barracks.core.factories;

import e_reflection.exersise.pr0304Barracks.contracts.Unit;
import e_reflection.exersise.pr0304Barracks.contracts.UnitFactory;
import e_reflection.exersise.pr0304Barracks.models.units.AbstractUnit;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"f_reflection.exersise.pr0304Barracks.models.units.";

	@Override
	public Unit createUnit(String unitType) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		// TODO: implement for problem 3
		Class cl = Class.forName(UNITS_PACKAGE_NAME + unitType);
		Constructor<AbstractUnit> constructor = cl.getDeclaredConstructor();

		return constructor.newInstance();
	}
}

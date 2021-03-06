package e_reflection.exersise.pr0304Barracks.data;

import e_reflection.exersise.pr0304Barracks.contracts.Repository;
import e_reflection.exersise.pr0304Barracks.contracts.Unit;

import java.util.Map;
import java.util.TreeMap;

public class UnitRepository implements Repository {

	private Map<String, Integer> amountOfUnits;

	public UnitRepository() {
		this.amountOfUnits = new TreeMap<>();
	}

	public void addUnit(Unit unit) {
		String unitType = unit.getClass().getSimpleName();
		if (!this.amountOfUnits.containsKey(unitType)) {
			this.amountOfUnits.put(unitType, 0);
		}

		int newAmount = this.amountOfUnits.get(unitType) + 1;
		this.amountOfUnits.put(unitType, newAmount);
	}

	public String getStatistics() {
		StringBuilder statBuilder = new StringBuilder();
		for (Map.Entry<String, Integer> entry : amountOfUnits.entrySet()) {
			String formatedEntry =
					String.format("%s -> %d%n", entry.getKey(), entry.getValue());
			statBuilder.append(formatedEntry);
		}
		statBuilder.setLength(
				statBuilder.length() - System.lineSeparator().length());

		return statBuilder.toString();
	}

//	•	retire <UnitType> - All it has to do is remove a unit of the provided type from the repository.
//	o	If there are no such units currently in the repository print: "No such units in repository."
//	o	If there is such a unit currently in the repository, print: "<UnitType> retired!"

	public void removeUnit(String unitType) {
		if (!this.amountOfUnits.containsKey(unitType) || this.amountOfUnits.get(unitType) == 0) {
			throw new UnsupportedOperationException("No such units in repository.");
		}
		this.amountOfUnits.computeIfPresent(unitType,(k, v)-> v - 1);

	}
}

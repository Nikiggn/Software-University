package Not_Finished.MilitaryElite.Entities;

import Not_Finished.MilitaryElite.Interfaces.SpecialisedSoldier;

public class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
    }
}

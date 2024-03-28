package Not_Finished.MilitaryElite.Entities;

import Not_Finished.MilitaryElite.Interfaces.LieutenantGeneral;
import Not_Finished.MilitaryElite.Interfaces.Private;

public class LieutenantGeneralImpl extends  PrivateImpl implements LieutenantGeneral {


    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
    }

    @Override
    public void addPrivate(Private priv) {

    }
}

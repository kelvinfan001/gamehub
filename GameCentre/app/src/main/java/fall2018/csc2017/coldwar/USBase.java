package fall2018.csc2017.coldwar;

import fall2018.csc2017.slidingtiles.R;

public class USBase extends Agent {
    USBase(String owner){
        setCanMove(false);
        this.setOwner(owner);
    }

    @Override
    public int getPicture() {
        return R.drawable.capitol;
    }
}

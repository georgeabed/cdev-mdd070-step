package _6_state._99_exercice.state;

import _6_state._99_exercice.avecpattern.Watch;
import _6_state._99_exercice.avecpattern.WatchState;

public class EditHoursState implements WatchState {
    private Watch watch;

    public EditHoursState(Watch watch){
        this.watch = watch;
    }


    @Override
    public void clickButton1() {
        watch.changeState(new EditsMinutesState(watch));
    }

    @Override
    public void clickButton2() {
        watch.incrementHours();
    }
}

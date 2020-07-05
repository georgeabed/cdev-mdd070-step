package _6_state._99_exercice.state;


import _6_state._99_exercice.avecpattern.Watch;
import _6_state._99_exercice.avecpattern.WatchState;

public class ShowState implements WatchState {
    private Watch watch;

    public ShowState(Watch watch){
        this.watch = watch;
    }

    @Override
    public void clickButton1() {
        watch.changeState(new EditHoursState(watch));
    }

    @Override
    public void clickButton2() {

    }
}

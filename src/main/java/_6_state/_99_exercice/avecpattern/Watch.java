package _6_state._99_exercice.avecpattern;

import _6_state._99_exercice.State;
import _6_state._99_exercice.state.ShowState;

public class Watch implements WatchState {
    private int hours = 0;
    private int minutes = 0;

    private WatchState state = new ShowState(this);

    public void incrementHours() {
        hours++;
    }

    public void incrementMinutes() {
        minutes++;
    }

    public void showTime() {
        System.out.println(hours + ":" + minutes);
    }

    public void clickButton1() {
        state.clickButton1();
    }

    public void clickButton2() {
        state.clickButton2();
    }

    public void changeState(WatchState state) {
        this.state = state;
    }
}

public interface ITimerPizza {
    public void start();
    public void stop();
    public void pause();
    public void resume();
    public void reset();
    public void setTimer(int seconds);
    public int getTimer();
    public <ITimerListener> void setTimerListener(ITimerListener listener);
    public <ITimerListener> void removeTimerListener(ITimerListener listener);
    public void notifyTimerListener();
}

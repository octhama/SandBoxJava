public interface ITimerPizza {
    public void demarrerLaCuisson();
    public void arreterLaCuisson();
    public void pause();
    public void reprendreLaCuisson();
    public void annulerLaCuisson();
    public void setTimer(int seconds);
    public int getTimer();
}

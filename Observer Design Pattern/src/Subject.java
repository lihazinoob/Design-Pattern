public abstract class Subject {
    public abstract void add(Observer observer);
    public abstract void remove(Observer observer);
    public abstract void notified();
}

package Behaviors;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
    void unsubscribe();
}

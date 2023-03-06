package oop_lab3;

import java.util.ArrayList;

public class Person5 extends Person4 {

    Person5() {
    }

    Person5(String fio, int year, String inn) {
        super(fio, year, inn);
    }

    private ArrayList<Person5> friends = new ArrayList();

    public ArrayList<Person5> getFriends() {
        return friends;
    }
    
    private Body body = new Body();

    public Body getBody() {
        return body;
    }

    class Body {

        private float temperature;
        private String pressure;

        public float getTemperature() {
            return temperature;
        }

        public void setTemperature(float temperature) {
            this.temperature = temperature;
        }

        public String getPressure() {
            return pressure;
        }

        public void setPressure(String pressure) {
            this.pressure = pressure;
        }

        @Override
        public String toString() {
            return "temperature=" + temperature + ", pressure=" + pressure;
        }
    }

    @Override
    public String toString() {
        return "Person5{" + super.toString() + ", " + body + '}';
    }

}

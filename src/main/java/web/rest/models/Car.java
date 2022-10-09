package web.rest.models;

import javax.persistence.*;

@Entity
public class Car {
    @Id
    @SequenceGenerator(name = "car_sequence", sequenceName = "car_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "car_sequence")
    private Long id;

    private String mark;
    private int power;
    private int speed;

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Car(String mark, int power, int speed) {
        this.mark = mark;
        this.power = power;
        this.speed = speed;
    }

    public Car() {
    }


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", power=" + power +
                ", speed=" + speed +
                '}';
    }
}

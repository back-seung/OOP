package main.java.member;public enum StateType {    LIVE("생존 상태", 10),    WEAK("부상 상태", 5),    DEAD("죽은 상태", 0);    private final String status;    private final int speed;    StateType(String status, int speed) {        this.status = status;        this.speed = speed;    }    public String getStatus() {        return status;    }    public int getSpeed() {        return speed;    }}
package lang.wrapper;

public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public int compareTo( int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        // String 이니까 int로 반환하게 바꿔줘야 함.
        return "" + value;
        // return String.valueOf(value);  //이 방법이 정석
    }
}

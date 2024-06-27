package lang.immutable.test;

public class ImmutableMyDateRef {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDateRef(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public ImmutableMyDateRef withYear(int newYear) {
      return new ImmutableMyDateRef(newYear, month, day);
    }


    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

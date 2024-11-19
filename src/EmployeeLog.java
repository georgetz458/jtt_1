public class EmployeeLog {
    private final String id;
    private final char in_house_outsourced;
    private final String date;
    private final float hours;
    private final int hourly_rate;
    private final int fixed_cost;

    public EmployeeLog(String id, char in_house_outsourced, String date, float hours, int hourly_rate, int fixedCost) {
        this.id = id;
        this.in_house_outsourced = in_house_outsourced;
        this.date = date;
        this.hours = hours;
        this.hourly_rate = hourly_rate;
        this.fixed_cost = fixedCost;
    }

    public String getId() {
        return id;
    }

    public char getIn_house_outsourced() {
        return in_house_outsourced;
    }

    public String getDate() {
        return date;
    }
    public float calculateCost(){
        return hours * hourly_rate + fixed_cost;
    }

    @Override
    public String toString() {
        return "ID: "+id+", In house / Outsource "+in_house_outsourced+", Date "+date+", Hours "+hours+", Hourly Rate "+hourly_rate+", Fixed Cost: "+fixed_cost;
    }
}

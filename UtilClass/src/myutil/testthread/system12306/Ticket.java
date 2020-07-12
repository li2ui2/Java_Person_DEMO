package myutil.testthread.system12306;

/**
 * @author LiWei
 * @date 2020/06/10 17:17
 */
public class Ticket {
    private String start;  // 起始站名
    private String end;  // 终点站名
    private Float price;  // 票价 Float相比于float更安全，可存null

    public Ticket() {}
    public Ticket(String start, String end, Float price) {
        this.start = start;
        this.end = end;
        this.price = price;
    }

    // 为了让打印输出时变得方便，需要重写toString方法
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        builder.append(this.start);
        builder.append("--->");
        builder.append(this.end);
        builder.append(": ");
        builder.append(this.price);
        builder.append("]");
        return builder.toString();
    }


    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}

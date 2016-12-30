/**
 * Created by worhol on 12/27/16.
 */
public final class Goods
{
    private int good_id;
    private String good_name;
    private int good_num;
    private double good_price;

    public int getGood_id() {
        return good_id;
    }

    public void setGood_id(int good_id) {
        this.good_id = good_id;
    }

    public String getGood_name() {
        return good_name;
    }

    public void setGood_name(String good_name) {
        this.good_name = good_name;
    }

    public int getGood_num() {
        return good_num;
    }

    public void setGood_num(int good_num) {
        this.good_num = good_num;
    }

    public double getGood_price() {
        return good_price;
    }

    public void setGood_price(double good_price) {
        this.good_price = good_price;
    }

    public Goods(String good_name, double good_price, int good_num)
    {
        this.good_name = good_name;
        this.good_price = good_price;
        this.good_num = good_num;
    }

    public Goods(int good_id, String good_name, double good_price, int good_num)
    {
        this.good_id = good_id;
        this.good_name = good_name;
        this.good_price = good_price;
        this.good_num = good_num;
    }

    public Goods(int good_id, int good_num)
    {
        this.good_num = good_num;
        this.good_id = good_id;
    }

    public Goods(int good_id, double good_price)
    {
        this.good_price = good_price;
        this.good_id = good_id;
    }

    public Goods(int good_id, String good_name)
    {
        this.good_id = good_id;
        this.good_name = good_name;
    }
}

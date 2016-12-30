/**
 * Created by worhol on 12/27/16.
 */
public final class Sales
{
    private int good_id;
    private int sale_id;
    private int sale_num;

    private String good_name;
    private double good_price;
    private int good_num;
    private int all_sale_num;

    public int getGood_id() {
        return good_id;
    }

    public void setGood_id(int good_id) {
        this.good_id = good_id;
    }

    public int getSale_id() {
        return sale_id;
    }

    public void setSale_id(int sale_id) {
        this.sale_id = sale_id;
    }

    public int getSale_num() {
        return sale_num;
    }

    public void setSale_num(int sale_num) {
        this.sale_num = sale_num;
    }

    public String getGood_name() {
        return good_name;
    }

    public void setGood_name(String good_name) {
        this.good_name = good_name;
    }

    public double getGood_price() {
        return good_price;
    }

    public void setGood_price(double good_price) {
        this.good_price = good_price;
    }

    public int getGood_num() {
        return good_num;
    }

    public void setGood_num(int good_num) {
        this.good_num = good_num;
    }

    public int getAll_sale_num() {
        return all_sale_num;
    }

    public void setAll_sale_num(int all_sale_num) {
        this.all_sale_num = all_sale_num;
    }

    public Sales(int good_id,int sale_id, int sale_num)
    {
        this.good_id = good_id;
        this.sale_id = sale_id;
        this.sale_num = sale_num;
    }

    public Sales(String good_name,double good_price,int good_num,int all_sale_num)
    {
        this.good_name = good_name;
        this.good_price = good_price;
        this.good_num = good_num;
        this.all_sale_num = all_sale_num;
    }

}

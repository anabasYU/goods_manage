/**
 * Created by worhol on 12/27/16.
 */
public final class SaleMan
{
    private int sale_id;
    private String sale_name;
    private String sale_password;

    public int getSale_id() {
        return sale_id;
    }

    public void setSale_id(int sale_id) {
        this.sale_id = sale_id;
    }

    public String getSale_name() {
        return sale_name;
    }

    public void setSale_name(String sale_name) {
        this.sale_name = sale_name;
    }

    public String getSale_password() {
        return sale_password;
    }

    public void setSale_password(String sale_password) {
        this.sale_password = sale_password;
    }

    public SaleMan(int sale_id,String sale_password)
    {
        this.sale_id = sale_id;
        this.sale_password = sale_password;
    }

    public SaleMan(int sale_id,String sale_name,String sPassWord)
    {
        this.sale_id = sale_id;
        this.sale_name = sale_name;
        this.sale_password = sale_password;
    }

    public SaleMan(String sale_name, String sale_password)
    {
        this.sale_name = sale_name;
        this.sale_password = sale_password;
    }
}

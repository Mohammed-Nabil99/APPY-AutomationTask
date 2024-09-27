import org.testng.annotations.Test;

public class ProductsTests extends BaseTests{

    @Test
    public void testProductName(){
        var resultsPage=homePage.search("Monitor");
        System.out.println(resultsPage.getResultTxt(7));
        System.out.println(resultsPage.getPrice(7));

        System.out.println(resultsPage.getResultTxt(8));
        System.out.println(resultsPage.getPrice(8));

        System.out.println(resultsPage.getResultTxt(9));
        System.out.println(resultsPage.getPrice(9));

        System.out.println(resultsPage.getResultTxt(10));
        System.out.println(resultsPage.getPrice(10));

        System.out.println(resultsPage.getResultTxt(11));
        System.out.println(resultsPage.getPrice(11));

    }


}
